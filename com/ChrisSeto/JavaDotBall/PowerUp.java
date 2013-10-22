package com.ChrisSeto.JavaDotBall;
class PowerUp extends Ball
{
  Timer life;
  boolean done;
  int type;
  PowerUp()
  {

    super(new PVector(random(11, 800), random(11,500)), POWERUPSIZE, 1, color(0, 250, 0));
    done = false;
    life = new Timer(12);
    type = (int)random(0,PowerUpTypes.length);
  }
  void draw()
  {
    done = life.checkDone();
    super.draw();
  }
  //abstract Effect getEffect();
}
