package com.ChrisSeto.JavaDotBall;

import java.awt.Color;

public abstract class Ball
{
	private BVector position, velocity;
	private double size;
	private Color color;
	//private Bitmap bitmap; //This should always be loaded from the child class
	Ball(double x, double y, double size, Color color)
	{
		position = new BVector(x,y);
		this.size = size;
		this.color = color;
	}
	
	public double getX()
	{
		return position.x;
	}
	
	public double getY()
	{
		return position.y;
	}

	public boolean checkCollision(Ball other)
  	{
    		return(BVector.sub(other.position,position).magsq() <= ((size+other.size)/2)*((size+other.size)/2));  
  	}

	public void update()
	{
		position.add(velocity);
		checkBoundaryCollition();
	}
	
	void checkBoundaryCollition() //I'm broken still :[
	{
		if (position.x > Assets.WIDTH-size/2)
			position.x = Assets.WIDTH-size/2;
		if (position.x <size/2)
			position.x = size/2;
		if (position.y > Assets.HEIGHT-size/2)
			position.y = Assets.HEIGHT-size/2;
		if (position.y< size/2)
			position.y =size/2;
	}
	public void draw() //I dunno what args this needs lol
	{
		//Draw bitmap here
	}
}
