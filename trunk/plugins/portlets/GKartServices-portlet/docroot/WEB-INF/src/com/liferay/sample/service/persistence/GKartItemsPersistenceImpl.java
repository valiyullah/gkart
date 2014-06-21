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

import com.liferay.sample.NoSuchItemsException;
import com.liferay.sample.model.GKartItems;
import com.liferay.sample.model.impl.GKartItemsImpl;
import com.liferay.sample.model.impl.GKartItemsModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the g kart items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Valiyullah
 * @see GKartItemsPersistence
 * @see GKartItemsUtil
 * @generated
 */
public class GKartItemsPersistenceImpl extends BasePersistenceImpl<GKartItems>
	implements GKartItemsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link GKartItemsUtil} to access the g kart items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = GKartItemsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CATID = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCatId",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATID = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCatId",
			new String[] { Integer.class.getName() },
			GKartItemsModelImpl.CATID_COLUMN_BITMASK |
			GKartItemsModelImpl.ITEMNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CATID = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCatId",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the g kart itemses where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @return the matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByCatId(int catId) throws SystemException {
		return findByCatId(catId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the g kart itemses where catId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param catId the cat ID
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @return the range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByCatId(int catId, int start, int end)
		throws SystemException {
		return findByCatId(catId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart itemses where catId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param catId the cat ID
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByCatId(int catId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATID;
			finderArgs = new Object[] { catId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CATID;
			finderArgs = new Object[] { catId, start, end, orderByComparator };
		}

		List<GKartItems> list = (List<GKartItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GKartItems gKartItems : list) {
				if ((catId != gKartItems.getCatId())) {
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

			query.append(_SQL_SELECT_GKARTITEMS_WHERE);

			query.append(_FINDER_COLUMN_CATID_CATID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(catId);

				if (!pagination) {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartItems>(list);
				}
				else {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first g kart items in the ordered set where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByCatId_First(int catId,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByCatId_First(catId, orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("catId=");
		msg.append(catId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the first g kart items in the ordered set where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByCatId_First(int catId,
		OrderByComparator orderByComparator) throws SystemException {
		List<GKartItems> list = findByCatId(catId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last g kart items in the ordered set where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByCatId_Last(int catId,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByCatId_Last(catId, orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("catId=");
		msg.append(catId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the last g kart items in the ordered set where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByCatId_Last(int catId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByCatId(catId);

		if (count == 0) {
			return null;
		}

		List<GKartItems> list = findByCatId(catId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the g kart itemses before and after the current g kart items in the ordered set where catId = &#63;.
	 *
	 * @param itemId the primary key of the current g kart items
	 * @param catId the cat ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems[] findByCatId_PrevAndNext(long itemId, int catId,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			GKartItems[] array = new GKartItemsImpl[3];

			array[0] = getByCatId_PrevAndNext(session, gKartItems, catId,
					orderByComparator, true);

			array[1] = gKartItems;

			array[2] = getByCatId_PrevAndNext(session, gKartItems, catId,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GKartItems getByCatId_PrevAndNext(Session session,
		GKartItems gKartItems, int catId, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GKARTITEMS_WHERE);

		query.append(_FINDER_COLUMN_CATID_CATID_2);

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
			query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(catId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(gKartItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GKartItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the g kart itemses where catId = &#63; from the database.
	 *
	 * @param catId the cat ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByCatId(int catId) throws SystemException {
		for (GKartItems gKartItems : findByCatId(catId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(gKartItems);
		}
	}

	/**
	 * Returns the number of g kart itemses where catId = &#63;.
	 *
	 * @param catId the cat ID
	 * @return the number of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByCatId(int catId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CATID;

		Object[] finderArgs = new Object[] { catId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GKARTITEMS_WHERE);

			query.append(_FINDER_COLUMN_CATID_CATID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(catId);

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

	private static final String _FINDER_COLUMN_CATID_CATID_2 = "gKartItems.catId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDNAME =
		new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBrandName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDNAME =
		new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBrandName",
			new String[] { String.class.getName() },
			GKartItemsModelImpl.BRANDNAME_COLUMN_BITMASK |
			GKartItemsModelImpl.ITEMNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_BRANDNAME = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBrandName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the g kart itemses where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @return the matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByBrandName(String brandName)
		throws SystemException {
		return findByBrandName(brandName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the g kart itemses where brandName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param brandName the brand name
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @return the range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByBrandName(String brandName, int start, int end)
		throws SystemException {
		return findByBrandName(brandName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart itemses where brandName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param brandName the brand name
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByBrandName(String brandName, int start,
		int end, OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDNAME;
			finderArgs = new Object[] { brandName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BRANDNAME;
			finderArgs = new Object[] { brandName, start, end, orderByComparator };
		}

		List<GKartItems> list = (List<GKartItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GKartItems gKartItems : list) {
				if (!Validator.equals(brandName, gKartItems.getBrandName())) {
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

			query.append(_SQL_SELECT_GKARTITEMS_WHERE);

			boolean bindBrandName = false;

			if (brandName == null) {
				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_1);
			}
			else if (brandName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_3);
			}
			else {
				bindBrandName = true;

				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBrandName) {
					qPos.add(brandName);
				}

				if (!pagination) {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartItems>(list);
				}
				else {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first g kart items in the ordered set where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByBrandName_First(String brandName,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByBrandName_First(brandName,
				orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("brandName=");
		msg.append(brandName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the first g kart items in the ordered set where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByBrandName_First(String brandName,
		OrderByComparator orderByComparator) throws SystemException {
		List<GKartItems> list = findByBrandName(brandName, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last g kart items in the ordered set where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByBrandName_Last(String brandName,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByBrandName_Last(brandName,
				orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("brandName=");
		msg.append(brandName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the last g kart items in the ordered set where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByBrandName_Last(String brandName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByBrandName(brandName);

		if (count == 0) {
			return null;
		}

		List<GKartItems> list = findByBrandName(brandName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the g kart itemses before and after the current g kart items in the ordered set where brandName = &#63;.
	 *
	 * @param itemId the primary key of the current g kart items
	 * @param brandName the brand name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems[] findByBrandName_PrevAndNext(long itemId,
		String brandName, OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			GKartItems[] array = new GKartItemsImpl[3];

			array[0] = getByBrandName_PrevAndNext(session, gKartItems,
					brandName, orderByComparator, true);

			array[1] = gKartItems;

			array[2] = getByBrandName_PrevAndNext(session, gKartItems,
					brandName, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GKartItems getByBrandName_PrevAndNext(Session session,
		GKartItems gKartItems, String brandName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GKARTITEMS_WHERE);

		boolean bindBrandName = false;

		if (brandName == null) {
			query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_1);
		}
		else if (brandName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_3);
		}
		else {
			bindBrandName = true;

			query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_2);
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
			query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindBrandName) {
			qPos.add(brandName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(gKartItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GKartItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the g kart itemses where brandName = &#63; from the database.
	 *
	 * @param brandName the brand name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByBrandName(String brandName) throws SystemException {
		for (GKartItems gKartItems : findByBrandName(brandName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(gKartItems);
		}
	}

	/**
	 * Returns the number of g kart itemses where brandName = &#63;.
	 *
	 * @param brandName the brand name
	 * @return the number of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByBrandName(String brandName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_BRANDNAME;

		Object[] finderArgs = new Object[] { brandName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GKARTITEMS_WHERE);

			boolean bindBrandName = false;

			if (brandName == null) {
				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_1);
			}
			else if (brandName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_3);
			}
			else {
				bindBrandName = true;

				query.append(_FINDER_COLUMN_BRANDNAME_BRANDNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindBrandName) {
					qPos.add(brandName);
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

	private static final String _FINDER_COLUMN_BRANDNAME_BRANDNAME_1 = "gKartItems.brandName IS NULL";
	private static final String _FINDER_COLUMN_BRANDNAME_BRANDNAME_2 = "gKartItems.brandName = ?";
	private static final String _FINDER_COLUMN_BRANDNAME_BRANDNAME_3 = "(gKartItems.brandName IS NULL OR gKartItems.brandName = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMNAME = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByItemName",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMNAME =
		new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, GKartItemsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByItemName",
			new String[] { String.class.getName() },
			GKartItemsModelImpl.ITEMNAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ITEMNAME = new FinderPath(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByItemName",
			new String[] { String.class.getName() });

	/**
	 * Returns all the g kart itemses where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @return the matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByItemName(String itemName)
		throws SystemException {
		return findByItemName(itemName, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the g kart itemses where itemName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param itemName the item name
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @return the range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByItemName(String itemName, int start, int end)
		throws SystemException {
		return findByItemName(itemName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart itemses where itemName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param itemName the item name
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findByItemName(String itemName, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMNAME;
			finderArgs = new Object[] { itemName };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ITEMNAME;
			finderArgs = new Object[] { itemName, start, end, orderByComparator };
		}

		List<GKartItems> list = (List<GKartItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (GKartItems gKartItems : list) {
				if (!Validator.equals(itemName, gKartItems.getItemName())) {
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

			query.append(_SQL_SELECT_GKARTITEMS_WHERE);

			boolean bindItemName = false;

			if (itemName == null) {
				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_1);
			}
			else if (itemName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_3);
			}
			else {
				bindItemName = true;

				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindItemName) {
					qPos.add(itemName);
				}

				if (!pagination) {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartItems>(list);
				}
				else {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first g kart items in the ordered set where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByItemName_First(String itemName,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByItemName_First(itemName,
				orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemName=");
		msg.append(itemName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the first g kart items in the ordered set where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByItemName_First(String itemName,
		OrderByComparator orderByComparator) throws SystemException {
		List<GKartItems> list = findByItemName(itemName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last g kart items in the ordered set where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByItemName_Last(String itemName,
		OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByItemName_Last(itemName, orderByComparator);

		if (gKartItems != null) {
			return gKartItems;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("itemName=");
		msg.append(itemName);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchItemsException(msg.toString());
	}

	/**
	 * Returns the last g kart items in the ordered set where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByItemName_Last(String itemName,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByItemName(itemName);

		if (count == 0) {
			return null;
		}

		List<GKartItems> list = findByItemName(itemName, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the g kart itemses before and after the current g kart items in the ordered set where itemName = &#63;.
	 *
	 * @param itemId the primary key of the current g kart items
	 * @param itemName the item name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems[] findByItemName_PrevAndNext(long itemId,
		String itemName, OrderByComparator orderByComparator)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = findByPrimaryKey(itemId);

		Session session = null;

		try {
			session = openSession();

			GKartItems[] array = new GKartItemsImpl[3];

			array[0] = getByItemName_PrevAndNext(session, gKartItems, itemName,
					orderByComparator, true);

			array[1] = gKartItems;

			array[2] = getByItemName_PrevAndNext(session, gKartItems, itemName,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected GKartItems getByItemName_PrevAndNext(Session session,
		GKartItems gKartItems, String itemName,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_GKARTITEMS_WHERE);

		boolean bindItemName = false;

		if (itemName == null) {
			query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_1);
		}
		else if (itemName.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_3);
		}
		else {
			bindItemName = true;

			query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_2);
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
			query.append(GKartItemsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindItemName) {
			qPos.add(itemName);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(gKartItems);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<GKartItems> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the g kart itemses where itemName = &#63; from the database.
	 *
	 * @param itemName the item name
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByItemName(String itemName) throws SystemException {
		for (GKartItems gKartItems : findByItemName(itemName,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(gKartItems);
		}
	}

	/**
	 * Returns the number of g kart itemses where itemName = &#63;.
	 *
	 * @param itemName the item name
	 * @return the number of matching g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByItemName(String itemName) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ITEMNAME;

		Object[] finderArgs = new Object[] { itemName };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_GKARTITEMS_WHERE);

			boolean bindItemName = false;

			if (itemName == null) {
				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_1);
			}
			else if (itemName.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_3);
			}
			else {
				bindItemName = true;

				query.append(_FINDER_COLUMN_ITEMNAME_ITEMNAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindItemName) {
					qPos.add(itemName);
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

	private static final String _FINDER_COLUMN_ITEMNAME_ITEMNAME_1 = "gKartItems.itemName IS NULL";
	private static final String _FINDER_COLUMN_ITEMNAME_ITEMNAME_2 = "gKartItems.itemName = ?";
	private static final String _FINDER_COLUMN_ITEMNAME_ITEMNAME_3 = "(gKartItems.itemName IS NULL OR gKartItems.itemName = '')";

	public GKartItemsPersistenceImpl() {
		setModelClass(GKartItems.class);
	}

	/**
	 * Caches the g kart items in the entity cache if it is enabled.
	 *
	 * @param gKartItems the g kart items
	 */
	@Override
	public void cacheResult(GKartItems gKartItems) {
		EntityCacheUtil.putResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsImpl.class, gKartItems.getPrimaryKey(), gKartItems);

		gKartItems.resetOriginalValues();
	}

	/**
	 * Caches the g kart itemses in the entity cache if it is enabled.
	 *
	 * @param gKartItemses the g kart itemses
	 */
	@Override
	public void cacheResult(List<GKartItems> gKartItemses) {
		for (GKartItems gKartItems : gKartItemses) {
			if (EntityCacheUtil.getResult(
						GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
						GKartItemsImpl.class, gKartItems.getPrimaryKey()) == null) {
				cacheResult(gKartItems);
			}
			else {
				gKartItems.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all g kart itemses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(GKartItemsImpl.class.getName());
		}

		EntityCacheUtil.clearCache(GKartItemsImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the g kart items.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(GKartItems gKartItems) {
		EntityCacheUtil.removeResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsImpl.class, gKartItems.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<GKartItems> gKartItemses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (GKartItems gKartItems : gKartItemses) {
			EntityCacheUtil.removeResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
				GKartItemsImpl.class, gKartItems.getPrimaryKey());
		}
	}

	/**
	 * Creates a new g kart items with the primary key. Does not add the g kart items to the database.
	 *
	 * @param itemId the primary key for the new g kart items
	 * @return the new g kart items
	 */
	@Override
	public GKartItems create(long itemId) {
		GKartItems gKartItems = new GKartItemsImpl();

		gKartItems.setNew(true);
		gKartItems.setPrimaryKey(itemId);

		return gKartItems;
	}

	/**
	 * Removes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the g kart items
	 * @return the g kart items that was removed
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems remove(long itemId)
		throws NoSuchItemsException, SystemException {
		return remove((Serializable)itemId);
	}

	/**
	 * Removes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the g kart items
	 * @return the g kart items that was removed
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems remove(Serializable primaryKey)
		throws NoSuchItemsException, SystemException {
		Session session = null;

		try {
			session = openSession();

			GKartItems gKartItems = (GKartItems)session.get(GKartItemsImpl.class,
					primaryKey);

			if (gKartItems == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(gKartItems);
		}
		catch (NoSuchItemsException nsee) {
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
	protected GKartItems removeImpl(GKartItems gKartItems)
		throws SystemException {
		gKartItems = toUnwrappedModel(gKartItems);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(gKartItems)) {
				gKartItems = (GKartItems)session.get(GKartItemsImpl.class,
						gKartItems.getPrimaryKeyObj());
			}

			if (gKartItems != null) {
				session.delete(gKartItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (gKartItems != null) {
			clearCache(gKartItems);
		}

		return gKartItems;
	}

	@Override
	public GKartItems updateImpl(com.liferay.sample.model.GKartItems gKartItems)
		throws SystemException {
		gKartItems = toUnwrappedModel(gKartItems);

		boolean isNew = gKartItems.isNew();

		GKartItemsModelImpl gKartItemsModelImpl = (GKartItemsModelImpl)gKartItems;

		Session session = null;

		try {
			session = openSession();

			if (gKartItems.isNew()) {
				session.save(gKartItems);

				gKartItems.setNew(false);
			}
			else {
				session.merge(gKartItems);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !GKartItemsModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((gKartItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						gKartItemsModelImpl.getOriginalCatId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATID,
					args);

				args = new Object[] { gKartItemsModelImpl.getCatId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CATID, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CATID,
					args);
			}

			if ((gKartItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						gKartItemsModelImpl.getOriginalBrandName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDNAME,
					args);

				args = new Object[] { gKartItemsModelImpl.getBrandName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BRANDNAME,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BRANDNAME,
					args);
			}

			if ((gKartItemsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMNAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						gKartItemsModelImpl.getOriginalItemName()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ITEMNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMNAME,
					args);

				args = new Object[] { gKartItemsModelImpl.getItemName() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ITEMNAME, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ITEMNAME,
					args);
			}
		}

		EntityCacheUtil.putResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
			GKartItemsImpl.class, gKartItems.getPrimaryKey(), gKartItems);

		return gKartItems;
	}

	protected GKartItems toUnwrappedModel(GKartItems gKartItems) {
		if (gKartItems instanceof GKartItemsImpl) {
			return gKartItems;
		}

		GKartItemsImpl gKartItemsImpl = new GKartItemsImpl();

		gKartItemsImpl.setNew(gKartItems.isNew());
		gKartItemsImpl.setPrimaryKey(gKartItems.getPrimaryKey());

		gKartItemsImpl.setItemId(gKartItems.getItemId());
		gKartItemsImpl.setCatName(gKartItems.getCatName());
		gKartItemsImpl.setCatId(gKartItems.getCatId());
		gKartItemsImpl.setItemName(gKartItems.getItemName());
		gKartItemsImpl.setItemDesc(gKartItems.getItemDesc());
		gKartItemsImpl.setBrandName(gKartItems.getBrandName());
		gKartItemsImpl.setPrice(gKartItems.getPrice());
		gKartItemsImpl.setQuantity(gKartItems.getQuantity());
		gKartItemsImpl.setUnits(gKartItems.getUnits());
		gKartItemsImpl.setImage(gKartItems.getImage());
		gKartItemsImpl.setBrandDesc(gKartItems.getBrandDesc());
		gKartItemsImpl.setCreateDate(gKartItems.getCreateDate());
		gKartItemsImpl.setModifiedDate(gKartItems.getModifiedDate());

		return gKartItemsImpl;
	}

	/**
	 * Returns the g kart items with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the g kart items
	 * @return the g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByPrimaryKey(Serializable primaryKey)
		throws NoSuchItemsException, SystemException {
		GKartItems gKartItems = fetchByPrimaryKey(primaryKey);

		if (gKartItems == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchItemsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return gKartItems;
	}

	/**
	 * Returns the g kart items with the primary key or throws a {@link com.liferay.sample.NoSuchItemsException} if it could not be found.
	 *
	 * @param itemId the primary key of the g kart items
	 * @return the g kart items
	 * @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems findByPrimaryKey(long itemId)
		throws NoSuchItemsException, SystemException {
		return findByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns the g kart items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the g kart items
	 * @return the g kart items, or <code>null</code> if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		GKartItems gKartItems = (GKartItems)EntityCacheUtil.getResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
				GKartItemsImpl.class, primaryKey);

		if (gKartItems == _nullGKartItems) {
			return null;
		}

		if (gKartItems == null) {
			Session session = null;

			try {
				session = openSession();

				gKartItems = (GKartItems)session.get(GKartItemsImpl.class,
						primaryKey);

				if (gKartItems != null) {
					cacheResult(gKartItems);
				}
				else {
					EntityCacheUtil.putResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
						GKartItemsImpl.class, primaryKey, _nullGKartItems);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(GKartItemsModelImpl.ENTITY_CACHE_ENABLED,
					GKartItemsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return gKartItems;
	}

	/**
	 * Returns the g kart items with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the g kart items
	 * @return the g kart items, or <code>null</code> if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public GKartItems fetchByPrimaryKey(long itemId) throws SystemException {
		return fetchByPrimaryKey((Serializable)itemId);
	}

	/**
	 * Returns all the g kart itemses.
	 *
	 * @return the g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the g kart itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @return the range of g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the g kart itemses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of g kart itemses
	 * @param end the upper bound of the range of g kart itemses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<GKartItems> findAll(int start, int end,
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

		List<GKartItems> list = (List<GKartItems>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_GKARTITEMS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_GKARTITEMS;

				if (pagination) {
					sql = sql.concat(GKartItemsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<GKartItems>(list);
				}
				else {
					list = (List<GKartItems>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the g kart itemses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (GKartItems gKartItems : findAll()) {
			remove(gKartItems);
		}
	}

	/**
	 * Returns the number of g kart itemses.
	 *
	 * @return the number of g kart itemses
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

				Query q = session.createQuery(_SQL_COUNT_GKARTITEMS);

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
	 * Initializes the g kart items persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.sample.model.GKartItems")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<GKartItems>> listenersList = new ArrayList<ModelListener<GKartItems>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<GKartItems>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(GKartItemsImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_GKARTITEMS = "SELECT gKartItems FROM GKartItems gKartItems";
	private static final String _SQL_SELECT_GKARTITEMS_WHERE = "SELECT gKartItems FROM GKartItems gKartItems WHERE ";
	private static final String _SQL_COUNT_GKARTITEMS = "SELECT COUNT(gKartItems) FROM GKartItems gKartItems";
	private static final String _SQL_COUNT_GKARTITEMS_WHERE = "SELECT COUNT(gKartItems) FROM GKartItems gKartItems WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "gKartItems.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No GKartItems exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No GKartItems exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(GKartItemsPersistenceImpl.class);
	private static GKartItems _nullGKartItems = new GKartItemsImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<GKartItems> toCacheModel() {
				return _nullGKartItemsCacheModel;
			}
		};

	private static CacheModel<GKartItems> _nullGKartItemsCacheModel = new CacheModel<GKartItems>() {
			@Override
			public GKartItems toEntityModel() {
				return _nullGKartItems;
			}
		};
}