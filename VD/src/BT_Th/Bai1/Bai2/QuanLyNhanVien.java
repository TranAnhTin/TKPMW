package BT_Th.Bai1.Bai2;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
    List<NhanVien> dsNV=new ArrayList();
    @Override
    public void them(NhanVien nv) {
        dsNV.add(nv);
    }

    @Override
    public void inDs() {
        for(NhanVien nv:dsNV){
            System.out.println(nv.getThongTin());
        }
    }
}
