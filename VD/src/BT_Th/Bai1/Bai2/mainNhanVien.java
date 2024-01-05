package BT_Th.Bai1.Bai2;

public class mainNhanVien {
    public static void main(String[] args){
        NhanVien nv1= new NhanVien("Tin","Nha Trang",21,210,15000000.0);
        System.out.println(nv1.getThongTin());
        System.out.println(nv1.tinhThuong());
        QuanLyNhanVien ql=new QuanLyNhanVien();
        ql.them(nv1);
        ql.inDs();
    }
}
