package fr.parisnanterre.miage.poa.shapes.impl;

import fr.parisnanterre.miage.poa.shapes.impl.Point2D;

public class Point3D extends Point2D {

    private double z;

    public Point3D(double z)
    {
        super();
        this.z = z;
    }

    public double getZ() { return this.z; }
    public void setZ(double z) { this.z = z;}

    public void translate(double x , double y)
    {
        return;
    }


    public boolean isOrigin(boolean Origin)
    {
        return Origin;
    }
    public void distance(double Point2D)
    {
        return ;
    }
    @Override
    public String toString() {
        return String.format("(%d)", getZ());
    }



}
