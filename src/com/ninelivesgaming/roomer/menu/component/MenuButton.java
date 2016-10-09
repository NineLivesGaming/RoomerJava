package com.ninelivesgaming.roomer.menu.component;

import java.awt.Color;

import com.ninelivesgaming.roomer.ref.Global;

public abstract class MenuButton extends MenuComponent {

	String text;
	
	
	
	public MenuButton(int xPos, int yPos,int wid, int hei, String textInButton) {
		super(xPos, yPos, wid, hei);
		text = textInButton;
	}
	
	public String getText(){
		return text;
	}
	
	public void setText(String textInButton){
		text = textInButton;
	}
	
	@Override
	public void update(){
		/*
		 * If mouse is within button params
		 * 	   If mouse is pressed
		 *         onClick();
		 *     Else if mouse was pressed last tick
		 *         onRelease();
		 *     Else
		 *     	   onHover();
		 */
	}
	
	@Override
	public void draw(){
		Global._GRAPHICS.setColor(Color.DARK_GRAY);
		Global._GRAPHICS.fillRect(x, y, width, height);
		Global._GRAPHICS.setColor(Color.RED);
		Global._GRAPHICS.fillRect(x, y, width, height);
	}
	
	public abstract void onPress();

	public abstract void onHover();
	
	public abstract void onRelease();
	
	
}
