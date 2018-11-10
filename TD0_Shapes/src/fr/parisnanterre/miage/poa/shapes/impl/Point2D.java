    package fr.parisnanterre.miage.poa.shapes.impl;

    public class Point2D {

        private double x,y;

    public Point2D (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

        public Point2D() {}

        public double getX() { return this.x; }
    public double getY() { return this.y; }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    public void translate(double x , double y)
    {
        return;
    }

    public boolean isOrigin(boolean Origin)
    {
        if (this.x == 0 && this.y == 0)
        {
            Origin = true;

        }
        else
        {
            Origin = false;
        }
        return Origin;


    }
    public void distance(double Point2D)
    {
        return;
    }

    @Override
    public String toString() {
            return String.format("(%d, %d)", getX(), getY());
        }

    }
