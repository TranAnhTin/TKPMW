package OnTap.De1.Cau1;

import java.util.ArrayList;
import java.util.List;

public class Client extends MailClient{
    List<MailClient> list = new ArrayList<>();

    public Client(String name) {
        super(name);
    }

    @Override
    public void add(MailClient m) {
        list.add(m);
    }

    @Override
    public void remove(MailClient m) {
        list.remove(m);
    }

    @Override
    public String getEmail() {
        for(MailClient m :list)
            return m.getEmail();
        return null;
    }

    @Override
    public String getSoDienThoai() {
        for(MailClient m :list)
            return m.getSoDienThoai();
        return null;
    }

    @Override
    public String getPhongBan() {
        for(MailClient m :list)
            return m.getPhongBan();
        return null;
    }
}
