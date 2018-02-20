package Ships;

/**
 * Created by Zul Qarnain on 11/1/2017.
 */
public abstract class AbstractShip extends EnemyShip {
    String type ="Ships";

    public String getType() {
        return type;
    }
    @Override
    public String toString() {
        return "name:"+getName()+" speed :"+getSpeed()+" type:"+type;

    }
}
