/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.sample.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.liferay.sample.NoSuchCategoryException;
import com.liferay.sample.model.GKartCategory;
import com.liferay.sample.model.impl.GKartCategoryImpl;
import com.liferay.sample.model.impl.GKartCategoryModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the g kart category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Valiyullah
 * @see GKartCategoryPersistence
 * @see GKartCategoryUtil
 * @generated
 */
public class GKartCategoryPersistenceImpl extends BasePersistenceImpl<GKartCategory>
	implements GKartCategoryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GKartCategoryUtil} to access the g kart category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GKartCategoryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED,
			GKartCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED,
			GKartCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATNAME = new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED,
			GKartCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByCatName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATNAME =
		new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED,
			GKartCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByCatName", new String[] { String.class.getName() },
			GKartCategoryModelImpl.CATNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATNAME = new FinderPath(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCatName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the g kart categories where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @return the matching g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findByCatName(String catName)
		throws SystemException {
		return findByCatName(catName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the g kart categories where catName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param catName the cat name
	 * @param start the lower bound of the range of g kart categories
	 * @param end the upper bound of the range of g kart categories (not inclusive)
	 * @return the range of matching g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findByCatName(String catName, int start, int end)
		throws SystemException {
		return findByCatName(catName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart categories where catName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param catName the cat name
	 * @param start the lower bound of the range of g kart categories
	 * @param end the upper bound of the range of g kart categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findByCatName(String catName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATNAME;
			finderArgs = new Object[] { catName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATNAME;
			finderArgs = new Object[] { catName, start, end, orderByComparator };
		}

		List<GKartCategory> list = (List<GKartCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GKartCategory gKartCategory : list) {
				if (!Validator.equals(catName, gKartCategory.getCatName())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_GKARTCATEGORY_WHERE);

			boolean bindCatName = false;

			if (catName == null) {
				query.append(_FINDER_COLUMN_CATNAME_CATNAME_1);
			}
			else if (catName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATNAME_CATNAME_3);
			}
			else {
				bindCatName = true;

				query.append(_FINDER_COLUMN_CATNAME_CATNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GKartCategoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCatName) {
					qPos.add(catName);
				}

				if (!pagination) {
					list = (List<GKartCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartCategory>(list);
				}
				else {
					list = (List<GKartCategory>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first g kart category in the ordered set where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart category
	 * @throws com.liferay.sample.NoSuchCategoryException if a matching g kart category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory findByCatName_First(String catName,
		OrderByComparator orderByComparator)
		throws NoSuchCategoryException, SystemException {
		GKartCategory gKartCategory = fetchByCatName_First(catName,
				orderByComparator);

		if (gKartCategory != null) {
			return gKartCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("catName=");
		msg.append(catName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCategoryException(msg.toString());
	}

	/**
	 * Returns the first g kart category in the ordered set where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart category, or <code>null</code> if a matching g kart category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory fetchByCatName_First(String catName,
		OrderByComparator orderByComparator) throws SystemException {
		List<GKartCategory> list = findByCatName(catName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last g kart category in the ordered set where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart category
	 * @throws com.liferay.sample.NoSuchCategoryException if a matching g kart category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory findByCatName_Last(String catName,
		OrderByComparator orderByComparator)
		throws NoSuchCategoryException, SystemException {
		GKartCategory gKartCategory = fetchByCatName_Last(catName,
				orderByComparator);

		if (gKartCategory != null) {
			return gKartCategory;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("catName=");
		msg.append(catName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCategoryException(msg.toString());
	}

	/**
	 * Returns the last g kart category in the ordered set where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart category, or <code>null</code> if a matching g kart category could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory fetchByCatName_Last(String catName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCatName(catName);

		if (count == 0) {
			return null;
		}

		List<GKartCategory> list = findByCatName(catName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the g kart categories before and after the current g kart category in the ordered set where catName = &#63;.
	 *
	 * @param catId the primary key of the current g kart category
	 * @param catName the cat name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next g kart category
	 * @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory[] findByCatName_PrevAndNext(long catId,
		String catName, OrderByComparator orderByComparator)
		throws NoSuchCategoryException, SystemException {
		GKartCategory gKartCategory = findByPrimaryKey(catId);

		Session session = null;

		try {
			session = openSession();

			GKartCategory[] array = new GKartCategoryImpl[3];

			array[0] = getByCatName_PrevAndNext(session, gKartCategory,
					catName, orderByComparator, true);

			array[1] = gKartCategory;

			array[2] = getByCatName_PrevAndNext(session, gKartCategory,
					catName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GKartCategory getByCatName_PrevAndNext(Session session,
		GKartCategory gKartCategory, String catName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GKARTCATEGORY_WHERE);

		boolean bindCatName = false;

		if (catName == null) {
			query.append(_FINDER_COLUMN_CATNAME_CATNAME_1);
		}
		else if (catName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CATNAME_CATNAME_3);
		}
		else {
			bindCatName = true;

			query.append(_FINDER_COLUMN_CATNAME_CATNAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(GKartCategoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindCatName) {
			qPos.add(catName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(gKartCategory);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GKartCategory> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the g kart categories where catName = &#63; from the database.
	 *
	 * @param catName the cat name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCatName(String catName) throws SystemException {
		for (GKartCategory gKartCategory : findByCatName(catName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(gKartCategory);
		}
	}

	/**
	 * Returns the number of g kart categories where catName = &#63;.
	 *
	 * @param catName the cat name
	 * @return the number of matching g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCatName(String catName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATNAME;

		Object[] finderArgs = new Object[] { catName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GKARTCATEGORY_WHERE);

			boolean bindCatName = false;

			if (catName == null) {
				query.append(_FINDER_COLUMN_CATNAME_CATNAME_1);
			}
			else if (catName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CATNAME_CATNAME_3);
			}
			else {
				bindCatName = true;

				query.append(_FINDER_COLUMN_CATNAME_CATNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindCatName) {
					qPos.add(catName);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CATNAME_CATNAME_1 = "gKartCategory.catName IS NULL";
	private static final String _FINDER_COLUMN_CATNAME_CATNAME_2 = "gKartCategory.catName = ?";
	private static final String _FINDER_COLUMN_CATNAME_CATNAME_3 = "(gKartCategory.catName IS NULL OR gKartCategory.catName = '')";

	public GKartCategoryPersistenceImpl() {
		setModelClass(GKartCategory.class);
	}

	/**
	 * Caches the g kart category in the entity cache if it is enabled.
	 *
	 * @param gKartCategory the g kart category
	 */
	@Override
	public void cacheResult(GKartCategory gKartCategory) {
		EntityCacheUtil.putResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryImpl.class, gKartCategory.getPrimaryKey(),
			gKartCategory);

		gKartCategory.resetOriginalValues();
	}

	/**
	 * Caches the g kart categories in the entity cache if it is enabled.
	 *
	 * @param gKartCategories the g kart categories
	 */
	@Override
	public void cacheResult(List<GKartCategory> gKartCategories) {
		for (GKartCategory gKartCategory : gKartCategories) {
			if (EntityCacheUtil.getResult(
						GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
						GKartCategoryImpl.class, gKartCategory.getPrimaryKey()) == null) {
				cacheResult(gKartCategory);
			}
			else {
				gKartCategory.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all g kart categories.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GKartCategoryImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GKartCategoryImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the g kart category.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GKartCategory gKartCategory) {
		EntityCacheUtil.removeResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryImpl.class, gKartCategory.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<GKartCategory> gKartCategories) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (GKartCategory gKartCategory : gKartCategories) {
			EntityCacheUtil.removeResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
				GKartCategoryImpl.class, gKartCategory.getPrimaryKey());
		}
	}

	/**
	 * Creates a new g kart category with the primary key. Does not add the g kart category to the database.
	 *
	 * @param catId the primary key for the new g kart category
	 * @return the new g kart category
	 */
	@Override
	public GKartCategory create(long catId) {
		GKartCategory gKartCategory = new GKartCategoryImpl();

		gKartCategory.setNew(true);
		gKartCategory.setPrimaryKey(catId);

		return gKartCategory;
	}

	/**
	 * Removes the g kart category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param catId the primary key of the g kart category
	 * @return the g kart category that was removed
	 * @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory remove(long catId)
		throws NoSuchCategoryException, SystemException {
		return remove((Serializable)catId);
	}

	/**
	 * Removes the g kart category with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the g kart category
	 * @return the g kart category that was removed
	 * @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory remove(Serializable primaryKey)
		throws NoSuchCategoryException, SystemException {
		Session session = null;

		try {
			session = openSession();

			GKartCategory gKartCategory = (GKartCategory)session.get(GKartCategoryImpl.class,
					primaryKey);

			if (gKartCategory == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(gKartCategory);
		}
		catch (NoSuchCategoryException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected GKartCategory removeImpl(GKartCategory gKartCategory)
		throws SystemException {
		gKartCategory = toUnwrappedModel(gKartCategory);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(gKartCategory)) {
				gKartCategory = (GKartCategory)session.get(GKartCategoryImpl.class,
						gKartCategory.getPrimaryKeyObj());
			}

			if (gKartCategory != null) {
				session.delete(gKartCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (gKartCategory != null) {
			clearCache(gKartCategory);
		}

		return gKartCategory;
	}

	@Override
	public GKartCategory updateImpl(
		com.liferay.sample.model.GKartCategory gKartCategory)
		throws SystemException {
		gKartCategory = toUnwrappedModel(gKartCategory);

		boolean isNew = gKartCategory.isNew();

		GKartCategoryModelImpl gKartCategoryModelImpl = (GKartCategoryModelImpl)gKartCategory;

		Session session = null;

		try {
			session = openSession();

			if (gKartCategory.isNew()) {
				session.save(gKartCategory);

				gKartCategory.setNew(false);
			}
			else {
				session.merge(gKartCategory);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !GKartCategoryModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((gKartCategoryModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						gKartCategoryModelImpl.getOriginalCatName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATNAME,
					args);

				args = new Object[] { gKartCategoryModelImpl.getCatName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
			GKartCategoryImpl.class, gKartCategory.getPrimaryKey(),
			gKartCategory);

		return gKartCategory;
	}

	protected GKartCategory toUnwrappedModel(GKartCategory gKartCategory) {
		if (gKartCategory instanceof GKartCategoryImpl) {
			return gKartCategory;
		}

		GKartCategoryImpl gKartCategoryImpl = new GKartCategoryImpl();

		gKartCategoryImpl.setNew(gKartCategory.isNew());
		gKartCategoryImpl.setPrimaryKey(gKartCategory.getPrimaryKey());

		gKartCategoryImpl.setCatId(gKartCategory.getCatId());
		gKartCategoryImpl.setCatName(gKartCategory.getCatName());
		gKartCategoryImpl.setSubcatdId(gKartCategory.getSubcatdId());
		gKartCategoryImpl.setSubcatName(gKartCategory.getSubcatName());
		gKartCategoryImpl.setCreateDate(gKartCategory.getCreateDate());
		gKartCategoryImpl.setModifiedDate(gKartCategory.getModifiedDate());

		return gKartCategoryImpl;
	}

	/**
	 * Returns the g kart category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the g kart category
	 * @return the g kart category
	 * @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCategoryException, SystemException {
		GKartCategory gKartCategory = fetchByPrimaryKey(primaryKey);

		if (gKartCategory == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return gKartCategory;
	}

	/**
	 * Returns the g kart category with the primary key or throws a {@link com.liferay.sample.NoSuchCategoryException} if it could not be found.
	 *
	 * @param catId the primary key of the g kart category
	 * @return the g kart category
	 * @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory findByPrimaryKey(long catId)
		throws NoSuchCategoryException, SystemException {
		return findByPrimaryKey((Serializable)catId);
	}

	/**
	 * Returns the g kart category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the g kart category
	 * @return the g kart category, or <code>null</code> if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		GKartCategory gKartCategory = (GKartCategory)EntityCacheUtil.getResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
				GKartCategoryImpl.class, primaryKey);

		if (gKartCategory == _nullGKartCategory) {
			return null;
		}

		if (gKartCategory == null) {
			Session session = null;

			try {
				session = openSession();

				gKartCategory = (GKartCategory)session.get(GKartCategoryImpl.class,
						primaryKey);

				if (gKartCategory != null) {
					cacheResult(gKartCategory);
				}
				else {
					EntityCacheUtil.putResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
						GKartCategoryImpl.class, primaryKey, _nullGKartCategory);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(GKartCategoryModelImpl.ENTITY_CACHE_ENABLED,
					GKartCategoryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return gKartCategory;
	}

	/**
	 * Returns the g kart category with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param catId the primary key of the g kart category
	 * @return the g kart category, or <code>null</code> if a g kart category with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartCategory fetchByPrimaryKey(long catId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)catId);
	}

	/**
	 * Returns all the g kart categories.
	 *
	 * @return the g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the g kart categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of g kart categories
	 * @param end the upper bound of the range of g kart categories (not inclusive)
	 * @return the range of g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart categories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of g kart categories
	 * @param end the upper bound of the range of g kart categories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartCategory> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<GKartCategory> list = (List<GKartCategory>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GKARTCATEGORY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GKARTCATEGORY;

				if (pagination) {
					sql = sql.concat(GKartCategoryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<GKartCategory>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartCategory>(list);
				}
				else {
					list = (List<GKartCategory>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the g kart categories from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (GKartCategory gKartCategory : findAll()) {
			remove(gKartCategory);
		}
	}

	/**
	 * Returns the number of g kart categories.
	 *
	 * @return the number of g kart categories
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_GKARTCATEGORY);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the g kart category persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.GKartCategory")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<GKartCategory>> listenersList = new ArrayList<ModelListener<GKartCategory>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<GKartCategory>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(GKartCategoryImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GKARTCATEGORY = "SELECT gKartCategory FROM GKartCategory gKartCategory";
	private static final String _SQL_SELECT_GKARTCATEGORY_WHERE = "SELECT gKartCategory FROM GKartCategory gKartCategory WHERE ";
	private static final String _SQL_COUNT_GKARTCATEGORY = "SELECT COUNT(gKartCategory) FROM GKartCategory gKartCategory";
	private static final String _SQL_COUNT_GKARTCATEGORY_WHERE = "SELECT COUNT(gKartCategory) FROM GKartCategory gKartCategory WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "gKartCategory.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No GKartCategory exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No GKartCategory exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GKartCategoryPersistenceImpl.class);
	private static GKartCategory _nullGKartCategory = new GKartCategoryImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<GKartCategory> toCacheModel() {
				return _nullGKartCategoryCacheModel;
			}
		};

	private static CacheModel<GKartCategory> _nullGKartCategoryCacheModel = new CacheModel<GKartCategory>() {
			@Override
			public GKartCategory toEntityModel() {
				return _nullGKartCategory;
			}
		};
}