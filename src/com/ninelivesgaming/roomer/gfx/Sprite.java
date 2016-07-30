package com.ninelivesgaming.roomer.gfx;

public class Sprite {

	Bitmap spritesheet;
	
	public Sprite(String filename){
		spritesheet = new Bitmap(filename);
	}
}