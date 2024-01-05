package behavioral.TemplateMethod.Bt_CD2;

public class MonHocDB extends EntityDB<MonHoc>{
    @Override
    protected int getKey(MonHoc monHoc) {
        return monHoc.maMH;
    }
}
