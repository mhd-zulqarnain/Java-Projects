package color;

import main.AbstractFactory;
import shape.Shape;

/**
 * Created by Zul Qarnain on 11/2/2017.
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }

        return null;

    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
