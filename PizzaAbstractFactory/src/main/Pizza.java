package main;

/**
 * Created by Zul Qarnain on 11/6/2017.
 */
public abstract class Pizza {

    public abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

}
