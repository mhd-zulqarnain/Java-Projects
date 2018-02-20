package Ships;

/**
 * Created by Zul Qarnain on 11/1/2017.
 */
public class EnemyShip {

    private  String speed;
    private  String name;


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:"+name+" speed:"+speed;
    }
}
