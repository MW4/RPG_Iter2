
package com.oopsididitagain.rpg_iter2.models.entities;
import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.Probe;
import com.oopsididitagain.rpg_iter2.models.Storyline;
import com.oopsididitagain.rpg_iter2.models.items.TakeableItem;
import com.oopsididitagain.rpg_iter2.utils.InstantStatModifier;
import com.oopsididitagain.rpg_iter2.utils.Tileable;

/**
 * Created by parango on 3/11/15.
 */
public class Npc extends Entity {
	
	Storyline story;
	public Npc(String id, Position position) {
		super(id, position);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Probe probe) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(TakeableItem item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(InstantStatModifier modifier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Tileable o) {
		return getTileablePriority().compareTo(getTileablePriority());
	}

	@Override
	public boolean removeable() {
		return false;
	}
}
