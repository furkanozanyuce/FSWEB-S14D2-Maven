package org.example.model;

import org.example.model.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor color;

    //constructor
    public Ceiling(int height, PaintColor color) {
        this.height = height;
        this.color = color;
    }

    //getter
    public int getHeight() {
        return height;
    }

    public PaintColor getColor() {
        return color;
    }

    //method
    public void create() {
        System.out.println("Ceiling has been built.");
    }

    @Override
    public String toString() {
        return "Ceiling{" +
                "height=" + height +
                ", color=" + color +
                '}';
    }
}
