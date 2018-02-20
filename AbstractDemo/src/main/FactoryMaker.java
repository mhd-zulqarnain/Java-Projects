package main;

import color.ColorFactory;
import shape.ShapeFactory;

/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public class FactoryMaker {

    public static AbstractFactory getFactory(String choice) {

        switch (choice) {
            case "shape":
            case "SHAPE":
                return new ShapeFactory();
            case "color":
            case "COLOR":
                return new ColorFactory();
        }
        return null;
    }
}
