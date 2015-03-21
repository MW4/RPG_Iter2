package com.oopsididitagain.rpg_iter2.models;

import com.oopsididitagain.rpg_iter2.models.entities.Npc;

import java.util.LinkedList;

public class Storyline { 
	private LinkedList<String> storyline = new LinkedList<String>(); 
	 
  	public Storyline(String story){ 
  		this.storyline.add(story); 
   	} 

  	public LinkedList<String> getStoryline(){
  		return this.storyline;
  	}
	
	

}
