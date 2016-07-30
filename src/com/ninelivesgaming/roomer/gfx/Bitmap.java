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

	public Bitmap(String filePath){
		try{
			final BufferedImage img = ImageIO.read(this.getClass().getResource(filePath));
			setPixels(img);
		}catch(final Exception e){
			//TODO custom exception handling
			e.printStackTrace();
		}
	}

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

	public void rotate(int degrees){
		rotation += degrees;
	}

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

	public void setRotation(int newRot){
		rotation = newRot;
	}
}
