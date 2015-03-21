package com.oopsididitagain.rpg_iter2.controllers.menu_controllers;


import com.oopsididitagain.rpg_iter2.controllers.Controller;
import com.oopsididitagain.rpg_iter2.controllers.GameController;
import com.oopsididitagain.rpg_iter2.model_view_interaction.AvatarCreationMenuViewInteraction;
import com.oopsididitagain.rpg_iter2.model_view_interaction.MainMenuViewInteraction;
import com.oopsididitagain.rpg_iter2.model_view_interaction.ModelViewInteraction;
import com.oopsididitagain.rpg_iter2.models.GameMap;
import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.entities.Avatar;
import com.oopsididitagain.rpg_iter2.models.menus.AvatarCreationMenu;
import com.oopsididitagain.rpg_iter2.models.menus.MainMenu;
import com.oopsididitagain.rpg_iter2.models.occupations.Smasher;
import com.oopsididitagain.rpg_iter2.models.occupations.Sneak;
import com.oopsididitagain.rpg_iter2.models.occupations.Summoner;
import com.oopsididitagain.rpg_iter2.utils.AvatarCreationMenuKeyboardInput;
import com.oopsididitagain.rpg_iter2.models.stats.StatBlob;
import com.oopsididitagain.rpg_iter2.utils.KeyBoardInput;

public class AvatarCreationMenuController extends Controller {
	public static AvatarCreationMenuController instance;
	Avatar avatar;
	GameMap gameMap;
	private static AvatarCreationMenu avatarCreationMenu;
	private AvatarCreationMenuKeyboardInput keyboardInput;
	
	private AvatarCreationMenuController(){
		createAvatar();
		createGameMap();
		this.keyboardInput = new AvatarCreationMenuKeyboardInput(avatarCreationMenu);
	}
	
	public static AvatarCreationMenuController getInstance() {
		if ( instance == null ){
			avatarCreationMenu = new AvatarCreationMenu();
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
			break;
		case 2:
			controller = GameController.getInstance();
			assignSummoner();
			break;
		case 3:
			assignSneak();
			break;
		case 4:
			controller = GameController.getInstance();
			//switchControllers((GameController)controller);
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
		StatBlob statBlob = new StatBlob(0, 0, 0, 0, 0, 0, 0, 20, 20);
		avatar = new Avatar("Avatar", position,statBlob);
		
	}
	private void switchControllers(GameController controller){
		controller.setAvatar(this.avatar);
		controller.setMap(this.gameMap);
		//gameMap.notifyObserver();
	}

	@Override
	public ModelViewInteraction populateInteraction() {
		AvatarCreationMenuViewInteraction avatarCreationMenuViewInteraction = new AvatarCreationMenuViewInteraction(this.avatarCreationMenu);
		return avatarCreationMenuViewInteraction;
	}

	@Override
	public KeyBoardInput getKeyBoardInput() {
		return keyboardInput;
	}
}
