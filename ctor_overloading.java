package com.example;

import lombok.Getter;
import lombok.Setter;

// ctor overloading
public class Car {
    // model, brand, year, color
    private @Getter @Setter String m_model;
    private @Getter @Setter String m_brand;
    private @Getter @Setter int m_year;
    private @Getter @Setter String m_color;

    private @Getter @Setter int m_miles;

    // ctor 1
    public Car(String m_model, String m_brand, int m_year, String m_color) {
        this.m_model = m_model;
        // contact car company and report new car
        this.m_brand = m_brand;
        /// ............
        this.m_year = m_year;
        // ..........
        this.m_color = m_color;
        // .........
    }

    // ctor 2
    public Car(String m_model, String m_brand, int m_year) {
        // identical to ctor 1
        this(m_model, m_brand, m_year, "Black");
    }

    public Car() {
        // identical to ctor 1
        this("Ferrari", "testa rocca", 2021, "Red");
    }

    public Car(String m_model, String m_brand, int m_year, String m_color,
               int miles) {
        this(m_model, m_brand, m_year, m_color);
        this.m_miles = m_miles;
    }

}
