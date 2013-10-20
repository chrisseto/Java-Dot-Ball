package com.ChrisSeto.BallDotJava

public abstract Ball
{
	private BVector location;
	private int size;
	Ball(int x, int y, int size)
	{
		location = new Point(x,y);
	}
	
	public in getX()
	{
		return location.x;
	}
	
	public int getY()
	{
		return location.y;
	}

	public boolean checkCollision(Ball other)
  	{
    		return(PVector.sub(other.position,position).magSq() <= ((size+other.size)/2)*((size+other.size)/2));  
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
}
