package Builder.HoaDon;

import Builder.Computer.Computer63;

import java.util.ArrayList;

public class HoaDon {
    private HoaDonHeader header;
    private ArrayList<CTHD> cthds;
    public HoaDon( Builder builder){
        this.header=builder.header;
        this.cthds=builder.cthds;
    }

    @Override
    public String toString() {
        StringBuilder builder= new StringBuilder();
        builder.append("\nThong tin hoa don:\n"+header.toString()) ;
        for (CTHD cdhd:cthds)
            builder.append("\n").append(cdhd.toString());
        return builder.toString();
    }

    public static class Builder{
        private HoaDonHeader header;
        private ArrayList<CTHD> cthds = new ArrayList<>();
        public Builder addHeader(String maHD, String ngayBan, String tenKH){
            header = new HoaDonHeader(maHD, ngayBan,tenKH);
            return this;
        }
        public Builder addCTHD(String sp, int sl, double donGia, double chietKhau){
            cthds.add(new CTHD(sp,sl,donGia,chietKhau));
            return this;
        }
        public HoaDon build(){return new HoaDon(this);}

    }
}
