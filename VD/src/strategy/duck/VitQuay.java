package strategy.duck;

public class VitQuay  extends  Duck{
    @Override
    public void display() {
        System.out.println("Vit quay");
        this.swim();
        this.performFly();
        this.performQuack();
    }
}
