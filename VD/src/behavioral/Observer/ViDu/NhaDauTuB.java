package behavioral.Observer.ViDu;

public class NhaDauTuB implements TiGia.I_TheoDoiTiGia {
    TiGia tiGia;

    public NhaDauTuB(TiGia tiGia) {
        this.tiGia = tiGia;
        tiGia.attach(this);
    }
    public void huyDK(){
        this.tiGia.detach(this);
    }

    @Override
    public void capNhat(float delta) {
        if (delta>0)
            System.out.println("Nha dau tu B: Mua vao");
        else
            System.out.println("Nha dau tu B: Ban ra");
    }
}


