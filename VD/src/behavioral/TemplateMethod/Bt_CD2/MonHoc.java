package behavioral.TemplateMethod.Bt_CD2;

public class MonHoc {
    int maMH,soTC;
    String tenMH;

    public MonHoc(int maMH, int soTC, String tenMH) {
        this.maMH = maMH;
        this.soTC = soTC;
        this.tenMH = tenMH;
    }

    @Override
    public String toString() {
        return "maMH=" + maMH +
                "\nsoTC=" + soTC +
                "\ntenMH='" + tenMH +'\n';
    }
}
