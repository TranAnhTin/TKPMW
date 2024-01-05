package behavioral.Observer.ViDu;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia tiGia63=new TiGia();
        NhaDauTuA nhaDauTuA =new NhaDauTuA(tiGia63);
        NhaDauTuB nhaDauTuB=new NhaDauTuB(tiGia63);
        tiGia63.notifyTiGia((float) 2.0);
    }
}
