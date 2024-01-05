package structural.decorator.btB1;

public class Cong extends BieuThucDecorator{
    private float toanHang;
    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang=toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()+ toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc()+"+"+toanHang;
    }
}
