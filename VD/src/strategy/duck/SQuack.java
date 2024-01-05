package strategy.duck;

public class SQuack  implements IQuackBehavior{
    @Override
    public String quack() {
        return "quack quack quack ";
    }
}
