package com.ninelivesgaming.roomer.menu;

import com.ninelivesgaming.roomer.menu.component.*;
import com.ninelivesgaming.roomer.ref.Global;

public class MainMenu extends CommonMenu{
	
	MenuComponent[] components = new MenuComponent[1];

	@Override
	public void load() {
		components[0] = new MenuButton(10, 10, 100, 20, "Test Button"){

			@Override
			public void onPress() {
				System.out.println("Press");
			}

			@Override
			public void onHover() {
				System.out.println("Hover");
				// TODO Auto-generated method stub
			}

			@Override
			public void onRelease() {
				System.out.println("Release");
				// TODO Auto-generated method stub
			}};
	}

	@Override
	public void update() {
		for(MenuComponent mc : components){
			mc.update();
		}
		if(Global.drawFrame){
			draw();
		}
	}

	@Override
	public void draw() {
		for(MenuComponent mc : components){
			mc.draw();
		}
	}

	@Override
	public void unload() {
		// TODO Auto-generated method stub
		
	}

}
