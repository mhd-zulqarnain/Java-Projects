package main;

import color.Color;
import shape.Shape;

/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
