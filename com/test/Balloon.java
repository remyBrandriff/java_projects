package com.test;

public class Balloon
{
  double r;

  public Balloon(double initialR)
  {
    r = initialR;
  }

  public double getRadius()
  {
    return r;
  }

  public double getVolume()
  {
    return 4 * Math.PI * r * r * r / 3;
  }

  public void inflate(double radiusChange)
  {
    if (radiusChange < 0)
    {
      throw new IllegalArgumentException("inflation amount must be positive");
    }
    else if (r + radiusChange > 100)
    {
      throw new IllegalArgumentException("cannot inflate balloon to a radius greater than 100");
    }
    r += radiusChange;
  }
}
