package com.oopsididitagain.rpg_iter2.controllers.menu_controllers;


import com.oopsididitagain.rpg_iter2.controllers.Controller;
import com.oopsididitagain.rpg_iter2.controllers.GameController;
import com.oopsididitagain.rpg_iter2.model_view_interaction.ModelViewInteraction;
import com.oopsididitagain.rpg_iter2.models.GameMap;
import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.entities.Avatar;
import com.oopsididitagain.rpg_iter2.models.occupations.Smasher;
import com.oopsididitagain.rpg_iter2.models.occupations.Sneak;
import com.oopsididitagain.rpg_iter2.models.occupations.Summoner;
import com.oopsididitagain.rpg_iter2.utils.KeyBoardInput;

public class NPCInteractionController extends Controller {
	public static NPCInteractionController instance;
	Avatar avatar;
	GameMap gameMap;

	
	private NPCInteractionController(){
		createAvatar();
		createGameMap();

	}
	
	public static NPCInteractionController getInstance() {
		if ( instance == null ){
			instance = new NPCInteractionController();
		}
		return instance;
	}
	
	@Override
	public Controller takeInputAndUpdate(int key) {
		Controller controller = NPCInteractionController.getInstance();
		switch(key){
		case 1:
			//assignSmasher();
			talkToNPC();
			break;
		case 2:
			//assignSummoner();
			attackNPC();
			break;
		case 3:
			//assignSneak();
			useSkill();
			break;
		case 4:
			useItem();
			break;
		case 5:
			controller = GameController.getInstance();
			switchControllers((GameController)controller);
			break;
		}
		return controller;	
	}
	
	private void assignSmasher(){
		this.avatar.setOccupation(new Smasher());
	}
	private void assignSummoner(){
		this.avatar.setOccupation(new Summoner());
	}
	private void assignSneak(){
		this.avatar.setOccupation(new Sneak());
	}
	private void createEntityMapInteraction() {
		// TODO Auto-generated method stub
		
	}
	private void createGameMap() {
		// TODO Auto-generated method stub
		
	}
	private void createAvatar() {
		Position position = new Position(0,0);
		avatar = new Avatar("Avatar", position);
		
	}
	private void switchControllers(GameController controller){
		controller.setAvatar(this.avatar);
		controller.setMap(this.gameMap);
		//gameMap.notifyObserver();
	}
	private void talkToNPC(){
		
	}

	@Override
	public ModelViewInteraction populateInteraction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KeyBoardInput getKeyBoardInput() {
		// TODO Auto-generated method stub
		return null;
	}
}