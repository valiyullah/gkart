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
 * Provides a wrapper for {@link GKartCategoryLocalService}.
 *
 * @author Valiyullah
 * @see GKartCategoryLocalService
 * @generated
 */
public class GKartCategoryLocalServiceWrapper
	implements GKartCategoryLocalService,
		ServiceWrapper<GKartCategoryLocalService> {
	public GKartCategoryLocalServiceWrapper(
		GKartCategoryLocalService gKartCategoryLocalService) {
		_gKartCategoryLocalService = gKartCategoryLocalService;
	}

	/**
	* Adds the g kart category to the database. Also notifies the appropriate model listeners.
	*
	* @param gKartCategory the g kart category
	* @return the g kart category that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartCategory addGKartCategory(
		com.liferay.sample.model.GKartCategory gKartCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.addGKartCategory(gKartCategory);
	}

	/**
	* Creates a new g kart category with the primary key. Does not add the g kart category to the database.
	*
	* @param catId the primary key for the new g kart category
	* @return the new g kart category
	*/
	@Override
	public com.liferay.sample.model.GKartCategory createGKartCategory(
		long catId) {
		return _gKartCategoryLocalService.createGKartCategory(catId);
	}

	/**
	* Deletes the g kart category with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param catId the primary key of the g kart category
	* @return the g kart category that was removed
	* @throws PortalException if a g kart category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartCategory deleteGKartCategory(
		long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.deleteGKartCategory(catId);
	}

	/**
	* Deletes the g kart category from the database. Also notifies the appropriate model listeners.
	*
	* @param gKartCategory the g kart category
	* @return the g kart category that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartCategory deleteGKartCategory(
		com.liferay.sample.model.GKartCategory gKartCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.deleteGKartCategory(gKartCategory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _gKartCategoryLocalService.dynamicQuery();
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
		return _gKartCategoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _gKartCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.sample.model.impl.GKartCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _gKartCategoryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return _gKartCategoryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _gKartCategoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.sample.model.GKartCategory fetchGKartCategory(long catId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.fetchGKartCategory(catId);
	}

	/**
	* Returns the g kart category with the primary key.
	*
	* @param catId the primary key of the g kart category
	* @return the g kart category
	* @throws PortalException if a g kart category with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartCategory getGKartCategory(long catId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.getGKartCategory(catId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.liferay.sample.model.GKartCategory> getGKartCategories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.getGKartCategories(start, end);
	}

	/**
	* Returns the number of g kart categories.
	*
	* @return the number of g kart categories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getGKartCategoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.getGKartCategoriesCount();
	}

	/**
	* Updates the g kart category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param gKartCategory the g kart category
	* @return the g kart category that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.sample.model.GKartCategory updateGKartCategory(
		com.liferay.sample.model.GKartCategory gKartCategory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _gKartCategoryLocalService.updateGKartCategory(gKartCategory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _gKartCategoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_gKartCategoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _gKartCategoryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public GKartCategoryLocalService getWrappedGKartCategoryLocalService() {
		return _gKartCategoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedGKartCategoryLocalService(
		GKartCategoryLocalService gKartCategoryLocalService) {
		_gKartCategoryLocalService = gKartCategoryLocalService;
	}

	@Override
	public GKartCategoryLocalService getWrappedService() {
		return _gKartCategoryLocalService;
	}

	@Override
	public void setWrappedService(
		GKartCategoryLocalService gKartCategoryLocalService) {
		_gKartCategoryLocalService = gKartCategoryLocalService;
	}

	private GKartCategoryLocalService _gKartCategoryLocalService;
}