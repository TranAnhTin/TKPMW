package behavioral.ChainOfResponsibility.CB4;

public class GiaiThuong implements IDoVeSo{
    IDoVeSo giaiKeTiep;
    String tenGiai;
    String[] soTrungThuong;
    public GiaiThuong(String tenGiai, String[] soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuong = soTrungThuong;
    }
    @Override
    public IDoVeSo giaiKeTiep(IDoVeSo keTiep) {
        giaiKeTiep=keTiep;
        return  keTiep;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String s:soTrungThuong)
            if (veSo.endsWith(s))
                return "Ban da trung giai: "+tenGiai;
        return giaiKeTiep.doVeSo(veSo);
    }
}
