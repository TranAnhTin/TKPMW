package behavioral.ChainOfResponsibility.CB1;

public class MainATM {
    public static void main(String[] args) {
        ATM_MenhGia m500=new ATM_MenhGia(500);
        ATM_MenhGia m200=new ATM_MenhGia(200);
        ATM_MenhGia m100=new ATM_MenhGia(100);
        ATM_MenhGia m50=new ATM_MenhGia(50);
        ATM_MenhGia m10=new ATM_MenhGia(10);
        ATM_MenhGia m5=new ATM_MenhGia(5);
        ATM_MenhGia m1=new ATM_MenhGia(1);
        m500.thietLapMenhGiaKeTiep(m200)
                .thietLapMenhGiaKeTiep(m100)
                .thietLapMenhGiaKeTiep(m50)
                .thietLapMenhGiaKeTiep(m10)
                .thietLapMenhGiaKeTiep(m5)
                .thietLapMenhGiaKeTiep(m1);
        m500.rutTien(2303);

    }
}
