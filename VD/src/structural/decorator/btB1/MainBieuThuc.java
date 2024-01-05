package structural.decorator.btB1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bieuThuc=new BieuThucDonGian(2);
        bieuThuc=new Cong(new Cong(bieuThuc,5),5);
        System.out.println(bieuThuc.bieuThuc());
        System.out.println(bieuThuc.giaTri());
    }
}
