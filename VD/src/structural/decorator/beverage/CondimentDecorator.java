package structural.decorator.beverage;

public abstract class CondimentDecorator extends Beverage {
    //thay ten bien component bang beverage cho de hieu
    //ve ban chat beverage o lop com chinh la component
    Beverage beverage;
    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription();
    }
}
