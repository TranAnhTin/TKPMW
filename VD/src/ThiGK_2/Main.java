package ThiGK_2;

public class Main {
    public static void main(String[] args) {
        MailClient client = new Client("Khoa");
        MailClient client1 = new Client("Hưng");
        MailClient profile = new Profile("profile","123456789","CNTT","123@gmmail.com");
        MailClient profile1 = new Profile("profile1","012345678","CNTP","456@gmmail.com");
        client.add(profile);
        client1.add(profile1);
        System.out.println("Profile1: ");
        System.out.println("Tên: "+client.name);
        System.out.println("Số điện thoại: "+profile.sodienthoai());
        System.out.println("Phòng ban: "+profile.phongBan());
        System.out.println("Gmail: "+profile.email());
        System.out.println("Profile2: ");
        System.out.println("Tên: "+client1.name);
        System.out.println("Số điện thoại: "+profile1.sodienthoai());
        System.out.println("Phòng ban: "+profile1.phongBan());
        System.out.println("Gmail: "+profile1.email());
    }
}
