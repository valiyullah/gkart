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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.sample.model.GKartCategory;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GKartCategory in entity cache.
 *
 * @author Valiyullah
 * @see GKartCategory
 * @generated
 */
public class GKartCategoryCacheModel implements CacheModel<GKartCategory>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{catId=");
		sb.append(catId);
		sb.append(", catName=");
		sb.append(catName);
		sb.append(", subcatdId=");
		sb.append(subcatdId);
		sb.append(", subcatName=");
		sb.append(subcatName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GKartCategory toEntityModel() {
		GKartCategoryImpl gKartCategoryImpl = new GKartCategoryImpl();

		gKartCategoryImpl.setCatId(catId);

		if (catName == null) {
			gKartCategoryImpl.setCatName(StringPool.BLANK);
		}
		else {
			gKartCategoryImpl.setCatName(catName);
		}

		gKartCategoryImpl.setSubcatdId(subcatdId);

		if (subcatName == null) {
			gKartCategoryImpl.setSubcatName(StringPool.BLANK);
		}
		else {
			gKartCategoryImpl.setSubcatName(subcatName);
		}

		if (createDate == Long.MIN_VALUE) {
			gKartCategoryImpl.setCreateDate(null);
		}
		else {
			gKartCategoryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			gKartCategoryImpl.setModifiedDate(null);
		}
		else {
			gKartCategoryImpl.setModifiedDate(new Date(modifiedDate));
		}

		gKartCategoryImpl.resetOriginalValues();

		return gKartCategoryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		catId = objectInput.readLong();
		catName = objectInput.readUTF();
		subcatdId = objectInput.readInt();
		subcatName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(catId);

		if (catName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(catName);
		}

		objectOutput.writeInt(subcatdId);

		if (subcatName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subcatName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long catId;
	public String catName;
	public int subcatdId;
	public String subcatName;
	public long createDate;
	public long modifiedDate;
}