package com.oopsididitagain.rpg_iter2.models.items;

import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.stats.StatBlob;
import com.oopsididitagain.rpg_iter2.utils.ArmorItemType;

public class ArmorTakeableItem extends EquipableTakeableItem {

	private ArmorItemType type;

	public ArmorTakeableItem(String id, Position position,
			double price, StatBlob statBlob, ArmorItemType type) {
		super(id, position, price, statBlob);
		this.type = type;
	}

	@Override
	public InventoryEquippableItem toInventoryItem() {
		InventoryArmorItem item = new InventoryArmorItem(this);
		return item;
	}
	
	public ArmorItemType getArmorItemType() {
		return type;
	}
	

}
