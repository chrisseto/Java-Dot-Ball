package com.ChrisSeto.JavaDotBall;

import android.graphics.Bitmap;

//This class is purely for resources and what not

public class Assets {
	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;
	public static final int PLAYERSIZE = 20;
	public static final int ENEMYSIZE = 12;

	public enum Effect {
		Kill, Freeze, Shock, Statis
	}

	public enum PowerUpType {
		Blast, Spike, Shield
	}
}
