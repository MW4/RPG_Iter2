package com.oopsididitagain.rpg_iter2.model_view_interaction;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import com.oopsididitagain.rpg_iter2.assets.Assets;
import com.oopsididitagain.rpg_iter2.models.entities.Npc;
import com.oopsididitagain.rpg_iter2.models.menus.MainMenu;
import com.oopsididitagain.rpg_iter2.models.menus.MenuButton;
import com.oopsididitagain.rpg_iter2.views.View;

public class NPCViewInteraction extends ModelViewInteraction{
	private MainMenu mainMenu;
	Assets assets;
	
	private MenuButton newGameButton;
	private MenuButton loadGameButton;
	private MenuButton controlsButton;
	
	Npc npc;
	
	public  NPCViewInteraction(MainMenu mainMenu, Npc npc) { //constructor
		this.npc = npc;
		
		
	}
	@Override
	public void accept(View view) {
		view.visit(this);
		
	}
	@Override
	public void drawModel(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.red);
        g2.fill(new RoundRectangle2D.Float(120, 90, 360, 360, 20, 20));
        
        int x = 130, y = 90;
        
        ArrayList<String> npcStory = new ArrayList<String>();
        for(int i = 0; i < npc.getNPCStory(npc).getStoryline().size(); i++){
        	npcStory.add(npc.getNPCStory(npc).getStoryline().get(i));
        }
        
        for (int i = 0; i < npcStory.size(); i++) 
        {
        	g2.setPaint(Color.blue);
        	g2.drawString(npcStory.get(i), x, y += g2.getFontMetrics().getHeight());	 
        }
		

		//BufferedImage bf = assets.getBufferedImage(0);
		//g.drawImage(bf, 0, 0, null);
		}
}