package ThiGK_2;

public abstract class MailClient {
    String name;

    public MailClient(String name) {
        this.name = name;
    }
    public abstract void add(MailClient mailClient);
    public abstract void remove(MailClient mailClient);
    public abstract String sodienthoai();
    public abstract String phongBan();
    public abstract String email();
}
