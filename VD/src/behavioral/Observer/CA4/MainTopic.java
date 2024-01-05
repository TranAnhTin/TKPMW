package behavioral.Observer.CA4;

public class MainTopic {
    public static void main(String[] args) {
        Topic topic=new Topic();
        ThanhVienA thanhVienA=new ThanhVienA(topic);
        ThanhVienB thanhVienB=new ThanhVienB(topic);
        topic.taoTin(new Tin(1,"Cô giáo Tuyên Quang bị học sinh dồn vào gốc tường"));
        topic.taoTin(new Tin(2,"Thi cuối kì vào 6/1 môn kiến trúc và thiết kế phần mềm"));
    }
}
