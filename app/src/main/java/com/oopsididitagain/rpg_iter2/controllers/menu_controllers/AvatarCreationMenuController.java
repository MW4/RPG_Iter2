package com.oopsididitagain.rpg_iter2.controllers.menu_controllers;


import com.oopsididitagain.rpg_iter2.controllers.Controller;
import com.oopsididitagain.rpg_iter2.controllers.GameController;
import com.oopsididitagain.rpg_iter2.models.GameMap;
import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.entities.Avatar;
import com.oopsididitagain.rpg_iter2.models.occupations.Smasher;
import com.oopsididitagain.rpg_iter2.models.occupations.Sneak;
import com.oopsididitagain.rpg_iter2.models.occupations.Summoner;

public class AvatarCreationMenuController extends Controller {
	public static AvatarCreationMenuController instance;
	Avatar avatar;
	GameMap gameMap;

	
	private AvatarCreationMenuController(){
		createAvatar();
		createGameMap();

	}
	
	public static AvatarCreationMenuController getInstance() {
		if ( instance == null ){
			instance = new AvatarCreationMenuController();
		}
		return instance;
	}
	
	@Override
	public Controller takeInputAndUpdate(int key) {
		Controller controller = AvatarCreationMenuController.getInstance();
		switch(key){
		case 1:
			assignSmasher();
		case 2:
			assignSummoner();
		case 3:
			assignSneak();
		case 4:
			controller = GameController.getInstance();
			switchControllers((GameController)controller);
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
		avatar = new Avatar(position);
		
	}
	private void switchControllers(GameController controller){
		controller.setAvatar(this.avatar);
		controller.setMap(this.gameMap);
		//gameMap.notifyObserver();
	}
}