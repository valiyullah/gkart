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
 * This class is a wrapper for {@link GKartItems}.
 * </p>
 *
 * @author Valiyullah
 * @see GKartItems
 * @generated
 */
public class GKartItemsWrapper implements GKartItems, ModelWrapper<GKartItems> {
	public GKartItemsWrapper(GKartItems gKartItems) {
		_gKartItems = gKartItems;
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

	/**
	* Returns the primary key of this g kart items.
	*
	* @return the primary key of this g kart items
	*/
	@Override
	public long getPrimaryKey() {
		return _gKartItems.getPrimaryKey();
	}

	/**
	* Sets the primary key of this g kart items.
	*
	* @param primaryKey the primary key of this g kart items
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_gKartItems.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the item ID of this g kart items.
	*
	* @return the item ID of this g kart items
	*/
	@Override
	public long getItemId() {
		return _gKartItems.getItemId();
	}

	/**
	* Sets the item ID of this g kart items.
	*
	* @param itemId the item ID of this g kart items
	*/
	@Override
	public void setItemId(long itemId) {
		_gKartItems.setItemId(itemId);
	}

	/**
	* Returns the cat name of this g kart items.
	*
	* @return the cat name of this g kart items
	*/
	@Override
	public java.lang.String getCatName() {
		return _gKartItems.getCatName();
	}

	/**
	* Sets the cat name of this g kart items.
	*
	* @param catName the cat name of this g kart items
	*/
	@Override
	public void setCatName(java.lang.String catName) {
		_gKartItems.setCatName(catName);
	}

	/**
	* Returns the cat ID of this g kart items.
	*
	* @return the cat ID of this g kart items
	*/
	@Override
	public int getCatId() {
		return _gKartItems.getCatId();
	}

	/**
	* Sets the cat ID of this g kart items.
	*
	* @param catId the cat ID of this g kart items
	*/
	@Override
	public void setCatId(int catId) {
		_gKartItems.setCatId(catId);
	}

	/**
	* Returns the item name of this g kart items.
	*
	* @return the item name of this g kart items
	*/
	@Override
	public java.lang.String getItemName() {
		return _gKartItems.getItemName();
	}

	/**
	* Sets the item name of this g kart items.
	*
	* @param itemName the item name of this g kart items
	*/
	@Override
	public void setItemName(java.lang.String itemName) {
		_gKartItems.setItemName(itemName);
	}

	/**
	* Returns the item desc of this g kart items.
	*
	* @return the item desc of this g kart items
	*/
	@Override
	public java.lang.String getItemDesc() {
		return _gKartItems.getItemDesc();
	}

	/**
	* Sets the item desc of this g kart items.
	*
	* @param itemDesc the item desc of this g kart items
	*/
	@Override
	public void setItemDesc(java.lang.String itemDesc) {
		_gKartItems.setItemDesc(itemDesc);
	}

	/**
	* Returns the brand name of this g kart items.
	*
	* @return the brand name of this g kart items
	*/
	@Override
	public java.lang.String getBrandName() {
		return _gKartItems.getBrandName();
	}

	/**
	* Sets the brand name of this g kart items.
	*
	* @param brandName the brand name of this g kart items
	*/
	@Override
	public void setBrandName(java.lang.String brandName) {
		_gKartItems.setBrandName(brandName);
	}

	/**
	* Returns the price of this g kart items.
	*
	* @return the price of this g kart items
	*/
	@Override
	public long getPrice() {
		return _gKartItems.getPrice();
	}

	/**
	* Sets the price of this g kart items.
	*
	* @param price the price of this g kart items
	*/
	@Override
	public void setPrice(long price) {
		_gKartItems.setPrice(price);
	}

	/**
	* Returns the quantity of this g kart items.
	*
	* @return the quantity of this g kart items
	*/
	@Override
	public int getQuantity() {
		return _gKartItems.getQuantity();
	}

	/**
	* Sets the quantity of this g kart items.
	*
	* @param quantity the quantity of this g kart items
	*/
	@Override
	public void setQuantity(int quantity) {
		_gKartItems.setQuantity(quantity);
	}

	/**
	* Returns the units of this g kart items.
	*
	* @return the units of this g kart items
	*/
	@Override
	public java.lang.String getUnits() {
		return _gKartItems.getUnits();
	}

	/**
	* Sets the units of this g kart items.
	*
	* @param units the units of this g kart items
	*/
	@Override
	public void setUnits(java.lang.String units) {
		_gKartItems.setUnits(units);
	}

	/**
	* Returns the image of this g kart items.
	*
	* @return the image of this g kart items
	*/
	@Override
	public java.lang.String getImage() {
		return _gKartItems.getImage();
	}

	/**
	* Sets the image of this g kart items.
	*
	* @param image the image of this g kart items
	*/
	@Override
	public void setImage(java.lang.String image) {
		_gKartItems.setImage(image);
	}

	/**
	* Returns the brand desc of this g kart items.
	*
	* @return the brand desc of this g kart items
	*/
	@Override
	public java.lang.String getBrandDesc() {
		return _gKartItems.getBrandDesc();
	}

	/**
	* Sets the brand desc of this g kart items.
	*
	* @param brandDesc the brand desc of this g kart items
	*/
	@Override
	public void setBrandDesc(java.lang.String brandDesc) {
		_gKartItems.setBrandDesc(brandDesc);
	}

	/**
	* Returns the create date of this g kart items.
	*
	* @return the create date of this g kart items
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _gKartItems.getCreateDate();
	}

	/**
	* Sets the create date of this g kart items.
	*
	* @param createDate the create date of this g kart items
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_gKartItems.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this g kart items.
	*
	* @return the modified date of this g kart items
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _gKartItems.getModifiedDate();
	}

	/**
	* Sets the modified date of this g kart items.
	*
	* @param modifiedDate the modified date of this g kart items
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_gKartItems.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _gKartItems.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_gKartItems.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _gKartItems.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_gKartItems.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _gKartItems.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _gKartItems.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_gKartItems.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _gKartItems.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_gKartItems.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_gKartItems.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_gKartItems.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new GKartItemsWrapper((GKartItems)_gKartItems.clone());
	}

	@Override
	public int compareTo(GKartItems gKartItems) {
		return _gKartItems.compareTo(gKartItems);
	}

	@Override
	public int hashCode() {
		return _gKartItems.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<GKartItems> toCacheModel() {
		return _gKartItems.toCacheModel();
	}

	@Override
	public GKartItems toEscapedModel() {
		return new GKartItemsWrapper(_gKartItems.toEscapedModel());
	}

	@Override
	public GKartItems toUnescapedModel() {
		return new GKartItemsWrapper(_gKartItems.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _gKartItems.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _gKartItems.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_gKartItems.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof GKartItemsWrapper)) {
			return false;
		}

		GKartItemsWrapper gKartItemsWrapper = (GKartItemsWrapper)obj;

		if (Validator.equals(_gKartItems, gKartItemsWrapper._gKartItems)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public GKartItems getWrappedGKartItems() {
		return _gKartItems;
	}

	@Override
	public GKartItems getWrappedModel() {
		return _gKartItems;
	}

	@Override
	public void resetOriginalValues() {
		_gKartItems.resetOriginalValues();
	}

	private GKartItems _gKartItems;
}