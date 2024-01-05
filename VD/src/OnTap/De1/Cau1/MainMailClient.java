package OnTap.De1.Cau1;

public class MainMailClient {
    public static void main(String[] args) {
        MailClient vu=new Client("Vu");
        MailClient tin=new Client("Tin");
        MailClient profile=new Profile("Vu","vu@ntu.edu.vn","0938428913","Ke Toan");
        MailClient profile1=new Profile("Tin","tin@ntu.edu.vn","0935956338","Tiep tan");
        vu.add(profile);
        tin.add(profile1);
        System.out.println("Thong tin:");
        System.out.println(vu.name);
        System.out.println(vu.getEmail());
        System.out.println(vu.getSoDienThoai());
        System.out.println(vu.getPhongBan());
        System.out.println(tin.name);
        System.out.println(tin.getEmail());
        System.out.println(tin.getSoDienThoai());
        System.out.println(tin.getPhongBan());
    }
}
