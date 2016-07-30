package com.ninelivesgaming.roomer.ref;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.ninelivesgaming.roomer.handlers.InputHandler;

public class Global {

	public static JFrame frame;
	public static BufferedImage buffer;
	public static Graphics graphics;
	
	public static InputHandler inputHandler = new InputHandler();
	
	public static boolean running = true;
	
	public static void init(){
		try{
			frame = new JFrame(Settings._NAME);
			frame.getContentPane().setPreferredSize(new Dimension(Settings._WIDTH, Settings._HEIGHT));
			frame.pack();
			
			buffer = new BufferedImage(Settings._WIDTH, Settings._HEIGHT,BufferedImage.TYPE_INT_RGB);
			graphics = buffer.createGraphics();
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			URL iconURL = Global.class.getResource("/res/icon.png");
			frame.setIconImage(ImageIO.read(iconURL));
			frame.setVisible(true);
		}catch(Exception e){
			System.out.println("nope");
		}
	}
}
