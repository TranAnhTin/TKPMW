package behavioral.Interator.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainCE2Iterator {
    public static void inDSMH(Iterator<MonHoc> ite){
        while (ite.hasNext()){
            MonHoc m=ite.next();
            System.out.println("Tên môn học: "+m.tenMH);
            System.out.println("Số tín chỉ: "+m.soTC+"\n");
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list=new ArrayList<>();
        list.add(new MonHoc("Toán",3));
        list.add(new MonHoc("Anh",3));
        list.add(new MonHoc("Kỹ năng sống",2));
        list.add(new MonHoc("Tư tưởng Hồ Chí Minh",3));
        inDSMH(list.iterator());
    }
}
