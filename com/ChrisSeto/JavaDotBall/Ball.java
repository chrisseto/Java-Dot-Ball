package com.ChrisSeto.JavaDotBall;

import java.awt.Color;

public abstract class Ball
{
	private BVector position, velocity;
	private int size;
	private Color color;
	private Bitmap bitmap; //This should always be loaded from the child class
	Ball(int x, int y, int size, Color color)
	{
		position = new Point(x,y);
		this.size = size;
		this.color = color;
	}
	
	public int getX()
	{
		return position.x;
	}
	
	public int getY()
	{
		return position.y;
	}

	public boolean checkCollision(Ball other)
  	{
    		return(BVector.sub(other.position,position).magSq() <= ((size+other.size)/2)*((size+other.size)/2));  
  	}

	void update()
	{
		position.add(velocity);
		checkBoundaryCollition();
	}
	
	void checkBoundaryCollition() //I'm broken still :[
	{
		if (position.x > width-size/2)
			position.x = width-size/2;
		if (position.x <size/2)
			position.x = size/2;
		if (position.y > height-size/2)
			position.y = height-size/2;
		if (position.y< size/2)
			position.y =size/2;
	}
	public void draw() //I dunno what args this needs lol
	{
		//Draw bitmap here
	}
}
