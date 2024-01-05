package Creational.Factory.Pizza;

import Creational.Factory.Pizza.VNPizza.VNPizzaStore;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore vnPizzaStore=new VNPizzaStore();
        Pizza haisan= vnPizzaStore.orderPizza(PizzaType.HAI_SAN);
        System.out.println(haisan.toString());
    }
}
