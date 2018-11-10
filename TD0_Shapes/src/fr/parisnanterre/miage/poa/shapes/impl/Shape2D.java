package fr.parisnanterre.miage.poa.shapes.impl;

import fr.parisnanterre.miage.poa.shapes.api.Translatable2D;

public abstract class Shape2D extends Shape implements Translatable2D {

    private Point2D refPoint;

    public Shape2D(){}

    @Override
    public Point2D getRefPoint() {
        return refPoint;
    }

    public void setRefPoint(Point2D refPoint) {
        this.refPoint = refPoint;
    }


    public abstract double perimeter();




}
