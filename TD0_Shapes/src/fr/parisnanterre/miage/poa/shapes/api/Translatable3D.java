package fr.parisnanterre.miage.poa.shapes.api;

import fr.parisnanterre.miage.poa.shapes.impl.Point3D;

public interface Translatable3D extends Translatable2D{
    Point3D getRefPoint();
}
