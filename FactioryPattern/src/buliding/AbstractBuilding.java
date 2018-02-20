package buliding;

/**
 * Created by Zul Qarnain on 11/1/2017.
 */
public abstract class AbstractBuilding extends Buildings {
    String type ="building";

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "name:"+name+" power :"+power+" "+type;

    }
}
