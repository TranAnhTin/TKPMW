package Builder.HoaDon;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hd = new HoaDon.Builder()
                .addHeader("M1","/m1","ba")
                .addCTHD("1",1,1,1)
                .build();
        System.out.println(hd.toString());
    }
}
