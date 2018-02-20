package main;

import color.Color;
import color.ColorFactory;
import color.Red;
import shape.Shape;
import shape.ShapeFactory;
import shape.Circle;

/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public class main {
    public static void main(String args[]) {

        AbstractFactory factory  = FactoryMaker.getFactory("color");
        Color s1= factory.getColor("red");
        System.out.println(s1.blurColor());

    }

}
