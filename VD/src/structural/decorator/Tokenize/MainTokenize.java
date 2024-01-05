package structural.decorator.Tokenize;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainTokenize {
    static void inKQ(String[] kq){
        Arrays.stream(kq).forEach(s->{
            System.out.println(s+"\t");
        });
//        System.out.println();
    }

    public static void main(String[] args) {
        ITokenize tachTu=new TachTu("Hôm nay trời mưa quá và lớp được nghỉ học. Hôm sau học bù!");
        inKQ((tachTu.tokenize()));
        ITokenize boDauCau=new LoaiBoDauCau(tachTu);
        System.out.println("Loại bỏ dấu câu: ");;
        inKQ(boDauCau.tokenize());
        ITokenize boTuDung=new LoaiBoTuDung(boDauCau);
        System.out.println("Loại bỏ từ dừng");
        inKQ(boTuDung.tokenize());
    }
}
