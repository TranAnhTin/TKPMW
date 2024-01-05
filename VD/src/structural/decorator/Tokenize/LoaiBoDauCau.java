package structural.decorator.Tokenize;

import java.util.List;
import java.util.Arrays;

public class LoaiBoDauCau extends Tokenize{
    List<String> dauCau=Arrays.asList(",",".",";","!","?");
    public LoaiBoDauCau(ITokenize input) {
        super(input);
    }

    @Override
    public String[] tokenize() {
        String[] st=super.tokenize();
        for (int i=0;i<st.length;i++){
            String dau=st[i].substring(st[i].length()-1);
            if (dauCau.contains(dau))
                st[i]=st[i].substring(0,st[i].length()-1);
        }
        return st;
    }
}
