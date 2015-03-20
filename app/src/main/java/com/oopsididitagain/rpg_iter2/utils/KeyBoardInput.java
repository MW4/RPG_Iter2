package com.oopsididitagain.rpg_iter2.utils;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardInput implements KeyListener {

	int input = -5;

	public int getInput() {
		int temp = input;
		input = -5;
		return temp;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int temp = e.getKeyCode() - 96;
		if (temp > 0 && temp <= 9) {
			input = temp;
			return;
		}
		switch (e.getKeyChar()) {
		case 'q':
			input = Commands.MOVE_NORTH_WEST;
			break;
		case 'w':
			input = Commands.MOVE_NORTH;
			break;
		case 'e':
			input = Commands.MOVE_NORTH_EAST;
			break;
		case 'd':
			input = Commands.MOVE_EAST;
			break;
		case 'c':
			input = Commands.MOVE_SOUTH_EAST;
			break;
		case 'x':
			input = Commands.MOVE_SOUTH;
			break;
		case 'z':
			input = Commands.MOVE_SOUTH_WEST;
			break;
		case 'a':
			input = Commands.MOVE_WEST;
			break;
		case 's':
			input = Commands.USE;
			break;
		case 'p':
			input = Commands.PAUSE;
			break;
		case KeyEvent.VK_ENTER:
			input = Commands.ENTER;
			break;
		case 'i':
			input = Commands.INVENTORY;
			break;
		case 'j':
			input = Commands.EQUIP;
			break;
		case 'k':
			input = Commands.DROP;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
