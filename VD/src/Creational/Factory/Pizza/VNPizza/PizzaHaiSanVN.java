package Creational.Factory.Pizza.VNPizza;

import Creational.Factory.Pizza.Pizza;

public class PizzaHaiSanVN extends Pizza {
    @Override
    public void prepare() {
        description.append("Chuan bi bot,tom,ca\n");
    }

    @Override
    public void bake() {
        description.append("Nuong trong 25\n");
    }

    @Override
    public void cut() {
        description.append("Cat thanh 4 mieng bang nhau\n");
    }

    @Override
    public void box() {
        description.append("Cho banh vao hop va dong lai\n");
    }
}
