package structural.decorator.Tokenize;

public class Tokenize implements ITokenize{
    ITokenize input;

    public Tokenize(ITokenize input) {
        this.input = input;
    }

    @Override
    public String[] tokenize() {
        return input.tokenize();
    }
}
