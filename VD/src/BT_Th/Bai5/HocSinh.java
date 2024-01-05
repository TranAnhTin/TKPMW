package BT_Th.Bai5;

public class HocSinh extends CaNhan{
    String lop,nangKhieu;

    public HocSinh(String hoTen, String diaChi, String sdt, Integer age, String lop, String nangKhieu) {
        super(hoTen, diaChi, sdt, age);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLop:"+lop+"Nang khieu:"+nangKhieu;
    }
}
