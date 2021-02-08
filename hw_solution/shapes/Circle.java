package com.app.shapes;

import lombok.ToString;

@ToString
public class Circle {
    Background background;
    private double radius;
    public Circle(double _radius)
    {
        radius = _radius;
        background = new Background("Green", 0.87f);
    }
    public double getRadius()
    {
        return radius;
    }
    public String getColor()
    {
        return background.color;
    }
    void enlarge(double scale)
    {
        radius *= scale;
    }
    public void draw()
    {
        System.out.println(String.format("Drawing the circle with %f radius in colors: %s", radius, background));
    }
}
