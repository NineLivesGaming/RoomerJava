package com.ninelivesgaming.roomer;

import java.awt.Color;

import com.ninelivesgaming.roomer.ref.Global;
import com.ninelivesgaming.roomer.ref.Settings;

public class Start{
	public static long curTime = System.currentTimeMillis();
	
	/**
	 * Initializes settings and starts the game loop
	 * @param args
	 */
    public static void main(String args[]){
        Settings.init();
        Global.init();
        while(Global.running){
        	curTime = System.currentTimeMillis();
        	if(curTime - Global.lastFrameTime > (1000.0 / Settings._FPS)){
        		Global.lastFrameTime = curTime;
        		update(true);
        		drawToScreen();
        	}else{
        		update(false);
        	}
        	Global.lastUpdateTime = System.currentTimeMillis();
        }
    }
    
    /**
     * Performs the logic and calculation of the game loop
     * @param draw whether or not this is a drawn frame
     */
    public static void update(boolean draw){
    	Global.drawFrame = draw;
    	
    	//Update logic here
    	
    	Global.drawFrame = false;
    }
    
    /**
     * Draws the current buffer to the screen and starts the new buffer.
     */
    public static void drawToScreen(){
    	Global._FRAME.getContentPane().getGraphics().drawImage(Global._BUFFER, 0, 0, null);
    	Global._GRAPHICS.setColor(Color.GRAY);
    	Global._GRAPHICS.fillRect(0, 0, Settings._WIDTH, Settings._HEIGHT);
    }
}
