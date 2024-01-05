package structural.decorator.Tokenize;

public class TachTu implements ITokenize{
    String s;

    @Override
    public String[] tokenize() {
        return s.split(" ");
    }

    public TachTu(String s) {
        this.s = s;
    }
}
