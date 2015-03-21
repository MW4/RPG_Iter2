package com.oopsididitagain.rpg_iter2.views;

import com.oopsididitagain.rpg_iter2.models.menus.NPCInteractionMenu;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;


/**
 *
 * void	update(Observable o, Object arg) This method is called whenever the observed object is changed.
 *
 */
public class NPCTalkView extends JPanel implements Observer {

    private NPCInteractionMenu menu;
    
    public NPCTalkView(){//Constructor
        menu = new NPCInteractionMenu();

    }


    @Override
    public void update(Observable obj, Object arg) {
        menu = (NPCInteractionMenu)obj;
    }

 
}