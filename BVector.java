package com.ChrisSeto.BallDotJava

//BVector is meant to be a clone of processings PVector
//Might need to change ints to floats....
import java.Math;

public class BVector
{
	private int x,y;
	
	public BVector(int x, int y)
	{
		this.x = x;
		this.y = y;
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
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void mult(int scalar)
	{
		this.x *= scalar;
		this.y *= scalar;
	}
	public static BVector fromAngle(float angle)
	{
		return BVector(Math.Cos(angle),Math.Sin(angle));	
	}
	public float mag()
	{
		//To do :/
	}
	public float distance(BVector other)
	{
		return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
	}
}
