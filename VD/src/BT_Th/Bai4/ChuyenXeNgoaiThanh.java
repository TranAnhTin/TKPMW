package BT_Th.Bai4;

import java.sql.Struct;

public class ChuyenXeNgoaiThanh extends ChuyenXe{
    String noiDen,soNgayDi;

    public ChuyenXeNgoaiThanh(String maSoChuyen, String soXe, String tenTaiXe, double doanhThu, String noiDen, String soNgayDi) {
        super(maSoChuyen, soXe, tenTaiXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }


    @Override
    public String toString() {
        return super.toString()+"\nNoi den"+noiDen+"So ngay di duoc:"+soNgayDi;
    }
}
