package fr.parisnanterre.miage.poa.shapes.impl;

public class Cuboid extends Shape3D {

    private double length, width, height;

    public Cuboid() {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;


    }

    public double volume()
    {
        return this.length * this.height * this.width;
    }
    public double surface()
    {
        return 2*(this.length*this.height+this.length*this.width+this.height*this.width);
    }
}
