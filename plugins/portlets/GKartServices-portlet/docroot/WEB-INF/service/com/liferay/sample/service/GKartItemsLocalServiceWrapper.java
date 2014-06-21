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

package com.liferay.sample.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link GKartItemsLocalService}.
 *
 * @author Valiyullah
 * @see GKartItemsLocalService
 * @generated
 */
public class GKartItemsLocalServiceWrapper implements GKartItemsLocalService,
	ServiceWrapper<GKartItemsLocalService> {
	public GKartItemsLocalServiceWrapper(
		GKartItemsLocalService gKartItemsLocalService) {
		_gKartItemsLocalService = gKartItemsLocalService;
	}

	/**
	* Adds the g kart items to the database. Also notifies the appropriate model listeners.
	*
	* @param gKartItems the g kart items
	* @return the g kart items that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartItems addGKartItems(
		com.liferay.sample.model.GKartItems gKartItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.addGKartItems(gKartItems);
	}

	/**
	* Creates a new g kart items with the primary key. Does not add the g kart items to the database.
	*
	* @param itemId the primary key for the new g kart items
	* @return the new g kart items
	*/
	@Override
	public com.liferay.sample.model.GKartItems createGKartItems(long itemId) {
		return _gKartItemsLocalService.createGKartItems(itemId);
	}

	/**
	* Deletes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items that was removed
	* @throws PortalException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartItems deleteGKartItems(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.deleteGKartItems(itemId);
	}

	/**
	* Deletes the g kart items from the database. Also notifies the appropriate model listeners.
	*
	* @param gKartItems the g kart items
	* @return the g kart items that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartItems deleteGKartItems(
		com.liferay.sample.model.GKartItems gKartItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.deleteGKartItems(gKartItems);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gKartItemsLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartItemsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.sample.model.GKartItems fetchGKartItems(long itemId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.fetchGKartItems(itemId);
	}

	/**
	* Returns the g kart items with the primary key.
	*
	* @param itemId the primary key of the g kart items
	* @return the g kart items
	* @throws PortalException if a g kart items with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartItems getGKartItems(long itemId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.getGKartItems(itemId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.liferay.sample.model.GKartItems> getGKartItemses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.getGKartItemses(start, end);
	}

	/**
	* Returns the number of g kart itemses.
	*
	* @return the number of g kart itemses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGKartItemsesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.getGKartItemsesCount();
	}

	/**
	* Updates the g kart items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param gKartItems the g kart items
	* @return the g kart items that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartItems updateGKartItems(
		com.liferay.sample.model.GKartItems gKartItems)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartItemsLocalService.updateGKartItems(gKartItems);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _gKartItemsLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_gKartItemsLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _gKartItemsLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public GKartItemsLocalService getWrappedGKartItemsLocalService() {
		return _gKartItemsLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGKartItemsLocalService(
		GKartItemsLocalService gKartItemsLocalService) {
		_gKartItemsLocalService = gKartItemsLocalService;
	}

	@Override
	public GKartItemsLocalService getWrappedService() {
		return _gKartItemsLocalService;
	}

	@Override
	public void setWrappedService(GKartItemsLocalService gKartItemsLocalService) {
		_gKartItemsLocalService = gKartItemsLocalService;
	}

	private GKartItemsLocalService _gKartItemsLocalService;
}