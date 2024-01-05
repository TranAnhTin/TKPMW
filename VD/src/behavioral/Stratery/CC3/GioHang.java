package behavioral.Stratery.CC3;

import behavioral.Stratery.ITinhToan;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    IKhuyenMai khuyenMai;
    IThanhToan thanhToan;
    IVanChuyen vanChuyen;
    List<MatHang>list=new ArrayList<>();

    public void setKhuyenMai(IKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public void setThanhToan(IThanhToan thanhToan) {
        this.thanhToan = thanhToan;
    }

    public void setVanChuyen(IVanChuyen vanChuyen) {
        this.vanChuyen = vanChuyen;
    }

    void themMH(MatHang m){
        list.add(m);
    }
    public void thanhTien(){
        int tong=0;
        for (MatHang m:list)
            tong+= (int) (m.donGia*m.sl);
        float tienGiamKM= khuyenMai.tienKM(tong);
        float tienGiamThanhToan=thanhToan.tienGiam(tong-tienGiamKM);
        int ngayVC=vanChuyen.soNgay();
        System.out.println("Tổng tiền:"+tong);
        System.out.println("Khuyến mãi: "+tienGiamKM);
        System.out.println("Giảm thanh toán: "+tienGiamThanhToan);
        System.out.println("Tiền cần thanh toán: "+(tong-tienGiamKM-tienGiamThanhToan));
        System.out.println("Số ngày vận chuyển: "+ngayVC);
    }
}
