package com.oopsididitagain.rpg_iter2;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import com.oopsididitagain.rpg_iter2.model_view_interaction.NPCViewInteraction;
import com.oopsididitagain.rpg_iter2.models.Position;
import com.oopsididitagain.rpg_iter2.models.entities.Npc;
import com.oopsididitagain.rpg_iter2.models.menus.MainMenu;
import com.oopsididitagain.rpg_iter2.views.View;

import java.awt.*;
import java.util.Observer;

/**
 *
 *
 */
public class RunGame extends JFrame{


private static GameLoop loop;
//private static MainMenu
	public static void main(String[] args) throws InterruptedException {
		View g;
		Position xy = new Position(0,0);
		Npc test = new Npc("1", xy, "Hi!");
		System.out.println(Npc.getNPCStory().getStoryline(0));
		n.drawModel(g);
//		loop = new GameLoop();
	//    SwingUtilities.invokeLater(new Runnable() {
		//	@Override
			//public void run() {
				//RunGame runGame = new RunGame();
				//runGame.initialize();
			//}
	    //});

		//loop.runGame();
	}
	
	private void initialize() {
		//this.setLayout(new MigLayout("", "[grow, fill]", "[grow, fill]"));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 700);
		this.setLocationRelativeTo(null); // places frame into center of screen
		this.setTitle("OOPs I Did It Again!");
		this.setVisible(true);
		this.setResizable(false);
		this.add(loop.getView());
		
	}

}
