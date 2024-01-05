package behavioral.TemplateMethod.CoffeeVd;

public class Tea extends CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("Cho tui loc tra vao nuoc soi sau 5'");
    }

    @Override
    public void addCondiment() {
        System.out.println("Cho sua xe dap vao tra ---> Tra sua");
    }

}
