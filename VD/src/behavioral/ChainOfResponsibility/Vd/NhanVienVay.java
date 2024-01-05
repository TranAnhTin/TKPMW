package behavioral.ChainOfResponsibility.Vd;

public class NhanVienVay implements IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon;
    String ten, chucVu;
    int hanMucVay;
    public NhanVienVay( String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xulyKhoanVay) {
        capCaoHon = xulyKhoanVay;
        return xulyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienvay) {
        if(tienvay <= hanMucVay)
        {
            return chucVu + " " + ten +" " + "Xử lý khoản vay";
        }else {
            return capCaoHon.xuLyVay(tienvay);
        }
    }

}
