package behavioral.TemplateMethod.Bt_CD2;

public class SinhVienDB extends EntityDB<SinhVien>{
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.maSV;
    }
}
