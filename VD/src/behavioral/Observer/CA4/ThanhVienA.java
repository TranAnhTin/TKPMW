package behavioral.Observer.CA4;

public class ThanhVienA implements Topic.Topic_Observer {
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        t.dangKyObserver(this);
    }

    @Override
    public void TaoMoi(Tin t) {

    }

    @Override
    public void Update(Tin t) {
        System.out.println("TVA Tin cập nhật: ");
        inTin(t);
    }
    void inTin(Tin t){
        System.out.println("Id: "+t.id);
        System.out.println("Nội dung: "+t.noiDung);
    }
}
