package behavioral.ChainOfResponsibility.CB1;

public class ATM_MenhGia implements ATM{
    int menhGia;
    ATM keTiep;
    @Override
    public void rutTien(int soTien) {
        int soTo=soTien/menhGia;
        int tienDu=soTien%menhGia;
        if (soTo>0)
            System.out.println(menhGia + ": "+soTo);
        if (tienDu>0)
            keTiep.rutTien(tienDu);
    }

    @Override
    public ATM thietLapMenhGiaKeTiep(ATM menhGiaKeTiep) {
        keTiep=menhGiaKeTiep;
        return keTiep;
    }

    public ATM_MenhGia(int menhGia) {
        this.menhGia = menhGia;
    }
}
