package behavioral.ChainOfResponsibility.CB4;

public interface IDoVeSo {
    IDoVeSo giaiKeTiep(IDoVeSo keTiep);
    String doVeSo(String veSo);
}
