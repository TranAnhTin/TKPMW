package Creational.Factory.Pizza.VNPizza;
import Creational.Factory.Pizza.Pizza;
import Creational.Factory.Pizza.PizzaStore;
import Creational.Factory.Pizza.PizzaType;

public class VNPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch (type){
            case HAI_SAN->{
                return new PizzaHaiSanVN();
            }
        }
        return null;
    }
}
