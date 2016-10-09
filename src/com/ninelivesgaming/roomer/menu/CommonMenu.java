package com.ninelivesgaming.roomer.menu;

import com.ninelivesgaming.roomer.menu.component.MenuComponent;

public abstract class CommonMenu {
	
	/**
	 * Load the menu, setting any variables necessary
	 */
	public abstract void load();
	/**
	 * Calls the update function of the menu
	 */
	public abstract void update();
	/**
	 * Draws the menu to the graphics buffer
	 */
	public abstract void draw();
	/**
	 * Closes any open streams etc.
	 */
	public abstract void unload();
	
	public void addComponent(MenuComponent mc){
		
	}
}
