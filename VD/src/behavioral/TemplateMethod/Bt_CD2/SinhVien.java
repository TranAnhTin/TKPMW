package behavioral.TemplateMethod.Bt_CD2;

public class SinhVien {
    int maSV;
    String tenSV,ngaySinh,queQuan;

    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return  "maSV=" + maSV +
                "\ntenSV=" + tenSV+
                "\nngaySinh=" + ngaySinh+
                "\nqueQuan=" + queQuan;
    }
}
