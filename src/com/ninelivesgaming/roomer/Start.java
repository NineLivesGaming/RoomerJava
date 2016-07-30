package com.ninelivesgaming.roomer;

import com.ninelivesgaming.roomer.ref.Global;
import com.ninelivesgaming.roomer.ref.Settings;

public class Start{
	
	public static long curTime = System.currentTimeMillis(), lastTime = System.currentTimeMillis();
	
    public static void main(String args[]) throws Exception{
        Settings.init();
        Global.init();
        while(Global.running){
        	update();
        	curTime = System.currentTimeMillis();
        	if(curTime - lastTime >= (1000.0 / Settings._FPS)){
        		lastTime = curTime;
        		drawToScreen();
        	}
        }
    }
    
    public static void update(){
    	
    }
    
    public static void drawToScreen(){
    	Global.frame.getContentPane().getGraphics().drawImage(Global.buffer, 0, 0, null);
    }
}
