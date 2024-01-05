package behavioral.TemplateMethod.CoffeeVd;

public abstract class CaffeineBeverage {
    public abstract void brew();
    public abstract void addCondiment();
    public void prepareRecipe(){
        boildWater();
        brew();
        pourInCup();
        addCondiment();
    }
    public void boildWater(){
        System.out.println("Dun soi nuoc o 100 do C");
    }
    public void pourInCup(){
        System.out.println("Rot vao ly");
    }
}
