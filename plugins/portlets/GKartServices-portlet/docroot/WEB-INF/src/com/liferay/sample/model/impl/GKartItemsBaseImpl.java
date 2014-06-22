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

package com.liferay.sample.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.sample.model.GKartItems;
import com.liferay.sample.service.GKartItemsLocalServiceUtil;

/**
 * The extended model base implementation for the GKartItems service. Represents a row in the &quot;GKart_GKartItems&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GKartItemsImpl}.
 * </p>
 *
 * @author Valiyullah
 * @see GKartItemsImpl
 * @see com.liferay.sample.model.GKartItems
 * @generated
 */
public abstract class GKartItemsBaseImpl extends GKartItemsModelImpl
	implements GKartItems {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a g kart items model instance should use the {@link GKartItems} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GKartItemsLocalServiceUtil.addGKartItems(this);
		}
		else {
			GKartItemsLocalServiceUtil.updateGKartItems(this);
		}
	}
}