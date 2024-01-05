package behavioral.ChainOfResponsibility.CB3;

public class TienDienTheoBac implements TinhTienDienBacThan{
    int min, max;
    int gia;
    TinhTienDienBacThan keTiep;

    @Override
    public TinhTienDienBacThan bacKeTiep(TinhTienDienBacThan keTiep) {
        this.keTiep=keTiep;
        return this.keTiep;
    }

    @Override
    public int TinhTienDien(int sokW) {
        if (sokW<=max)
            return (sokW-min)*gia;
        return (max-min)*gia+keTiep.TinhTienDien(sokW);
    }

    public TienDienTheoBac(int min, int max, int gia) {
        this.min = min;
        this.max = max;
        this.gia = gia;
    }
}
