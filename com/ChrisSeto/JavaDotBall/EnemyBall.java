package com.ChrisSeto.JavaDotBall;

import java.awt.Color;


public class EnemyBall extends Ball
{
	public EnemyBall(double x, double y)
	{
		super(x,y,Assets.ENEMYSIZE,Color.RED);
		//bitmap = loadBitMap(Assets.ENEMYBITMAP);
	}
	public void die()
	{
		//Spawns a Dead Enemy class which is just drawn and faded out
		//Could probs be done better
	}
}
