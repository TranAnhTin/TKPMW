package BT_Th.Bai4;

public class ChuyenXeNoiThanh extends ChuyenXe{
    String soKmDiDuoc,soTuyen;

    public ChuyenXeNoiThanh(String maSoChuyen, String soXe, String tenTaiXe, double doanhThu, String soKmDiDuoc, String soTuyen) {
        super(maSoChuyen, soXe, tenTaiXe, doanhThu);
        this.soKmDiDuoc = soKmDiDuoc;
        this.soTuyen = soTuyen;
    }

    @Override
    public String toString() {
        return super.toString()+"\nSo km di duoc:"+soKmDiDuoc+"So tuyen:"+soTuyen;
    }
}
