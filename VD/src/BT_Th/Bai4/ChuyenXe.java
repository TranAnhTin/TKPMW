package BT_Th.Bai4;

public class ChuyenXe {
    String maSoChuyen,soXe,tenTaiXe;
    double doanhThu;

    public ChuyenXe(String maSoChuyen, String soXe, String tenTaiXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.soXe = soXe;
        this.tenTaiXe = tenTaiXe;
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
          return "\nMa sochuyen"+maSoChuyen+"So xe:"+soXe+"Ten tai xe: "+tenTaiXe+"Doanh thu:"+doanhThu;
    }
}
