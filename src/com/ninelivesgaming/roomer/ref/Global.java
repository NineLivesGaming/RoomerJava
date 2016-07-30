package com.ninelivesgaming.roomer.ref;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.ninelivesgaming.roomer.handlers.InputHandler;

public class Global {

	public static JFrame _FRAME;
	public static BufferedImage _BUFFER;
	public static Graphics _GRAPHICS;
	
	public static long lastFrameTime = System.currentTimeMillis();
	public static long lastUpdateTime = System.currentTimeMillis();
	public static boolean drawFrame = false;
	
	public static InputHandler inputHandler = new InputHandler();
	
	public static boolean running = true;
	
	public static void init(){
		try{
			_FRAME = new JFrame(Settings._NAME);
			_FRAME.getContentPane().setPreferredSize(new Dimension(Settings._WIDTH, Settings._HEIGHT));
			_FRAME.pack();
			
			_BUFFER = new BufferedImage(Settings._WIDTH, Settings._HEIGHT,BufferedImage.TYPE_INT_RGB);
			_GRAPHICS = _BUFFER.createGraphics();
			
			_FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			URL iconURL = Global.class.getResource("/res/icon.png");
			_FRAME.setIconImage(ImageIO.read(iconURL));
			_FRAME.setVisible(true);
		}catch(Exception e){
			System.out.println("nope");
		}
	}
}
