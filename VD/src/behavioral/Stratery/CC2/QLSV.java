package behavioral.Stratery.CC2;


import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> dsSV=new ArrayList<>();
    public void inDS(){

    }
    public  void sapXep(ISoSanh<SinhVien> soSanh){
        for (int i=0;i<dsSV.size();i++){
            for (int j=i;j<dsSV.size();j++){
                if (soSanh.soSanh(dsSV.get(i),dsSV.get(j))>0){
                    SinhVien sv=dsSV.get(i);
                    dsSV.set(i,dsSV.get(j));
                    dsSV.set(j,sv);
                }
            }
        }
    }
}
