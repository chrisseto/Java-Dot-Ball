package com.ChrisSeto.BallDotJava

public abstract Ball
{
	Point location;
	int size;
	Ball(int x, int y, int size)
	{
		location = new Point(x,y);
	}
}
