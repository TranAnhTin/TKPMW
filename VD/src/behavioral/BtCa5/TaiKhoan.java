package behavioral.BtCa5;

import java.security.spec.RSAOtherPrimeInfo;

public class TaiKhoan implements ATM.I_TaiKhoan{
    String ten;
    double soDu;
    ATM atm;

    public TaiKhoan(String ten, double soDu, ATM atm) {
        this.ten = ten;
        this.soDu = soDu;
        this.atm = atm;
    }

    public void duaThe(){
        atm.attach(this);
    }
    public void rutThe(){
       // this.atm=atm;
        atm.detach(this);
    }

    @Override
    public boolean kiemTraSoDu(double soTienRut) {
        if(soDu-soTienRut>=0)
            return true;
        return false;
    }

    @Override
    public void nhanThongBao(double soTienRut, boolean thanhCong) {
        if (thanhCong==true){
            System.out.println("Rut thanh cong: "+soTienRut);
            soDu=soDu-soTienRut;
            System.out.println("Ten: "+ten);
            System.out.println("So du con lai: "+soDu);
        }
        else
            System.out.println("Khong hop le");
    }
}
