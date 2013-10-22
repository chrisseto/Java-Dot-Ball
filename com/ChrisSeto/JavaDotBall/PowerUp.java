package com.ChrisSeto.JavaDotBall;

import java.awt.Color;
import com.ChrisSeto.JavaDotBall.Assets.*;

class PowerUp extends Ball {
	Timer life;
	boolean done;
	int type;

	PowerUp() {
		super(Assets.random(11, 800), Assets.random(11, 500), Assets.POWERUPSIZE,
				new Color(0, 250, 0));
		done = false;
		life = new Timer(12);
		type = (int) Assets.random(0, PowerUpType.length);
	}

	public void draw() {
		done = life.checkDone();
		super.draw();
	}
	// abstract Effect getEffect();
}
