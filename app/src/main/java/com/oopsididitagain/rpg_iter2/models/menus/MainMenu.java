package com.oopsididitagain.rpg_iter2.models.menus;




public class MainMenu {
	private String options[];
	private int currentOption;

    public MainMenu(){
        options = new String[]{"New Game", "Load Game", "Controls", "none"};
        
        currentOption = 3;
       
    }
    
    public void setOption(int option){
    	
    	currentOption = option;
    }
    
    public int getCurrentOption(){
    	
    	return currentOption;
    }
    public String getOptions(int i){
    	return options[i];

    }


}
