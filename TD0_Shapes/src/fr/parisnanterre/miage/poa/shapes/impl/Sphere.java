package fr.parisnanterre.miage.poa.shapes.impl;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere()
    {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double volume()
    {
        return (4*Math.PI/3)*this.radius;
    }
}
