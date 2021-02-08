package com.app.painter;

import com.app.shapes.Circle;
import com.app.shapes.ShapesEnlarger;

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        c.draw();
        ShapesEnlarger.enlargeCircle(c, 10.5);
    }
}
