package com.ninelivesgaming.roomer.entity;

/**
 * The base class for any and all object that are considered Entities
 * @author Alex
 *
 */
public class Entity {
	 float x, y;
	 
	 /**
	  * Returns the Y coordinate of the entity
	  * @return X coordinate
	  */
	 public float getX(){
		 return x;
	 }
	 
	 /**
	  * Returns the Y coordinate of the entity
	  * @return Y coordinate
	  */
	 public float getY(){
		 return y;
	 }
	 
	 /**
	  * Sets the X coordinate of the entity
	  * @param newX New X coordinate
	  */
	 public void setX(float newX){
		 x = newX;
	 }
	 
	 /**
	  * Sets the X coordinate of the entity
	  * @param newX New X coordinate
	  */
	 public void setX(int newX){
		 x = newX;
	 }
	 
	 /**
	  * Sets the Y coordinate of the entity
	  * @param newY New Y coordinate
	  */
	 public void setY(float newY){
		 y = newY;
	 }
	 
	 /**
	  * Sets the Y coordinate of the entity
	  * @param newY New Y coordinate
	  */
	 public void setY(int newY){
		 y = newY;
	 }
}
