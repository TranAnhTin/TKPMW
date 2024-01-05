package behavioral.ChainOfResponsibility.CB3;

public class MainTienDien {
    public static void main(String[] args) {
        TinhTienDienBacThan b1=new TienDienTheoBac(0,50,1806);
        TinhTienDienBacThan b2=new TienDienTheoBac(50,100,1866);
        TinhTienDienBacThan b3=new TienDienTheoBac(100,200,2167);
        TinhTienDienBacThan b4=new TienDienTheoBac(200,300,2729);
        TinhTienDienBacThan b5=new TienDienTheoBac(300,400,3051);
        TinhTienDienBacThan b6=new TienDienTheoBac(400,Integer.MAX_VALUE,3151);
        b1.bacKeTiep(b2)
                .bacKeTiep(b3)
                .bacKeTiep(b4)
                .bacKeTiep(b5)
                .bacKeTiep(b6);
        System.out.println("Tiền điện: "+b1.TinhTienDien(175));
    }
}
