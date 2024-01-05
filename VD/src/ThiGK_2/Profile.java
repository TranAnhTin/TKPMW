package ThiGK_2;

public class Profile extends MailClient{
    String sdt,phongban, email;

    public Profile(String name, String sdt, String phongban, String email) {
        super(name);
        this.sdt = sdt;
        this.phongban = phongban;
        this.email = email;
    }

    @Override
    public void add(MailClient mailClient) {

    }

    @Override
    public void remove(MailClient mailClient) {

    }

    @Override
    public String sodienthoai() {
        return sdt;
    }

    @Override
    public String phongBan() {
        return phongban;
    }

    @Override
    public String email() {
        return email;
    }
}
