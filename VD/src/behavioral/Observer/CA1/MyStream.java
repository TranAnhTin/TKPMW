package behavioral.Observer.CA1;

import javax.swing.event.TableModelListener;
import java.net.http.WebSocket;
import java.util.ArrayList;
import java.util.List;

public class MyStream<T> {
    private List<Listener>list=new ArrayList<>();
    public void addlistener(Listener l){
        list.add(l);
    }
    public void addEvent(T t){
        for (Listener l:list)
            l.listen(t);
    }
    public static interface Listener<T>{
        void listen(T t);
    }
}
