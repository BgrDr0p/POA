package fr.parisnanterre.miage.poa.shapes.impl;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTest {

    Rectangle R1;

    @BeforeMethod
    public void setUp() {
        Point2D p= new Point2D(0,0);
        R1 = new Rectangle(p,4,3);

    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testPerimeter() {
        assertEquals(R1.perimeter(),14);
    }

    @Test
    public void testSurface() {
        assertEquals(R1.surface(),12);
    }
}