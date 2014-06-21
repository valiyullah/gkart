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

import com.liferay.sample.model.GKartItems;

/**
 * The persistence interface for the g kart items service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Valiyullah
 * @see GKartItemsPersistenceImpl
 * @see GKartItemsUtil
 * @generated
 */
public interface GKartItemsPersistence extends BasePersistence<GKartItems> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link GKartItemsUtil} to access the g kart items persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the g kart itemses where catId = &#63;.
	*
	* @param catId the cat ID
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId) throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByCatId_First(int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the first g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByCatId_First(int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByCatId_Last(int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the last g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByCatId_Last(int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.sample.model.GKartItems[] findByCatId_PrevAndNext(
		long itemId, int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Removes all the g kart itemses where catId = &#63; from the database.
	*
	* @param catId the cat ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByCatId(int catId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart itemses where catId = &#63;.
	*
	* @param catId the cat ID
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public int countByCatId(int catId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the g kart itemses where brandName = &#63;.
	*
	* @param brandName the brand name
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByBrandName_First(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the first g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByBrandName_First(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByBrandName_Last(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the last g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByBrandName_Last(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.sample.model.GKartItems[] findByBrandName_PrevAndNext(
		long itemId, java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Removes all the g kart itemses where brandName = &#63; from the database.
	*
	* @param brandName the brand name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByBrandName(java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart itemses where brandName = &#63;.
	*
	* @param brandName the brand name
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public int countByBrandName(java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the g kart itemses where itemName = &#63;.
	*
	* @param itemName the item name
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByItemName_First(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the first g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByItemName_First(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByItemName_Last(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the last g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByItemName_Last(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public com.liferay.sample.model.GKartItems[] findByItemName_PrevAndNext(
		long itemId, java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Removes all the g kart itemses where itemName = &#63; from the database.
	*
	* @param itemName the item name
	* @throws SystemException if a system exception occurred
	*/
	public void removeByItemName(java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart itemses where itemName = &#63;.
	*
	* @param itemName the item name
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public int countByItemName(java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the g kart items in the entity cache if it is enabled.
	*
	* @param gKartItems the g kart items
	*/
	public void cacheResult(com.liferay.sample.model.GKartItems gKartItems);

	/**
	* Caches the g kart itemses in the entity cache if it is enabled.
	*
	* @param gKartItemses the g kart itemses
	*/
	public void cacheResult(
		java.util.List<com.liferay.sample.model.GKartItems> gKartItemses);

	/**
	* Creates a new g kart items with the primary key. Does not add the g kart items to the database.
	*
	* @param itemId the primary key for the new g kart items
	* @return the new g kart items
	*/
	public com.liferay.sample.model.GKartItems create(long itemId);

	/**
	* Removes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items that was removed
	* @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems remove(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	public com.liferay.sample.model.GKartItems updateImpl(
		com.liferay.sample.model.GKartItems gKartItems)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the g kart items with the primary key or throws a {@link com.liferay.sample.NoSuchItemsException} if it could not be found.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems findByPrimaryKey(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException;

	/**
	* Returns the g kart items with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items, or <code>null</code> if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.sample.model.GKartItems fetchByPrimaryKey(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the g kart itemses.
	*
	* @return the g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.sample.model.GKartItems> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.liferay.sample.model.GKartItems> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the g kart itemses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of g kart itemses.
	*
	* @return the number of g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}