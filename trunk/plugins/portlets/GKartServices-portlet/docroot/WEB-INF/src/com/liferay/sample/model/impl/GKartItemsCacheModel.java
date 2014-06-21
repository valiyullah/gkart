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

import com.liferay.sample.model.GKartItems;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing GKartItems in entity cache.
 *
 * @author Valiyullah
 * @see GKartItems
 * @generated
 */
public class GKartItemsCacheModel implements CacheModel<GKartItems>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{itemId=");
		sb.append(itemId);
		sb.append(", catName=");
		sb.append(catName);
		sb.append(", catId=");
		sb.append(catId);
		sb.append(", itemName=");
		sb.append(itemName);
		sb.append(", itemDesc=");
		sb.append(itemDesc);
		sb.append(", brandName=");
		sb.append(brandName);
		sb.append(", price=");
		sb.append(price);
		sb.append(", quantity=");
		sb.append(quantity);
		sb.append(", units=");
		sb.append(units);
		sb.append(", image=");
		sb.append(image);
		sb.append(", brandDesc=");
		sb.append(brandDesc);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public GKartItems toEntityModel() {
		GKartItemsImpl gKartItemsImpl = new GKartItemsImpl();

		gKartItemsImpl.setItemId(itemId);

		if (catName == null) {
			gKartItemsImpl.setCatName(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setCatName(catName);
		}

		gKartItemsImpl.setCatId(catId);

		if (itemName == null) {
			gKartItemsImpl.setItemName(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setItemName(itemName);
		}

		if (itemDesc == null) {
			gKartItemsImpl.setItemDesc(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setItemDesc(itemDesc);
		}

		if (brandName == null) {
			gKartItemsImpl.setBrandName(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setBrandName(brandName);
		}

		gKartItemsImpl.setPrice(price);
		gKartItemsImpl.setQuantity(quantity);

		if (units == null) {
			gKartItemsImpl.setUnits(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setUnits(units);
		}

		if (image == null) {
			gKartItemsImpl.setImage(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setImage(image);
		}

		if (brandDesc == null) {
			gKartItemsImpl.setBrandDesc(StringPool.BLANK);
		}
		else {
			gKartItemsImpl.setBrandDesc(brandDesc);
		}

		if (createDate == Long.MIN_VALUE) {
			gKartItemsImpl.setCreateDate(null);
		}
		else {
			gKartItemsImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			gKartItemsImpl.setModifiedDate(null);
		}
		else {
			gKartItemsImpl.setModifiedDate(new Date(modifiedDate));
		}

		gKartItemsImpl.resetOriginalValues();

		return gKartItemsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		itemId = objectInput.readLong();
		catName = objectInput.readUTF();
		catId = objectInput.readInt();
		itemName = objectInput.readUTF();
		itemDesc = objectInput.readUTF();
		brandName = objectInput.readUTF();
		price = objectInput.readLong();
		quantity = objectInput.readInt();
		units = objectInput.readUTF();
		image = objectInput.readUTF();
		brandDesc = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(itemId);

		if (catName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(catName);
		}

		objectOutput.writeInt(catId);

		if (itemName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemName);
		}

		if (itemDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(itemDesc);
		}

		if (brandName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(brandName);
		}

		objectOutput.writeLong(price);
		objectOutput.writeInt(quantity);

		if (units == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(units);
		}

		if (image == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(image);
		}

		if (brandDesc == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(brandDesc);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public long itemId;
	public String catName;
	public int catId;
	public String itemName;
	public String itemDesc;
	public String brandName;
	public long price;
	public int quantity;
	public String units;
	public String image;
	public String brandDesc;
	public long createDate;
	public long modifiedDate;
}