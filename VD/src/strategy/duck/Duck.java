package strategy.duck;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void swim(){
        System.out.println("vit nhung biet boi ech");
    }

    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void performQuack(){
        System.out.println(quackBehavior.quack());
    }
    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
