package behavioral.Interator.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainCE2 {
    public static void inDSMH(Iterator<MonHoc> ite, Consumer<MonHoc>consumer){
        while (ite.hasNext()){
            MonHoc m = ite.next();
            consumer.accept(m);
        }
    }
    public static void main(String[] args) {
        List<MonHoc>list=new ArrayList<>();
        list.add(new MonHoc("Toán",3));
        list.add(new MonHoc("Anh",3));
        list.add(new MonHoc("Kỹ năng sống",2));
        list.add(new MonHoc("Tư tưởng Hồ Chí Minh",3));
        inDSMH(list.iterator(), new Consumer<MonHoc>() {
            @Override
            public void accept(MonHoc monHoc) {
                System.out.println("Tên môn học: "+monHoc.tenMH);
                System.out.println("Số tín chỉ: "+monHoc.soTC+"\n");
            }
        });
    }

}
