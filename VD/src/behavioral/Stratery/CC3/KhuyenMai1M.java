package behavioral.Stratery.CC3;

public class KhuyenMai1M implements IKhuyenMai{
    @Override
    public float tienKM(float tongTien) {
        float km=(float)0.1*tongTien;
        return km<100?km:100;
    }
}
