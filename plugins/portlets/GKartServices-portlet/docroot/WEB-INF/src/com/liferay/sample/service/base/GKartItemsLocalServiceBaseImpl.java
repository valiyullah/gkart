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

package com.liferay.sample.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.sample.model.GKartItems;
import com.liferay.sample.service.GKartItemsLocalService;
import com.liferay.sample.service.persistence.GKartCategoryPersistence;
import com.liferay.sample.service.persistence.GKartItemsPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the g kart items local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.liferay.sample.service.impl.GKartItemsLocalServiceImpl}.
 * </p>
 *
 * @author Valiyullah
 * @see com.liferay.sample.service.impl.GKartItemsLocalServiceImpl
 * @see com.liferay.sample.service.GKartItemsLocalServiceUtil
 * @generated
 */
public abstract class GKartItemsLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements GKartItemsLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.liferay.sample.service.GKartItemsLocalServiceUtil} to access the g kart items local service.
	 */

	/**
	 * Adds the g kart items to the database. Also notifies the appropriate model listeners.
	 *
	 * @param gKartItems the g kart items
	 * @return the g kart items that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GKartItems addGKartItems(GKartItems gKartItems)
		throws SystemException {
		gKartItems.setNew(true);

		return gKartItemsPersistence.update(gKartItems);
	}

	/**
	 * Creates a new g kart items with the primary key. Does not add the g kart items to the database.
	 *
	 * @param itemId the primary key for the new g kart items
	 * @return the new g kart items
	 */
	@Override
	public GKartItems createGKartItems(long itemId) {
		return gKartItemsPersistence.create(itemId);
	}

	/**
	 * Deletes the g kart items with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the g kart items
	 * @return the g kart items that was removed
	 * @throws PortalException if a g kart items with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GKartItems deleteGKartItems(long itemId)
		throws PortalException, SystemException {
		return gKartItemsPersistence.remove(itemId);
	}

	/**
	 * Deletes the g kart items from the database. Also notifies the appropriate model listeners.
	 *
	 * @param gKartItems the g kart items
	 * @return the g kart items that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public GKartItems deleteGKartItems(GKartItems gKartItems)
		throws SystemException {
		return gKartItemsPersistence.remove(gKartItems);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(GKartItems.class,
			clazz.getClassLoader());
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
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return gKartItemsPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return gKartItemsPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return gKartItemsPersistence.findWithDynamicQuery(dynamicQuery, start,
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return gKartItemsPersistence.countWithDynamicQuery(dynamicQuery);
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
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return gKartItemsPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public GKartItems fetchGKartItems(long itemId) throws SystemException {
		return gKartItemsPersistence.fetchByPrimaryKey(itemId);
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
	public GKartItems getGKartItems(long itemId)
		throws PortalException, SystemException {
		return gKartItemsPersistence.findByPrimaryKey(itemId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return gKartItemsPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<GKartItems> getGKartItemses(int start, int end)
		throws SystemException {
		return gKartItemsPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of g kart itemses.
	 *
	 * @return the number of g kart itemses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getGKartItemsesCount() throws SystemException {
		return gKartItemsPersistence.countAll();
	}

	/**
	 * Updates the g kart items in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param gKartItems the g kart items
	 * @return the g kart items that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public GKartItems updateGKartItems(GKartItems gKartItems)
		throws SystemException {
		return gKartItemsPersistence.update(gKartItems);
	}

	/**
	 * Returns the g kart category local service.
	 *
	 * @return the g kart category local service
	 */
	public com.liferay.sample.service.GKartCategoryLocalService getGKartCategoryLocalService() {
		return gKartCategoryLocalService;
	}

	/**
	 * Sets the g kart category local service.
	 *
	 * @param gKartCategoryLocalService the g kart category local service
	 */
	public void setGKartCategoryLocalService(
		com.liferay.sample.service.GKartCategoryLocalService gKartCategoryLocalService) {
		this.gKartCategoryLocalService = gKartCategoryLocalService;
	}

	/**
	 * Returns the g kart category persistence.
	 *
	 * @return the g kart category persistence
	 */
	public GKartCategoryPersistence getGKartCategoryPersistence() {
		return gKartCategoryPersistence;
	}

	/**
	 * Sets the g kart category persistence.
	 *
	 * @param gKartCategoryPersistence the g kart category persistence
	 */
	public void setGKartCategoryPersistence(
		GKartCategoryPersistence gKartCategoryPersistence) {
		this.gKartCategoryPersistence = gKartCategoryPersistence;
	}

	/**
	 * Returns the g kart items local service.
	 *
	 * @return the g kart items local service
	 */
	public com.liferay.sample.service.GKartItemsLocalService getGKartItemsLocalService() {
		return gKartItemsLocalService;
	}

	/**
	 * Sets the g kart items local service.
	 *
	 * @param gKartItemsLocalService the g kart items local service
	 */
	public void setGKartItemsLocalService(
		com.liferay.sample.service.GKartItemsLocalService gKartItemsLocalService) {
		this.gKartItemsLocalService = gKartItemsLocalService;
	}

	/**
	 * Returns the g kart items persistence.
	 *
	 * @return the g kart items persistence
	 */
	public GKartItemsPersistence getGKartItemsPersistence() {
		return gKartItemsPersistence;
	}

	/**
	 * Sets the g kart items persistence.
	 *
	 * @param gKartItemsPersistence the g kart items persistence
	 */
	public void setGKartItemsPersistence(
		GKartItemsPersistence gKartItemsPersistence) {
		this.gKartItemsPersistence = gKartItemsPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.liferay.sample.model.GKartItems",
			gKartItemsLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.liferay.sample.model.GKartItems");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return GKartItems.class;
	}

	protected String getModelClassName() {
		return GKartItems.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = gKartItemsPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.liferay.sample.service.GKartCategoryLocalService.class)
	protected com.liferay.sample.service.GKartCategoryLocalService gKartCategoryLocalService;
	@BeanReference(type = GKartCategoryPersistence.class)
	protected GKartCategoryPersistence gKartCategoryPersistence;
	@BeanReference(type = com.liferay.sample.service.GKartItemsLocalService.class)
	protected com.liferay.sample.service.GKartItemsLocalService gKartItemsLocalService;
	@BeanReference(type = GKartItemsPersistence.class)
	protected GKartItemsPersistence gKartItemsPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private GKartItemsLocalServiceClpInvoker _clpInvoker = new GKartItemsLocalServiceClpInvoker();
}