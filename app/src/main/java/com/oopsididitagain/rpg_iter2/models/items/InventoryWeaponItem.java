package com.oopsididitagain.rpg_iter2.models.items;

import com.oopsididitagain.rpg_iter2.models.stats.StatBlob;
import com.oopsididitagain.rpg_iter2.utils.WeaponItemType;

public class InventoryWeaponItem extends InventoryEquippableItem {
	private WeaponItemType type;

	public InventoryWeaponItem(String id, double price,
			StatBlob statBlob, WeaponItemType type) {
		super(id, price, statBlob);
		this.type = type;
	}

	public InventoryWeaponItem(WeaponTakeableItem item) {
		super(item);
		this.type = item.getWeaponItemType();
	}
	
	public WeaponItemType getWeaponItemType() {
		return type;
	}

}