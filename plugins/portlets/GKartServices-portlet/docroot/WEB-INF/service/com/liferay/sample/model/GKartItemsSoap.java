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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Valiyullah
 * @generated
 */
public class GKartItemsSoap implements Serializable {
	public static GKartItemsSoap toSoapModel(GKartItems model) {
		GKartItemsSoap soapModel = new GKartItemsSoap();

		soapModel.setItemId(model.getItemId());
		soapModel.setCatName(model.getCatName());
		soapModel.setCatId(model.getCatId());
		soapModel.setItemName(model.getItemName());
		soapModel.setItemDesc(model.getItemDesc());
		soapModel.setBrandName(model.getBrandName());
		soapModel.setPrice(model.getPrice());
		soapModel.setQuantity(model.getQuantity());
		soapModel.setUnits(model.getUnits());
		soapModel.setImage(model.getImage());
		soapModel.setBrandDesc(model.getBrandDesc());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static GKartItemsSoap[] toSoapModels(GKartItems[] models) {
		GKartItemsSoap[] soapModels = new GKartItemsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GKartItemsSoap[][] toSoapModels(GKartItems[][] models) {
		GKartItemsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GKartItemsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new GKartItemsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GKartItemsSoap[] toSoapModels(List<GKartItems> models) {
		List<GKartItemsSoap> soapModels = new ArrayList<GKartItemsSoap>(models.size());

		for (GKartItems model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GKartItemsSoap[soapModels.size()]);
	}

	public GKartItemsSoap() {
	}

	public long getPrimaryKey() {
		return _itemId;
	}

	public void setPrimaryKey(long pk) {
		setItemId(pk);
	}

	public long getItemId() {
		return _itemId;
	}

	public void setItemId(long itemId) {
		_itemId = itemId;
	}

	public String getCatName() {
		return _catName;
	}

	public void setCatName(String catName) {
		_catName = catName;
	}

	public int getCatId() {
		return _catId;
	}

	public void setCatId(int catId) {
		_catId = catId;
	}

	public String getItemName() {
		return _itemName;
	}

	public void setItemName(String itemName) {
		_itemName = itemName;
	}

	public String getItemDesc() {
		return _itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		_itemDesc = itemDesc;
	}

	public String getBrandName() {
		return _brandName;
	}

	public void setBrandName(String brandName) {
		_brandName = brandName;
	}

	public long getPrice() {
		return _price;
	}

	public void setPrice(long price) {
		_price = price;
	}

	public int getQuantity() {
		return _quantity;
	}

	public void setQuantity(int quantity) {
		_quantity = quantity;
	}

	public String getUnits() {
		return _units;
	}

	public void setUnits(String units) {
		_units = units;
	}

	public String getImage() {
		return _image;
	}

	public void setImage(String image) {
		_image = image;
	}

	public String getBrandDesc() {
		return _brandDesc;
	}

	public void setBrandDesc(String brandDesc) {
		_brandDesc = brandDesc;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
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
}