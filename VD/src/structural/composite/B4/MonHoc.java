package structural.composite.B4;

public class MonHoc extends KeHoachHocTap{
    int hocPhi;
    int soTC;

    public MonHoc(String name, int hocPhi, int soTC) {
        super(name);
        this.hocPhi = hocPhi;
        this.soTC = soTC;
    }

    @Override
    public int getSoTc() {
        return soTC;
    }

    @Override
    public int getHocPhi() {
        return soTC*hocPhi;
    }

    @Override
    public void remove(KeHoachHocTap k) {

    }

    @Override
    public void add(KeHoachHocTap k) {

    }
}
