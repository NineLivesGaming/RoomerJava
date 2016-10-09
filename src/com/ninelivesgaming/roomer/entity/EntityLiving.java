package com.ninelivesgaming.roomer.entity;

public class EntityLiving extends Entity {
	int health = 100, maxHealth = 100;
	boolean living = true;
	
	public EntityLiving(int maxHP){
		health = maxHP;
		maxHealth = maxHP;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getMaxHealth(){
		return maxHealth;
	}
	
	public void setMaxHealth(int newMaxHP){
		maxHealth = newMaxHP;
	}
	
	public void kill(){
		living = false;
	}
	
	public void damage(int damageAmount){
		health -= damageAmount;
		if(health <= 0){
			kill();
		}
	}
	
	public void heal(int healAmount){
		if((health += healAmount) > maxHealth){
			health = maxHealth;
		}
	}
}
