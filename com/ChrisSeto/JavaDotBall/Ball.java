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
		setPosition(new BVector(x,y));
		this.size = size;
		this.color = color;
	}
	
	public double getX()
	{
		return getPosition().x;
	}
	
	public double getY()
	{
		return getPosition().y;
	}

	public boolean checkCollision(Ball other)
  	{
    		return(BVector.sub(other.getPosition(),getPosition()).magsq() <= ((size+other.size)/2)*((size+other.size)/2));  
  	}

	public void update()
	{
		getPosition().add(velocity);
		checkBoundaryCollition();
	}
	
	void checkBoundaryCollition() //I'm broken still :[
	{
		if (getPosition().x > Assets.WIDTH-size/2)
			getPosition().x = Assets.WIDTH-size/2;
		if (getPosition().x <size/2)
			getPosition().x = size/2;
		if (getPosition().y > Assets.HEIGHT-size/2)
			getPosition().y = Assets.HEIGHT-size/2;
		if (getPosition().y< size/2)
			getPosition().y =size/2;
	}
	public void draw() //I dunno what args this needs lol
	{
		//Draw bitmap here
	}

	public BVector getPosition() {
		return position;
	}

	public void setPosition(BVector position) {
		this.position = position;
	}
}
