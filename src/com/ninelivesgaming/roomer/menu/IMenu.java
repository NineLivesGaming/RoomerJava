package com.ninelivesgaming.roomer.menu;

public interface IMenu {
	
	/**
	 * Load the menu, setting any variables necessary
	 */
	public void load();
	/**
	 * Calls the update function of the menu
	 */
	public void update();
	/**
	 * Draws the menu to the graphics buffer
	 */
	public void draw();
	/**
	 * Closes any open streams etc.
	 */
	public void unload(); 
}
