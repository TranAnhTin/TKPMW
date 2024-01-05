package BT_Th.Bai5;

public class CaNhan {
    String hoTen,diaChi,sdt;
    Integer age;

    public CaNhan(String hoTen, String diaChi, String sdt, Integer age) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n Ho va ten:"+hoTen+"Dia chi:"+ diaChi+"So dien thoai:"+sdt+"Tuoi:"+age;
    }
}
