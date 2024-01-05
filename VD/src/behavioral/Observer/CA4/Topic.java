package behavioral.Observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    List<Topic_Observer> observers=new ArrayList<>();
    List<Tin> list=new ArrayList<>();
    public void dangKyObserver(Topic_Observer t){
        observers.add(t);
    }
    public void huyDangKyObserver(Topic_Observer t){
        observers.remove(t);
    }
    public void taoTin(Tin t){
        list.add(t);
        for (Topic_Observer o:observers)
            o.TaoMoi(t);
    }
    public void updateTin(Tin t){
        for (Tin tin:list){
            if (t.id==tin.id){
                tin.noiDung=t.noiDung;
                for (Topic_Observer o:observers)
                    o.Update(t);
                break;

            }
        }
    }
    public interface Topic_Observer{
        void TaoMoi(Tin t);
        void Update(Tin t);
    }

}
