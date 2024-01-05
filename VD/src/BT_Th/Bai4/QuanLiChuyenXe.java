package BT_Th.Bai4;

import BT_Th.Bai1.Bai2.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QuanLiChuyenXe {
    List<ChuyenXe> dsCX = new ArrayList<>();
    public void them(ChuyenXe cx) {dsCX.add(cx);}
    public  void inDs(){
        for (ChuyenXe cx:dsCX)
        {
            System.out.println(cx.toString()+"\n");
        }
    }
    public double tongDoanhThuXeNgoaiThanh(){
        double tong=0;
        for (ChuyenXe cx:dsCX)
        {
            if(cx instanceof ChuyenXeNgoaiThanh)
                tong=tong+ cx.doanhThu;
        }
        return tong;
    }
    public double tongDoanhThuXeNoiThanh(){
        double tong=0;
        for (ChuyenXe cx:dsCX)
        {
            if(cx instanceof ChuyenXeNoiThanh)
                tong=tong+ cx.doanhThu;
        }
        return tong;
    }
    public double tongDoanhThu2Xe(){
        double tong=0;
        for (ChuyenXe cx:dsCX)
        {
                tong=tong+ cx.doanhThu;
        }
        return tong;
    }
}
