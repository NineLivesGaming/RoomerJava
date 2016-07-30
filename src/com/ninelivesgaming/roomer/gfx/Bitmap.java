package com.ninelivesgaming.roomer.gfx;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.ninelivesgaming.roomer.ref.Global;

public class Bitmap {

	int[] pixels;
	int width, height;

	double rotation = 0;
	double scale = 1;

	/**
	 * Loads specified image file as the bitmaps data. Uses Class.getResource()
	 * @param filePath The image to be loaded
	 */
	public Bitmap(String filePath){
		try{
			final BufferedImage img = ImageIO.read(this.getClass().getResource(filePath));
			setPixels(img);
		}catch(final Exception e){
			//TODO custom exception handling
			e.printStackTrace();
		}
	}

	/**
	 * Draws the image to the graphics buffer
	 * @param xPos x position
	 * @param yPos y position
	 */
	public void draw(int xPos, int yPos){
		final double rotRad = Math.toRadians(rotation);
		((Graphics2D)Global._GRAPHICS).rotate(rotRad, xPos + ((width * scale) / 2), yPos + ((height * scale) / 2));
		for(int y = 0; y < height; y++){
			for(int x = 0; x < width; x++){
				final int tmpCol = pixels[(y * width) + x];
				if(tmpCol != 0){
					Global._GRAPHICS.setColor(new Color(tmpCol, true));
					for(int dy = 0; dy <= scale-1; dy++){
						for(int dx = 0; dx <= scale-1; dx++){
							Global._GRAPHICS.drawLine(xPos + x + dx, yPos + y + dy, xPos + x + dx, yPos + y + dy);
						}
					}
				}
			}
		}
		((Graphics2D)Global._GRAPHICS).setTransform(new AffineTransform());
	}

	/**
	 * Adds to the current rotation of the image
	 * @param degrees Angle to add, in degrees
	 */
	public void rotate(int degrees){
		rotation += degrees;
	}

	/**
	 * Redefines the Bitmap to a new set of pixels
	 * @param img BufferedImage to be used as new data
	 */
	public void setPixels(BufferedImage img){
		width = img.getWidth();
		height = img.getHeight();
		pixels = new int[width*height];
		for(int x = 0; x < width; x++){
			for(int y = 0; y < height; y++){
				int tmpRGB = img.getRGB(x,y);
				if(tmpRGB == -65281 || tmpRGB == -16711936){
					tmpRGB = 0;
				}
				pixels[(y * width) + x] = tmpRGB;
			}
		}
	}

	/**
	 * Sets the angle of rotation
	 * @param newRot Rotation to be set to, in degrees
	 */
	public void setRotation(int newRot){
		rotation = newRot;
	}
}
