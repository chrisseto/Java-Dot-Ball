package com.ChrisSeto.JavaDotBall;

//BVector is meant to be a clone of processings PVector
//Might need to change ints to doubles....
import java.math.*;

public class BVector
{
	public double x,y;  //This maybe be changed later on
	
	public BVector(double x, double y)
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
		this.x += other.x;
		this.y += other.y;
	}

	public void sub(BVector other)
	{
		this.x -= other.x;
		this.y -= other.y;
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
	public static BVector fromAngle(double angle)
	{
		return new BVector(Math.cos(angle),Math.sin(angle));	
	}
	public double mag()
	{
		return Math.sqrt(x*x + y*y);
	}
	public double magsq()
	{
		return mag()*mag();
	}
	public double distance(BVector other)
	{
		return Math.sqrt((this.x-other.x)*(this.x-other.x) + (this.y-other.y)*(this.y-other.y));
	}
	public void normalize()
	{
		double mag = this.mag();
		this.x/= mag;
		this.y/= mag;
	}
}
