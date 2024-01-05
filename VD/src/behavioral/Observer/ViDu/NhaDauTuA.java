package behavioral.Observer.ViDu;

public class NhaDauTuA implements TiGia.I_TheoDoiTiGia{
    TiGia tiGia;

    public NhaDauTuA(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }
    public void huyDK(){
        this.tiGia.detach(this);
    }

    @Override
    public void capNhat(float delta) {
        if (delta>0)
            System.out.println("Nha dau tu A: Ban ra");
        else
            System.out.println("Nha dau tu A: Mua vao");
    }
}
