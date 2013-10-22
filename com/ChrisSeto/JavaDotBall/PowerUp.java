package com.ChrisSeto.JavaDotBall;

import java.awt.color.*;

class PowerUp extends Ball {
	Timer life;
	boolean done;
	int type;

	PowerUp() {

		super(new BVector(random(11, 800), random(11, 500)), POWERUPSIZE, 1,
				Color(0, 250, 0));
		done = false;
		life = new Timer(12);
		type = (int) random(0, PowerUpType.length);
	}

	void draw() {
		done = life.checkDone();
		super.draw();
	}
	// abstract Effect getEffect();
}
