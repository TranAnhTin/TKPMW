package ThiGK_2;

import java.util.ArrayList;
import java.util.List;

public class Client extends MailClient{
    List<MailClient>list=new ArrayList<>();
    @Override
    public void add(MailClient mailClient) {
        list.add(mailClient);
    }

    @Override
    public void remove(MailClient mailClient) {
        list.remove(mailClient);
    }

    @Override
    public String sodienthoai() {
        for (MailClient client:list)
            client.sodienthoai();
        return null;
    }

    @Override
    public String phongBan() {
        for (MailClient client:list)
            client.phongBan();
        return null;
    }

    @Override
    public String email() {
        for (MailClient client:list)
            client.email();
        return null;
    }

    public Client(String name) {
        super(name);
    }
}
