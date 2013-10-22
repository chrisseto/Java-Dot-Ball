package com.ChrisSeto.JavaDotBall;

import java.awt.Color;

public class Player extends Ball
{
	public Player()
	{
		super(Assets.WIDTH/2,Assets.HEIGHT/2,Assets.PLAYERSIZE,Color.BLUE);
		//init position will always be in the middle of the screen
	}	

	@Override
	public void update()
	{
		//Process User input or just read in
		super.update();
	}
	
	//For power ups etc
	//Has another ball "kill zone?"
	//check collisionkillzone + check collision
}
