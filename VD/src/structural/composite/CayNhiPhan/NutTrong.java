package structural.composite.CayNhiPhan;

public class NutTrong implements Node {
    Node trai=null,phai=null;
    String content;

    public NutTrong(String content) {
        this.content = content;
    }

    public NutTrong(Node trai, Node phai) {
        this.trai = trai;
        this.phai = phai;
    }

    @Override
    public void themTrai(Node n) {
        trai=n;

    }

    @Override
    public void themPhai(Node n) {
        phai=n;
    }

    @Override
    public void remove(Node n) {
        if (trai==n)
            trai=null;
        else
            if (phai==n)
                phai=null;
    }

    @Override
    public void duyetCay() {
        if (trai!=null)
            trai.duyetCay();
        System.out.println(content);
        if (phai!=null)
            phai.duyetCay();
        System.out.println(content);
    }
}
