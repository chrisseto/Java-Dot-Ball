package com.ChrisSeto.BallDotJava

public abstract Ball
{
	private Point location;
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
}
