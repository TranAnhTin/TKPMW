package behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.Topic_Observer {
    Topic t;

    public ThanhVienB(Topic t) {
        this.t = t;
        t.dangKyObserver(this);
    }

    List<Tin> list=new ArrayList<>();
    @Override
    public void TaoMoi(Tin t) {
        System.out.println("TVB Tin mới: ");
        list.add(0,t);
        for (Tin tin:list){
            System.out.println("Id: "+t.id);
            System.out.println("Nội dung: "+t.noiDung);
        }
    }

    @Override
    public void Update(Tin t) {
        for (Tin tin:list){
            if(t.id==tin.id){
                t.noiDung= tin.noiDung;
                System.out.println("Tin cập nhật");
                System.out.println("Id: "+t.id);
                System.out.println("Nội dung: "+t.noiDung);
                break;
            }
        }
    }

}
