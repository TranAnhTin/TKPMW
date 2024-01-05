package behavioral.Stratery;


public  class TinhToan {

    ITinhToan tinh;

    public void setTinhToan(ITinhToan tinhToan) {
        this.tinh = tinhToan;
    }
    float tinh(float a,float b){
       return tinh.tinh( a, b);
    }

}
