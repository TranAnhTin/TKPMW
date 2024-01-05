package structural.composite.CayNhiPhan;

public class La implements Node{
    public La(String content) {
        this.content = content;
    }

    String content;

    @Override
    public void themTrai(Node n) {

    }
    @Override
    public void themPhai(Node n) {

    }
    @Override
    public void remove(Node n) {

    }

    @Override
    public void duyetCay() {
        System.out.println(content);
    }
}
