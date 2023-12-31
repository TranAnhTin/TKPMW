package structural.composite.B4;

import java.util.ArrayList;
import java.util.List;

public class KeHoachChung extends KeHoachHocTap{
    List<KeHoachHocTap> list = new ArrayList<>();

    @Override
    public void add(KeHoachHocTap k) {
        list.add(k);
    }

    @Override
    public void remove(KeHoachHocTap k) {
        list.remove(k);
    }

    @Override
    public int getHocPhi() {
        int tong=0;
        for(KeHoachHocTap k:list)
            tong+=k.getHocPhi();
        return tong;
    }

    @Override
    public int getSoTc() {
        int tong=0;
        for(KeHoachHocTap k:list)
            tong+=k.getSoTc();
        return tong;
    }

    public KeHoachChung(String name) {
        super(name);
    }
}
