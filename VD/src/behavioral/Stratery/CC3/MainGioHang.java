package behavioral.Stratery.CC3;

public class MainGioHang {
    public static void main(String[] args) {
        GioHang gh = new GioHang();
        //Them mat hang
        gh.setKhuyenMai(new KhuyenMai1M());
        gh.themMH(new MatHang("Bánh oreo",15000,2));
        gh.thanhTien();

    }
}
