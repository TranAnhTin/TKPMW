package behavioral.TemplateMethod.CoffeeVd;

public class MainTemplate {
    public static void main(String[] args) {
        CaffeineBeverage tea=new Tea();
        tea.prepareRecipe();
        CaffeineBeverage cafe=new Cafe();
        cafe.prepareRecipe();
    }
}
