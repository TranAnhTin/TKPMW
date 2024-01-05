package behavioral.Observer.CA1;

import ThiGK_2.Client;

import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream=new MyStream<>();
        MyDataAccess dataAccess=new MyDataAccess(stream);
        MyClient client=new MyClient(stream);
        dataAccess.add(new MonHoc("01","Toán",4));
        dataAccess.add(new MonHoc("02","Anh",4));
    }
}
