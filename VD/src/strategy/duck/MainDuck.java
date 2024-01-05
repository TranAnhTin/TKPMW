package strategy.duck;

public class MainDuck {
    public static void main(String[] args){
        Duck duck =new VitQuay();
        duck.setFlyBehavior(new FlyWithWing());
        duck.setQuackBehavior(new CQuack());
        duck.display();
    }
}
