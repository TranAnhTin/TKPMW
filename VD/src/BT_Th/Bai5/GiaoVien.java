package BT_Th.Bai5;

public class GiaoVien extends CaNhan{
    String monDay,toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, Integer age, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, age);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String toString() {
        return super.toString()+"\nMon day:"+monDay+"To bo mon:"+toBoMon;
    }
}
