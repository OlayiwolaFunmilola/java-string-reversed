package com.funmi.OOPConcepts.Encapsulation;

public class Circle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    void resize() {
        System.out.println("Resize a circle");

    }
}
