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

import com.liferay.portal.service.persistence.BasePersistence;

import com.liferay.sample.model.GKartCategory;

/**
 * The persistence interface for the g kart category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Valiyullah
 * @see GKartCategoryPersistenceImpl
 * @see GKartCategoryUtil
 * @generated
 */
public interface GKartCategoryPersistence extends BasePersistence<GKartCategory> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GKartCategoryUtil} to access the g kart category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the g kart categories where catName = &#63;.
	*
	* @param catName the cat name
	* @return the matching g kart categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartCategory> findByCatName(
		java.lang.String catName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartCategory> findByCatName(
		java.lang.String catName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartCategory> findByCatName(
		java.lang.String catName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first g kart category in the ordered set where catName = &#63;.
	*
	* @param catName the cat name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart category
	* @throws com.liferay.sample.NoSuchCategoryException if a matching g kart category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory findByCatName_First(
		java.lang.String catName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchCategoryException;

	/**
	* Returns the first g kart category in the ordered set where catName = &#63;.
	*
	* @param catName the cat name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart category, or <code>null</code> if a matching g kart category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory fetchByCatName_First(
		java.lang.String catName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last g kart category in the ordered set where catName = &#63;.
	*
	* @param catName the cat name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart category
	* @throws com.liferay.sample.NoSuchCategoryException if a matching g kart category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory findByCatName_Last(
		java.lang.String catName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchCategoryException;

	/**
	* Returns the last g kart category in the ordered set where catName = &#63;.
	*
	* @param catName the cat name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart category, or <code>null</code> if a matching g kart category could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory fetchByCatName_Last(
		java.lang.String catName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.sample.model.GKartCategory[] findByCatName_PrevAndNext(
		long catId, java.lang.String catName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchCategoryException;

	/**
	* Removes all the g kart categories where catName = &#63; from the database.
	*
	* @param catName the cat name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCatName(java.lang.String catName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart categories where catName = &#63;.
	*
	* @param catName the cat name
	* @return the number of matching g kart categories
	* @throws SystemException if a system exception occurred
	*/
	public int countByCatName(java.lang.String catName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the g kart category in the entity cache if it is enabled.
	*
	* @param gKartCategory the g kart category
	*/
	public void cacheResult(
		com.liferay.sample.model.GKartCategory gKartCategory);

	/**
	* Caches the g kart categories in the entity cache if it is enabled.
	*
	* @param gKartCategories the g kart categories
	*/
	public void cacheResult(
		java.util.List<com.liferay.sample.model.GKartCategory> gKartCategories);

	/**
	* Creates a new g kart category with the primary key. Does not add the g kart category to the database.
	*
	* @param catId the primary key for the new g kart category
	* @return the new g kart category
	*/
	public com.liferay.sample.model.GKartCategory create(long catId);

	/**
	* Removes the g kart category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the g kart category
	* @return the g kart category that was removed
	* @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory remove(long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchCategoryException;

	public com.liferay.sample.model.GKartCategory updateImpl(
		com.liferay.sample.model.GKartCategory gKartCategory)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the g kart category with the primary key or throws a {@link com.liferay.sample.NoSuchCategoryException} if it could not be found.
	*
	* @param catId the primary key of the g kart category
	* @return the g kart category
	* @throws com.liferay.sample.NoSuchCategoryException if a g kart category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory findByPrimaryKey(long catId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchCategoryException;

	/**
	* Returns the g kart category with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param catId the primary key of the g kart category
	* @return the g kart category, or <code>null</code> if a g kart category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartCategory fetchByPrimaryKey(long catId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the g kart categories.
	*
	* @return the g kart categories
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartCategory> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartCategory> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartCategory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the g kart categories from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart categories.
	*
	* @return the number of g kart categories
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}