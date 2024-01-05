package OnTap.De1.Cau1;

public class Profile extends MailClient{
    String email,sdth,phongBan;

    public Profile(String name, String email, String sdth, String phongBan) {
        super(name);
        this.email = email;
        this.sdth = sdth;
        this.phongBan = phongBan;
    }

    @Override
    public void add(MailClient m) {

    }

    @Override
    public void remove(MailClient m) {

    }

    @Override
    public String getEmail() {
        return "Mail: "+email;
    }

    @Override
    public String getSoDienThoai() {
        return "So dien thoai: "+sdth;
    }

    @Override
    public String getPhongBan() {
        return "Phong ban: "+phongBan;
    }

    @Override
    public String toString() {
        return "Profile" +
                "email='" + email +
                "\nsdth='" + sdth +
                "\nphongBan='" + phongBan ;
    }
}
