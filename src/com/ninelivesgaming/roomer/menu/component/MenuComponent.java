package com.ninelivesgaming.roomer.menu.component;

import java.util.UUID;

public class MenuComponent {
	int x, y, width, height;
	UUID id;
	
	/**
	 * Initializes a basic component to be used in a menu
	 * @param xPos The far left coordinate
	 * @param yPos The top coordinate
	 * @param wid Width of component
	 * @param hei height of component
	 */
	public MenuComponent(int xPos, int yPos, int wid, int hei){
		x = xPos;
		y = yPos;
		width = wid;
		height = hei;
		id = UUID.randomUUID();
	}
	
	public void update(){
		
	};
	
	public void draw(){
		
	}
	
	public void setX(int newX){
		x = newX;
	}
	
	public int getX(){
		return x;
	}
	
	public void setY(int newY){
		y = newY;
	}
	
	public int getY(){
		return y;
	}
}
