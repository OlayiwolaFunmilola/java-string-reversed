package com.funmi.OOPConcepts.Encapsulation;

public class Rectangle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Draw a rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resize a Rectangle");

    }
}
