package ru.stqa.qa.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void positiveNumbersTest() {
        Point p1 = new Point(5, 6);
        Point p2 = new Point(7, 8);
        Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    }

    @Test
    public void negativeNumbersTest() {
        Point p1 = new Point(-8, -9);
        Point p2 = new Point(-3, -4);
        Assert.assertEquals(p1.distance(p2), 7.0710678118654755);
    }

    @Test
    public void nullNumbersTest() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 5);
        Assert.assertEquals(p1.distance(p2), 0.0);
    }
}
