package com.oopsididitagain.rpg_iter2.models.Items;

import com.oopsididitagain.rpg_iter2.models.Entities.Entity;
import com.oopsididitagain.rpg_iter2.models.Stats.StatBlob;
import com.oopsididitagain.rpg_iter2.utils.EntityVisitable;
import com.oopsididitagain.rpg_iter2.utils.InstantStatModifier;

public class InventoryUsableItem extends InventoryItem implements EntityVisitable, InstantStatModifier {
	private StatBlob statBlob;
	
	public InventoryUsableItem(EffectTakeableItem item) {
		super(item);
		this.statBlob = item.statBlob();
	}
	
	@Override
	public StatBlob statBlob() {
		return statBlob;
	}

	@Override
	public void affect(StatBlob target) {
		target.merge(statBlob());
	}

	@Override
	public void accept(Entity entity) {
		entity.visit(this);
	}

}