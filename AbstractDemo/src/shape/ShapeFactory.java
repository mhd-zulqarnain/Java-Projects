package shape;

import color.Color;
import main.AbstractFactory;

/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape==null)
            return null;
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shape.equalsIgnoreCase("squre")){
            return new Squre();

        }

        return null;
    }
}
