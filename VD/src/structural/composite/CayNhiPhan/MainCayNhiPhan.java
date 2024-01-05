package structural.composite.CayNhiPhan;

public class MainCayNhiPhan {
    public static void main(String[] args) {
        Node root =new NutTrong("5");
        Node l1 =new NutTrong("6");
        Node r1=new NutTrong("1");
        Node l2 =new La("7");
        Node r2=new La("3");
        Node l3 =new La("8");
        Node r3=new La("2");
        root.themTrai(l1);
        l1.themTrai(l2);
        l1.themTrai(l3);
        root.themPhai(r1);
        r1.themPhai(r2);
        r1.themPhai(r3);
        System.out.println("Cay nhi phan");
        root.duyetCay();
        l1.duyetCay();
        r1.duyetCay();
    }
}
