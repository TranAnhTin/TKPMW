package behavioral.TemplateMethod.CoffeeVd;

public class Cafe extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Che nuoc soi vao Cafe");
    }

    @Override
    public void addCondiment() {
        System.out.println("Cho sua vao roi khuay deu ---> Cafe sua");
    }
}
