package com.example;

import lombok.Getter;
import lombok.Setter;

public class Point {

    private @Getter @Setter double m_x;
    private @Getter @Setter double m_y;

    public Point(double x, double y)   {
        m_x = x;
        //this.x = x;
        m_y = y;
        //this.y = y;
        this.increaseX(5);
    }

    public void Move(double x, double y) {

    }

    public void increaseX(double gap) {
        //this.x += gap;
        m_x += gap;
        this.setM_x(this.getM_x() + gap);
    }
}
