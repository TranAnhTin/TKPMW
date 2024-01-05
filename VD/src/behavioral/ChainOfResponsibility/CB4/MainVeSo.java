package behavioral.ChainOfResponsibility.CB4;

public class MainVeSo {
    public static void main(String[] args) {
        GiaiThuong giaiTu = new GiaiThuong("Giai tu",new String[]{
                "03184",
                "60843",
                "05923",
                "11367",
                "02679",
                "18854"
        });
        GiaiThuong giaiDacBiet =new GiaiThuong("Giai dac biet",new String[]{
                "848688",
                "052677",
                "560986"
        });
        GiaiThuong giaiNhat = new GiaiThuong("Giai nhat",new String[]{
                "81171",
                "96532",
                "72057"
        });
        GiaiThuong giaiNhi = new GiaiThuong("Giai nhi",new String[]{
                "24984",
                "70730",
                "87717"

        });
        GiaiThuong giaiBa=new GiaiThuong("Giai ba",new String[]{
                "69030",
                "65815",
                "03172",
                "18742",
                "63720",
                "63720"
        });
        IDoVeSo giaiKhuyenKhich=new GiaiKhuyenKhich("Giai khuyen khich",new String[]{"60"});
        giaiDacBiet.giaiKeTiep(giaiDacBiet)
                .giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiKhuyenKhich);
        System.out.println(giaiNhat.doVeSo("881171"));
    }
}
