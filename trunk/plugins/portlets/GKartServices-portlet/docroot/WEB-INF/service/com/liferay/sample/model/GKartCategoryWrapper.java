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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link GKartCategory}.
 * </p>
 *
 * @author Valiyullah
 * @see GKartCategory
 * @generated
 */
public class GKartCategoryWrapper implements GKartCategory,
	ModelWrapper<GKartCategory> {
	public GKartCategoryWrapper(GKartCategory gKartCategory) {
		_gKartCategory = gKartCategory;
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

	/**
	* Returns the primary key of this g kart category.
	*
	* @return the primary key of this g kart category
	*/
	@Override
	public long getPrimaryKey() {
		return _gKartCategory.getPrimaryKey();
	}

	/**
	* Sets the primary key of this g kart category.
	*
	* @param primaryKey the primary key of this g kart category
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_gKartCategory.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the cat ID of this g kart category.
	*
	* @return the cat ID of this g kart category
	*/
	@Override
	public long getCatId() {
		return _gKartCategory.getCatId();
	}

	/**
	* Sets the cat ID of this g kart category.
	*
	* @param catId the cat ID of this g kart category
	*/
	@Override
	public void setCatId(long catId) {
		_gKartCategory.setCatId(catId);
	}

	/**
	* Returns the cat name of this g kart category.
	*
	* @return the cat name of this g kart category
	*/
	@Override
	public java.lang.String getCatName() {
		return _gKartCategory.getCatName();
	}

	/**
	* Sets the cat name of this g kart category.
	*
	* @param catName the cat name of this g kart category
	*/
	@Override
	public void setCatName(java.lang.String catName) {
		_gKartCategory.setCatName(catName);
	}

	/**
	* Returns the subcatd ID of this g kart category.
	*
	* @return the subcatd ID of this g kart category
	*/
	@Override
	public int getSubcatdId() {
		return _gKartCategory.getSubcatdId();
	}

	/**
	* Sets the subcatd ID of this g kart category.
	*
	* @param subcatdId the subcatd ID of this g kart category
	*/
	@Override
	public void setSubcatdId(int subcatdId) {
		_gKartCategory.setSubcatdId(subcatdId);
	}

	/**
	* Returns the subcat name of this g kart category.
	*
	* @return the subcat name of this g kart category
	*/
	@Override
	public java.lang.String getSubcatName() {
		return _gKartCategory.getSubcatName();
	}

	/**
	* Sets the subcat name of this g kart category.
	*
	* @param subcatName the subcat name of this g kart category
	*/
	@Override
	public void setSubcatName(java.lang.String subcatName) {
		_gKartCategory.setSubcatName(subcatName);
	}

	/**
	* Returns the create date of this g kart category.
	*
	* @return the create date of this g kart category
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _gKartCategory.getCreateDate();
	}

	/**
	* Sets the create date of this g kart category.
	*
	* @param createDate the create date of this g kart category
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_gKartCategory.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this g kart category.
	*
	* @return the modified date of this g kart category
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _gKartCategory.getModifiedDate();
	}

	/**
	* Sets the modified date of this g kart category.
	*
	* @param modifiedDate the modified date of this g kart category
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_gKartCategory.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _gKartCategory.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_gKartCategory.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _gKartCategory.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_gKartCategory.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _gKartCategory.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _gKartCategory.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_gKartCategory.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _gKartCategory.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_gKartCategory.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_gKartCategory.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_gKartCategory.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GKartCategoryWrapper((GKartCategory)_gKartCategory.clone());
	}

	@Override
	public int compareTo(com.liferay.sample.model.GKartCategory gKartCategory) {
		return _gKartCategory.compareTo(gKartCategory);
	}

	@Override
	public int hashCode() {
		return _gKartCategory.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.sample.model.GKartCategory> toCacheModel() {
		return _gKartCategory.toCacheModel();
	}

	@Override
	public com.liferay.sample.model.GKartCategory toEscapedModel() {
		return new GKartCategoryWrapper(_gKartCategory.toEscapedModel());
	}

	@Override
	public com.liferay.sample.model.GKartCategory toUnescapedModel() {
		return new GKartCategoryWrapper(_gKartCategory.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _gKartCategory.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _gKartCategory.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_gKartCategory.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GKartCategoryWrapper)) {
			return false;
		}

		GKartCategoryWrapper gKartCategoryWrapper = (GKartCategoryWrapper)obj;

		if (Validator.equals(_gKartCategory, gKartCategoryWrapper._gKartCategory)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GKartCategory getWrappedGKartCategory() {
		return _gKartCategory;
	}

	@Override
	public GKartCategory getWrappedModel() {
		return _gKartCategory;
	}

	@Override
	public void resetOriginalValues() {
		_gKartCategory.resetOriginalValues();
	}

	private GKartCategory _gKartCategory;
}