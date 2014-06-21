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
import com.liferay.sample.service.GKartCategoryLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Valiyullah
 */
public class GKartCategoryClp extends BaseModelImpl<GKartCategory>
	implements GKartCategory {
	public GKartCategoryClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return GKartCategory.class;
	}

	@Override
	public String getModelClassName() {
		return GKartCategory.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _catId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCatId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _catId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("catId", getCatId());
		attributes.put("catName", getCatName());
		attributes.put("subcatdId", getSubcatdId());
		attributes.put("subcatName", getSubcatName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long catId = (Long)attributes.get("catId");

		if (catId != null) {
			setCatId(catId);
		}

		String catName = (String)attributes.get("catName");

		if (catName != null) {
			setCatName(catName);
		}

		Integer subcatdId = (Integer)attributes.get("subcatdId");

		if (subcatdId != null) {
			setSubcatdId(subcatdId);
		}

		String subcatName = (String)attributes.get("subcatName");

		if (subcatName != null) {
			setSubcatName(subcatName);
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
	public long getCatId() {
		return _catId;
	}

	@Override
	public void setCatId(long catId) {
		_catId = catId;

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCatId", long.class);

				method.invoke(_gKartCategoryRemoteModel, catId);
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

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCatName", String.class);

				method.invoke(_gKartCategoryRemoteModel, catName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getSubcatdId() {
		return _subcatdId;
	}

	@Override
	public void setSubcatdId(int subcatdId) {
		_subcatdId = subcatdId;

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setSubcatdId", int.class);

				method.invoke(_gKartCategoryRemoteModel, subcatdId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getSubcatName() {
		return _subcatName;
	}

	@Override
	public void setSubcatName(String subcatName) {
		_subcatName = subcatName;

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setSubcatName", String.class);

				method.invoke(_gKartCategoryRemoteModel, subcatName);
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

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_gKartCategoryRemoteModel, createDate);
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

		if (_gKartCategoryRemoteModel != null) {
			try {
				Class<?> clazz = _gKartCategoryRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_gKartCategoryRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getGKartCategoryRemoteModel() {
		return _gKartCategoryRemoteModel;
	}

	public void setGKartCategoryRemoteModel(
		BaseModel<?> gKartCategoryRemoteModel) {
		_gKartCategoryRemoteModel = gKartCategoryRemoteModel;
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

		Class<?> remoteModelClass = _gKartCategoryRemoteModel.getClass();

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

		Object returnValue = method.invoke(_gKartCategoryRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			GKartCategoryLocalServiceUtil.addGKartCategory(this);
		}
		else {
			GKartCategoryLocalServiceUtil.updateGKartCategory(this);
		}
	}

	@Override
	public GKartCategory toEscapedModel() {
		return (GKartCategory)ProxyUtil.newProxyInstance(GKartCategory.class.getClassLoader(),
			new Class[] { GKartCategory.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		GKartCategoryClp clone = new GKartCategoryClp();

		clone.setCatId(getCatId());
		clone.setCatName(getCatName());
		clone.setSubcatdId(getSubcatdId());
		clone.setSubcatName(getSubcatName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(GKartCategory gKartCategory) {
		int value = 0;

		value = getCatName().compareTo(gKartCategory.getCatName());

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

		if (!(obj instanceof GKartCategoryClp)) {
			return false;
		}

		GKartCategoryClp gKartCategory = (GKartCategoryClp)obj;

		long primaryKey = gKartCategory.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{catId=");
		sb.append(getCatId());
		sb.append(", catName=");
		sb.append(getCatName());
		sb.append(", subcatdId=");
		sb.append(getSubcatdId());
		sb.append(", subcatName=");
		sb.append(getSubcatName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.liferay.sample.model.GKartCategory");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>catId</column-name><column-value><![CDATA[");
		sb.append(getCatId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>catName</column-name><column-value><![CDATA[");
		sb.append(getCatName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcatdId</column-name><column-value><![CDATA[");
		sb.append(getSubcatdId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subcatName</column-name><column-value><![CDATA[");
		sb.append(getSubcatName());
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

	private long _catId;
	private String _catName;
	private int _subcatdId;
	private String _subcatName;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _gKartCategoryRemoteModel;
}