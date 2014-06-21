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

package com.liferay.sample.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.sample.service.ClpSerializer;
import com.liferay.sample.service.GKartItemsLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Valiyullah
 */
public class GKartItemsClp extends BaseModelImpl<GKartItems>
	implements GKartItems {
	public GKartItemsClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return GKartItems.class;
	}

	@Override
	public String getModelClassName() {
		return GKartItems.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _itemId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setItemId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _itemId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("itemId", getItemId());
		attributes.put("catName", getCatName());
		attributes.put("catId", getCatId());
		attributes.put("itemName", getItemName());
		attributes.put("itemDesc", getItemDesc());
		attributes.put("brandName", getBrandName());
		attributes.put("price", getPrice());
		attributes.put("quantity", getQuantity());
		attributes.put("units", getUnits());
		attributes.put("image", getImage());
		attributes.put("brandDesc", getBrandDesc());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long itemId = (Long)attributes.get("itemId");

		if (itemId != null) {
			setItemId(itemId);
		}

		String catName = (String)attributes.get("catName");

		if (catName != null) {
			setCatName(catName);
		}

		Integer catId = (Integer)attributes.get("catId");

		if (catId != null) {
			setCatId(catId);
		}

		String itemName = (String)attributes.get("itemName");

		if (itemName != null) {
			setItemName(itemName);
		}

		String itemDesc = (String)attributes.get("itemDesc");

		if (itemDesc != null) {
			setItemDesc(itemDesc);
		}

		String brandName = (String)attributes.get("brandName");

		if (brandName != null) {
			setBrandName(brandName);
		}

		Long price = (Long)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		String units = (String)attributes.get("units");

		if (units != null) {
			setUnits(units);
		}

		String image = (String)attributes.get("image");

		if (image != null) {
			setImage(image);
		}

		String brandDesc = (String)attributes.get("brandDesc");

		if (brandDesc != null) {
			setBrandDesc(brandDesc);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public long getItemId() {
		return _itemId;
	}

	@Override
	public void setItemId(long itemId) {
		_itemId = itemId;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setItemId", long.class);

				method.invoke(_gKartItemsRemoteModel, itemId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCatName() {
		return _catName;
	}

	@Override
	public void setCatName(String catName) {
		_catName = catName;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setCatName", String.class);

				method.invoke(_gKartItemsRemoteModel, catName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getCatId() {
		return _catId;
	}

	@Override
	public void setCatId(int catId) {
		_catId = catId;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setCatId", int.class);

				method.invoke(_gKartItemsRemoteModel, catId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getItemName() {
		return _itemName;
	}

	@Override
	public void setItemName(String itemName) {
		_itemName = itemName;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setItemName", String.class);

				method.invoke(_gKartItemsRemoteModel, itemName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getItemDesc() {
		return _itemDesc;
	}

	@Override
	public void setItemDesc(String itemDesc) {
		_itemDesc = itemDesc;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setItemDesc", String.class);

				method.invoke(_gKartItemsRemoteModel, itemDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBrandName() {
		return _brandName;
	}

	@Override
	public void setBrandName(String brandName) {
		_brandName = brandName;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setBrandName", String.class);

				method.invoke(_gKartItemsRemoteModel, brandName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPrice() {
		return _price;
	}

	@Override
	public void setPrice(long price) {
		_price = price;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setPrice", long.class);

				method.invoke(_gKartItemsRemoteModel, price);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getQuantity() {
		return _quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		_quantity = quantity;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setQuantity", int.class);

				method.invoke(_gKartItemsRemoteModel, quantity);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUnits() {
		return _units;
	}

	@Override
	public void setUnits(String units) {
		_units = units;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setUnits", String.class);

				method.invoke(_gKartItemsRemoteModel, units);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getImage() {
		return _image;
	}

	@Override
	public void setImage(String image) {
		_image = image;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setImage", String.class);

				method.invoke(_gKartItemsRemoteModel, image);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBrandDesc() {
		return _brandDesc;
	}

	@Override
	public void setBrandDesc(String brandDesc) {
		_brandDesc = brandDesc;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setBrandDesc", String.class);

				method.invoke(_gKartItemsRemoteModel, brandDesc);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_gKartItemsRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_gKartItemsRemoteModel != null) {
			try {
				Class<?> clazz = _gKartItemsRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_gKartItemsRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getGKartItemsRemoteModel() {
		return _gKartItemsRemoteModel;
	}

	public void setGKartItemsRemoteModel(BaseModel<?> gKartItemsRemoteModel) {
		_gKartItemsRemoteModel = gKartItemsRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _gKartItemsRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_gKartItemsRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GKartItemsLocalServiceUtil.addGKartItems(this);
		}
		else {
			GKartItemsLocalServiceUtil.updateGKartItems(this);
		}
	}

	@Override
	public GKartItems toEscapedModel() {
		return (GKartItems)ProxyUtil.newProxyInstance(GKartItems.class.getClassLoader(),
			new Class[] { GKartItems.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GKartItemsClp clone = new GKartItemsClp();

		clone.setItemId(getItemId());
		clone.setCatName(getCatName());
		clone.setCatId(getCatId());
		clone.setItemName(getItemName());
		clone.setItemDesc(getItemDesc());
		clone.setBrandName(getBrandName());
		clone.setPrice(getPrice());
		clone.setQuantity(getQuantity());
		clone.setUnits(getUnits());
		clone.setImage(getImage());
		clone.setBrandDesc(getBrandDesc());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(GKartItems gKartItems) {
		int value = 0;

		value = getItemName().compareTo(gKartItems.getItemName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GKartItemsClp)) {
			return false;
		}

		GKartItemsClp gKartItems = (GKartItemsClp)obj;

		long primaryKey = gKartItems.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{itemId=");
		sb.append(getItemId());
		sb.append(", catName=");
		sb.append(getCatName());
		sb.append(", catId=");
		sb.append(getCatId());
		sb.append(", itemName=");
		sb.append(getItemName());
		sb.append(", itemDesc=");
		sb.append(getItemDesc());
		sb.append(", brandName=");
		sb.append(getBrandName());
		sb.append(", price=");
		sb.append(getPrice());
		sb.append(", quantity=");
		sb.append(getQuantity());
		sb.append(", units=");
		sb.append(getUnits());
		sb.append(", image=");
		sb.append(getImage());
		sb.append(", brandDesc=");
		sb.append(getBrandDesc());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.GKartItems");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>itemId</column-name><column-value><![CDATA[");
		sb.append(getItemId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catName</column-name><column-value><![CDATA[");
		sb.append(getCatName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catId</column-name><column-value><![CDATA[");
		sb.append(getCatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemName</column-name><column-value><![CDATA[");
		sb.append(getItemName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>itemDesc</column-name><column-value><![CDATA[");
		sb.append(getItemDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>brandName</column-name><column-value><![CDATA[");
		sb.append(getBrandName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>price</column-name><column-value><![CDATA[");
		sb.append(getPrice());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>quantity</column-name><column-value><![CDATA[");
		sb.append(getQuantity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>units</column-name><column-value><![CDATA[");
		sb.append(getUnits());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>image</column-name><column-value><![CDATA[");
		sb.append(getImage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>brandDesc</column-name><column-value><![CDATA[");
		sb.append(getBrandDesc());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _itemId;
	private String _catName;
	private int _catId;
	private String _itemName;
	private String _itemDesc;
	private String _brandName;
	private long _price;
	private int _quantity;
	private String _units;
	private String _image;
	private String _brandDesc;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _gKartItemsRemoteModel;
}