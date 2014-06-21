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
public class GKartCategorySoap implements Serializable {
	public static GKartCategorySoap toSoapModel(GKartCategory model) {
		GKartCategorySoap soapModel = new GKartCategorySoap();

		soapModel.setCatId(model.getCatId());
		soapModel.setCatName(model.getCatName());
		soapModel.setSubcatdId(model.getSubcatdId());
		soapModel.setSubcatName(model.getSubcatName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static GKartCategorySoap[] toSoapModels(GKartCategory[] models) {
		GKartCategorySoap[] soapModels = new GKartCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static GKartCategorySoap[][] toSoapModels(GKartCategory[][] models) {
		GKartCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new GKartCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new GKartCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static GKartCategorySoap[] toSoapModels(List<GKartCategory> models) {
		List<GKartCategorySoap> soapModels = new ArrayList<GKartCategorySoap>(models.size());

		for (GKartCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new GKartCategorySoap[soapModels.size()]);
	}

	public GKartCategorySoap() {
	}

	public long getPrimaryKey() {
		return _catId;
	}

	public void setPrimaryKey(long pk) {
		setCatId(pk);
	}

	public long getCatId() {
		return _catId;
	}

	public void setCatId(long catId) {
		_catId = catId;
	}

	public String getCatName() {
		return _catName;
	}

	public void setCatName(String catName) {
		_catName = catName;
	}

	public int getSubcatdId() {
		return _subcatdId;
	}

	public void setSubcatdId(int subcatdId) {
		_subcatdId = subcatdId;
	}

	public String getSubcatName() {
		return _subcatName;
	}

	public void setSubcatName(String subcatName) {
		_subcatName = subcatName;
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

	private long _catId;
	private String _catName;
	private int _subcatdId;
	private String _subcatName;
	private Date _createDate;
	private Date _modifiedDate;
}