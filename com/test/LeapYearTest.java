package com.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LeapYearTest {
  @Test
  public void testYear2015ShouldNotBeLeapYear() {
    assertFalse("2015 should not be a leap year", LeapYear.isLeapYear(2015));
  }

  @Test
  public void testYear2016ShouldBeLeapYear() {
    assertTrue("2016 should be a leap year", LeapYear.isLeapYear(2016));
  }

  @Test
  public void testYear2000ShouldBeLeapYear() {
    assertTrue("2000 should be a leap year", LeapYear.isLeapYear(2000));
  }

  @Test
  public void testYear1700ShouldNotBeLeapYear() {
    assertFalse("1700 should not be a leap year", LeapYear.isLeapYear(1700));
  }
}
