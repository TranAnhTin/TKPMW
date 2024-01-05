package behavioral.ChainOfResponsibility.CB4;

public class GiaiKhuyenKhich implements IDoVeSo{
    String tenGiai;
    String[] soTrungThuong;

    public GiaiKhuyenKhich(String tenGiai, String[] soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }

    @Override
    public IDoVeSo giaiKeTiep(IDoVeSo keTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
            for (String s : soTrungThuong)
                if (veSo.endsWith(s))
                    return "Ban da trung giai: " + tenGiai;
        return "Chuc ban may man lan sau";
    }
}
