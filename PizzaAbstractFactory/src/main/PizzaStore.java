package main;

/**
 * Created by Zul Qarnain on 11/6/2017.
 */
public abstract class PizzaStore  {

    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type){
        Pizza pizza =createPizza(type);
        System.out.println("pizza");
        pizza.prepare();
        pizza.bake();
       return pizza;
    }
}
