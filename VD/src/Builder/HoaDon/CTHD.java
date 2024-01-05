package Builder.HoaDon;

import java.util.ArrayList;
import java.util.List;

public class CTHD {
    String sp;
    int sl;
    double donGia,chietKhau;


    public CTHD(String sp, int sl, double donGia, double chietKhau) {
        this.sp = sp;
        this.sl = sl;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "\nTen san pham: "+sp+
                "\nSo luong: "+sl+
                "\nDon gia: "+donGia+
                "\nChiet khau: "+chietKhau;
    }
}
