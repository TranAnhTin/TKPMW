package behavioral.TemplateMethod.Bt_CD2;

public class MainEntityDB {
    public static void main(String[] args) {
        EntityDB <SinhVien> qlsv=new SinhVienDB();
        qlsv.add(new SinhVien(1,"Minh Nga","20/10/2003","Nha Trang"));
        qlsv.add(new SinhVien(2,"Minh Hang","20/10/2003","Moon"));
        qlsv.add(new SinhVien(3,"Anh Tin","23/3/2003","Nha Trang"));
        qlsv.printInfo();
        qlsv.update(new SinhVien(2,"Minh Hang","20/10/2003","Nha Trang"));
        System.out.println("Thong tin sau update:");
        qlsv.printInfo();
    }
}
