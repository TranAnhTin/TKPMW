package structural.decorator.Tokenize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung  extends Tokenize{
    List<String> tuDung= Arrays.asList("và","thì","là","hoặc");
    List<String> tuMoi=new ArrayList<>();

    @Override
    public String[] tokenize() {
        List<String> tu=Arrays.asList(super.tokenize());
        for (String s:tu){
            if(!tuDung.contains(s.toLowerCase())){
                tuMoi.add(s);
            }
        }
        return tuMoi.toArray(new String[0]);
    }

    public LoaiBoTuDung(ITokenize input) {
        super(input);}
}
