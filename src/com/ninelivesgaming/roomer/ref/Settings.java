package com.ninelivesgaming.roomer.ref;

import java.util.Scanner;

public class Settings {
	public static int _WIDTH = 800, 
					  _HEIGHT = 600, 
					  _FPS = 30;

	public static String _NAME = "Roomer";

	public static void init(){
		Scanner s = new Scanner("config.ini");
		while(s.hasNext()){
			String[] line = s.nextLine().split("=");
			switch(line[0].toLowerCase()){
			case "fps":
				_FPS = Integer.parseInt(line[1]);
				break;
			case "width":
				_WIDTH = Integer.parseInt(line[1]);
				break;
			case "height":
				_HEIGHT = Integer.parseInt(line[1]);
				break;
			}
		}
		s.close();
	}
}
