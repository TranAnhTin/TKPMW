package structural.composite.B4;

public class MainKeHoachHocTap {
    public static void main(String[] args) {
        KeHoachHocTap khoahoc=new KeHoachChung("Khoa hoc");
        KeHoachHocTap nam1=new KeHoachChung("Nam 1");
        KeHoachHocTap nam2=new KeHoachChung("Nam 2");
        KeHoachHocTap ky1=new KeHoachChung("Ky 1");
        KeHoachHocTap ky2=new KeHoachChung("Ky 2");
        KeHoachHocTap ky3=new KeHoachChung("Ky 3");
        KeHoachHocTap ky4=new KeHoachChung("Ky 4");
        KeHoachHocTap mon1=new MonHoc("Toan",300,3);
        KeHoachHocTap mon2=new MonHoc("Ly",300,2);
        KeHoachHocTap mon3=new MonHoc("Anh",300,3);
        KeHoachHocTap mon4=new MonHoc("Hoa",300,3);
        KeHoachHocTap mon5=new MonHoc("Tin",300,3);
        KeHoachHocTap mon6=new MonHoc("Lich su",300,3);
        KeHoachHocTap mon7=new MonHoc("Dia li",300,3);
        KeHoachHocTap mon8=new MonHoc("The duc",100,1);
        khoahoc.add(nam1);
        khoahoc.add(nam2);
        nam1.add(ky1);
        nam1.add(ky2);
        nam2.add(ky3);
        nam2.add(ky4);
        ky1.add(mon1);
        ky1.add(mon2);
        ky2.add(mon3);
        ky2.add(mon4);
        ky3.add(mon5);
        ky3.add(mon6);
        ky4.add(mon7);
        ky4.add(mon8);
        System.out.println("Nam 1:");
        System.out.println("\tTong hoc phi:"+nam1.getHocPhi());
        System.out.println("\tTong so tin chi:"+nam1.getSoTc());
        System.out.println("Nam 2:");
        System.out.println("\tTong hoc phi:"+nam2.getHocPhi());
        System.out.println("\tTong so tin chi:"+nam2.getSoTc());
        System.out.println("Toan khoa:");
        System.out.println("\tTong so tin chi:"+khoahoc.getSoTc());
        System.out.println("\tTong hoc phi:"+khoahoc.getHocPhi());
    }
}
