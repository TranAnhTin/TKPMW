package behavioral.Observer.CA1;

import java.util.List;

public class MyClient implements MyStream.Listener<List<MonHoc>> {
    int count =0;
    public MyClient(MyStream<List<MonHoc>> myStream){
        myStream.addlistener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        System.out.println(++count);
        monHocs.forEach(monHoc -> {
            System.out.println(monHoc.toString());
        });
    }
}
