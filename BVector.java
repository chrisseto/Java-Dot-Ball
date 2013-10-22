package com.ChrisSeto.JavaDotBall

//BVector is meant to be a clone of processings PVector
//Might need to change ints to floats....
import java.Math;

public class BVector
{
	public int x,y;  //This maybe be changed later on
	
	public BVector(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public BVector()
	{
		this(0,0);
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
		return Math.sqrt(x*x + y*y);
	}
	public float magsq()
	{
		return mag()*mag();
	}
	public float distance(BVector other)
	{
		return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
	}
	public void normalize()
	{
		float mag = this.mag();
		this.x/= mag;
		this.y/= mag;
	}
}
