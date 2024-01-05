package OnTap.De1.Cau1;

public abstract class MailClient {
    String name;

    public MailClient(String name) {
        this.name = name;
    }
    public abstract void add(MailClient m);
    public abstract void remove(MailClient m);
    public abstract String getEmail();
    public abstract String getSoDienThoai();
    public abstract String getPhongBan();
}
