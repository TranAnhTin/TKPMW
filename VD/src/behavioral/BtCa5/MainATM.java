package behavioral.BtCa5;

public class MainATM {
    public static void main(String[] args) {
        ATM atm=new ATM();
        TaiKhoan tin=new TaiKhoan("Tin",1000,atm);
        TaiKhoan minh=new TaiKhoan("Minh",2000,atm);
        System.out.println("Giao dich lan 1: ");
        tin.duaThe();
        tin.atm.rutTien(100);
        System.out.println("Giao dich lan 2: ");
        tin.atm.rutTien(200);

//        System.out.println("Giao dich lan 2:");
//        minh.duaThe();
//        atm.rutTien(300);

    }
}
