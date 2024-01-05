package Builder.HoaDon;

public class HoaDonHeader {
    String maHD,ngayBan,tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
    }

    @Override
    public String toString() {
        return "\nMa hoa don: "+maHD+
                "\nNgay ban: "+ngayBan+
                "\nTen khach hang: "+tenKH;
    }
}
