package structural.decorator.beverage;

public class MainBeverage {
    public static void main(String[] args) {
        Beverage houseBlend=new HouseBlend("Ca phe Trung Nguyen House Blend");
        houseBlend=new Milk(houseBlend);
//        houseBlend=new Milk(houseBlend);
//        houseBlend=new Mocha(houseBlend);
        System.out.println(houseBlend.getDescription());
        System.out.println("Gia:"+houseBlend.cost());
    }
}
