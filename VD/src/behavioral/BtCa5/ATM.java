package behavioral.BtCa5;

public class ATM {
    I_TaiKhoan taiKhoan;
    public static interface I_TaiKhoan{
        boolean kiemTraSoDu(double soTienRut);
        void nhanThongBao(double soTienRut,boolean thanhCong);
    }
    public void attach(I_TaiKhoan tk){
        this.taiKhoan=tk;
    }
    public void detach(I_TaiKhoan tk){
        if(this.taiKhoan==tk)
            taiKhoan=null;
    }
    private boolean kiemTraTienRut(double soTien){
        if(taiKhoan.kiemTraSoDu(soTien)==true)
            return true;
        return false;
    }
    public void rutTien(double soTienRut){
        if (taiKhoan!=null){
            if (kiemTraTienRut(soTienRut)==true)
                taiKhoan.nhanThongBao(soTienRut,true);
            else{
                taiKhoan.nhanThongBao(soTienRut,false);
            }
        }
        else
            System.out.println("Khong co the trong may");
    }
}
