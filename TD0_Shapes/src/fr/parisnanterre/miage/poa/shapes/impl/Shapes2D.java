package fr.parisnanterre.miage.poa.shapes.impl;
import fr.parisnanterre.miage.poa.shapes.api.Translatable;

public abstract class Shape2D implements Translatable {

    private Point2D refPoint;

    public Shape2D(Point2D refPoint) {
        this.refPoint = refPoint;
    }


    @Override
    public Point2D getRefPoint()
    {
        return refPoint;
    }