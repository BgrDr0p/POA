package fr.parisnanterre.miage.poa.shapes.impl;

public abstract class Shape3D {
    public abstract double volume();

    public abstract void translate (int dx, int dy);

    @Override
    public double surface() {
        return 0;
    }
}
