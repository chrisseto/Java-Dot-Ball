package com.ChrisSeto.JavaDotBall;

import java.util.ArrayList;
import java.math.*;

public class EnemyController {
	private ArrayList<EnemyBall> reds;
	private ArrayList<DeadEnemyBall> dead;
	private int stage, redSize;
	Timer spawnNext;

	EnemyController() {
		reds = new ArrayList<EnemyBall>();
		dead = new ArrayList<DeadEnemyBall>();
		spawnNext = new Timer(1);
	}

	void draw() {
		for (int i = 0; i < reds.size(); i++)
			reds.get(i).draw();
		for (int i = 0; i < dead.size(); i++)
			dead.get(i).draw();
	}

	void update(BVector player) {
		for (int i = 0; i < reds.size(); i++)
			reds.get(i).update(player, reds);
		for (int i = 0; i < dead.size(); i++) {
			dead.get(i).update();
			if (dead.get(i).done)
				dead.remove(i);
		}
	}

	void destroyBall(int i) {
		dead.add(new DeadEnemyBall(reds.get(i).position));
		reds.remove(i);
	}

	void endStage() {
		reds.clear();
	}

	boolean checkCollision(Player player) {
		for (EnemyBall b : reds) {
			if (player.checkCollision(b))
				return true;
		}
		return false;
	}

	void checkCollisionPowerUps(ArrayList<? extends PowerUpField> powerUps,
			ArrayList<? extends PlayerMod> playerMods) {
		for (int i = 0; i < powerUps.size(); i++) {
			for (int x = 0; x < reds.size(); x++) {
				if (powerUps.get(i).checkCollision(reds.get(x))) {
					switch (powerUps.get(i).getEffect()) {
					case KILL:
						destroyBall(x);
						break;
					}
				}
			}
		}
		for (int i = 0; i < playerMods.size(); i++) {
			for (int x = 0; x < reds.size(); x++) {
				if (playerMods.get(i).checkCollision(reds.get(x))) {
					switch (playerMods.get(i).getEffect()) {
					case KILL:
						destroyBall(x);
						break;
					}
					playerMods.get(i).collided();
				}
			}
		}
	}

	void generateEnemies() {
		if (spawnNext.checkDone()) {
			// TODO add random shape spawns after 30~ seconds
			int runningTime = System.currentTimeMillis() / 1000;
			float time1 = (30 / (runningTime + 1)) + 1;
			float time2 = (10 / (runningTime + 1));
			spawnNext = new Timer(random(time2, time1));
			reds.add(new EnemyBall(random(0, width), random(0, height)));
			System.out.println("New Enemy spawned at "
					+ reds.get(reds.size() - 1).position);
			System.out.println("Next Spawn in " + spawnNext.life + " seconds");
		}
	}

	void spawnRect(int x, int y, int Width, int Length) {
		for (int i = x; i < (x + Width); i += Assets.ENEMYSIZE) {
			reds.add(new EnemyBall(i, y));
			reds.add(new EnemyBall(i, y + Length));
		}
		for (int i = y; i < (y + Length); i += Assets.ENEMYSIZE) {
			reds.add(new EnemyBall(x, i));
			reds.add(new EnemyBall(x + Width, i));
		}
	}

	void spawnCircle(int x, int y, int radius) {
		for (float i = 0; i < (2 * Math.PI); i += (Math.PI / 8)) {
			reds.add(new EnemyBall(x + radius * Math.cos(i), y + radius * Math.sin(i)));
		}
	}
}
