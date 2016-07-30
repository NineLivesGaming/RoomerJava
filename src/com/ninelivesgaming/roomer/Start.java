package com.ninelivesgaming.roomer;

import java.awt.Color;

import com.ninelivesgaming.roomer.ref.Global;
import com.ninelivesgaming.roomer.ref.Settings;

public class Start{
	
	public static long curTime = System.currentTimeMillis();
	
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
    
    public static void update(boolean draw){
    	Global.drawFrame = draw;
    	
    	//Update logic here
    	
    	Global.drawFrame = false;
    }
    
    public static void drawToScreen(){
    	Global._FRAME.getContentPane().getGraphics().drawImage(Global._BUFFER, 0, 0, null);
    	Global._GRAPHICS.setColor(Color.GRAY);
    	Global._GRAPHICS.fillRect(0, 0, Settings._WIDTH, Settings._HEIGHT);
    }
}
