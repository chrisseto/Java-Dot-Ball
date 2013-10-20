package com.ChrisSeto.BallDotJava

//BVector is meant to be a clone of processings PVector

public class BVector
{
	private int x,y;
	
	public BVector(int x, int y)
	{
	}
	
	public BVector()
	{
		this(0,0);
	}	
	
	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public void add(BVector other)
	{
		this.x += other.getX();
		this.y += other.getY();
	}

	public void sub(BVector other)
	{
		this.x -= other.getX();
		this.y -= other.getY();
	}
}
