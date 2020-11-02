package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class BalloonTest {

  @Test
  public void testGetRadiusShouldReturnRadius() {
    Balloon b = new Balloon(50);
    assertEquals("radius should be 50", 50, b.getRadius(), 0.01);
  }

  @Test
  public void testGetVolumeShouldReturnVolume() {
    Balloon b = new Balloon(2);
    assertEquals("volume should be 33.51", 33.51, b.getVolume(), 0.01);
  }

  @Test
  public void testPositiveInflateShouldIncreaseRadius() {
    Balloon b = new Balloon(50);
    b.inflate(5);
    double newRadius = b.getRadius();
    assertEquals("50 + 5 must be 55", 55, newRadius, 0.01);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNegativeInflateShouldThrowException() {
    Balloon b = new Balloon(50);
    b.inflate(-10);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExcessiveInflateShouldThrowException() {
    Balloon b = new Balloon(50);
    b.inflate(120);
  }
}
