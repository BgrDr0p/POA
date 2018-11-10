package fr.parisnanterre.miage.poa.shapes.impl;

import fr.parisnanterre.miage.poa.shapes.impl.Shape2D;

public class Rectangle extends Shape2D {

   private double length,width;

    public Rectangle(Point2D refPoint,double length, double width) {
        super(refPoint);
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double perimeter()
    {
        return 2 * (this.width + this.length);
    }
    @Override
    public double surface()
    {
        return this.width * this.length;
    }
}
