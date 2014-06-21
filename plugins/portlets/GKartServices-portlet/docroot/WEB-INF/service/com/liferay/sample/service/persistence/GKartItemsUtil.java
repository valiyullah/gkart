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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.liferay.sample.model.GKartItems;

import java.util.List;

/**
 * The persistence utility for the g kart items service. This utility wraps {@link GKartItemsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Valiyullah
 * @see GKartItemsPersistence
 * @see GKartItemsPersistenceImpl
 * @generated
 */
public class GKartItemsUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(GKartItems gKartItems) {
		getPersistence().clearCache(gKartItems);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<GKartItems> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<GKartItems> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<GKartItems> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static GKartItems update(GKartItems gKartItems)
		throws SystemException {
		return getPersistence().update(gKartItems);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static GKartItems update(GKartItems gKartItems,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(gKartItems, serviceContext);
	}

	/**
	* Returns all the g kart itemses where catId = &#63;.
	*
	* @param catId the cat ID
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCatId(catId);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCatId(catId, start, end);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByCatId(
		int catId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCatId(catId, start, end, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByCatId_First(
		int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().findByCatId_First(catId, orderByComparator);
	}

	/**
	* Returns the first g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByCatId_First(
		int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCatId_First(catId, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByCatId_Last(
		int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().findByCatId_Last(catId, orderByComparator);
	}

	/**
	* Returns the last g kart items in the ordered set where catId = &#63;.
	*
	* @param catId the cat ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByCatId_Last(
		int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByCatId_Last(catId, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems[] findByCatId_PrevAndNext(
		long itemId, int catId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence()
				   .findByCatId_PrevAndNext(itemId, catId, orderByComparator);
	}

	/**
	* Removes all the g kart itemses where catId = &#63; from the database.
	*
	* @param catId the cat ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCatId(int catId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCatId(catId);
	}

	/**
	* Returns the number of g kart itemses where catId = &#63;.
	*
	* @param catId the cat ID
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCatId(int catId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCatId(catId);
	}

	/**
	* Returns all the g kart itemses where brandName = &#63;.
	*
	* @param brandName the brand name
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBrandName(brandName);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByBrandName(brandName, start, end);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByBrandName(
		java.lang.String brandName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByBrandName(brandName, start, end, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByBrandName_First(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence()
				   .findByBrandName_First(brandName, orderByComparator);
	}

	/**
	* Returns the first g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByBrandName_First(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBrandName_First(brandName, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByBrandName_Last(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence()
				   .findByBrandName_Last(brandName, orderByComparator);
	}

	/**
	* Returns the last g kart items in the ordered set where brandName = &#63;.
	*
	* @param brandName the brand name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByBrandName_Last(
		java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByBrandName_Last(brandName, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems[] findByBrandName_PrevAndNext(
		long itemId, java.lang.String brandName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence()
				   .findByBrandName_PrevAndNext(itemId, brandName,
			orderByComparator);
	}

	/**
	* Removes all the g kart itemses where brandName = &#63; from the database.
	*
	* @param brandName the brand name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByBrandName(java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByBrandName(brandName);
	}

	/**
	* Returns the number of g kart itemses where brandName = &#63;.
	*
	* @param brandName the brand name
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByBrandName(java.lang.String brandName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByBrandName(brandName);
	}

	/**
	* Returns all the g kart itemses where itemName = &#63;.
	*
	* @param itemName the item name
	* @return the matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByItemName(itemName);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByItemName(itemName, start, end);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findByItemName(
		java.lang.String itemName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByItemName(itemName, start, end, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByItemName_First(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().findByItemName_First(itemName, orderByComparator);
	}

	/**
	* Returns the first g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByItemName_First(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByItemName_First(itemName, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems findByItemName_Last(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().findByItemName_Last(itemName, orderByComparator);
	}

	/**
	* Returns the last g kart items in the ordered set where itemName = &#63;.
	*
	* @param itemName the item name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching g kart items, or <code>null</code> if a matching g kart items could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByItemName_Last(
		java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByItemName_Last(itemName, orderByComparator);
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
	public static com.liferay.sample.model.GKartItems[] findByItemName_PrevAndNext(
		long itemId, java.lang.String itemName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence()
				   .findByItemName_PrevAndNext(itemId, itemName,
			orderByComparator);
	}

	/**
	* Removes all the g kart itemses where itemName = &#63; from the database.
	*
	* @param itemName the item name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByItemName(java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByItemName(itemName);
	}

	/**
	* Returns the number of g kart itemses where itemName = &#63;.
	*
	* @param itemName the item name
	* @return the number of matching g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static int countByItemName(java.lang.String itemName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByItemName(itemName);
	}

	/**
	* Caches the g kart items in the entity cache if it is enabled.
	*
	* @param gKartItems the g kart items
	*/
	public static void cacheResult(
		com.liferay.sample.model.GKartItems gKartItems) {
		getPersistence().cacheResult(gKartItems);
	}

	/**
	* Caches the g kart itemses in the entity cache if it is enabled.
	*
	* @param gKartItemses the g kart itemses
	*/
	public static void cacheResult(
		java.util.List<com.liferay.sample.model.GKartItems> gKartItemses) {
		getPersistence().cacheResult(gKartItemses);
	}

	/**
	* Creates a new g kart items with the primary key. Does not add the g kart items to the database.
	*
	* @param itemId the primary key for the new g kart items
	* @return the new g kart items
	*/
	public static com.liferay.sample.model.GKartItems create(long itemId) {
		return getPersistence().create(itemId);
	}

	/**
	* Removes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items that was removed
	* @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems remove(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().remove(itemId);
	}

	public static com.liferay.sample.model.GKartItems updateImpl(
		com.liferay.sample.model.GKartItems gKartItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(gKartItems);
	}

	/**
	* Returns the g kart items with the primary key or throws a {@link com.liferay.sample.NoSuchItemsException} if it could not be found.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items
	* @throws com.liferay.sample.NoSuchItemsException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems findByPrimaryKey(
		long itemId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.sample.NoSuchItemsException {
		return getPersistence().findByPrimaryKey(itemId);
	}

	/**
	* Returns the g kart items with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items, or <code>null</code> if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.sample.model.GKartItems fetchByPrimaryKey(
		long itemId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(itemId);
	}

	/**
	* Returns all the g kart itemses.
	*
	* @return the g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.sample.model.GKartItems> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.liferay.sample.model.GKartItems> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the g kart itemses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of g kart itemses.
	*
	* @return the number of g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static GKartItemsPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (GKartItemsPersistence)PortletBeanLocatorUtil.locate(com.liferay.sample.service.ClpSerializer.getServletContextName(),
					GKartItemsPersistence.class.getName());

			ReferenceRegistry.registerReference(GKartItemsUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(GKartItemsPersistence persistence) {
	}

	private static GKartItemsPersistence _persistence;
}