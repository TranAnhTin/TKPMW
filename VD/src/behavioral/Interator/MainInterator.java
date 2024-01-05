package behavioral.Interator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainInterator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator iterator=list.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("My iterator:");
        ArrayCollection63 collection63=new ArrayCollection63();
        Iterator63 iterator63 =collection63.createIterator();
        while (!iterator63.isDone())
            System.out.println(iterator63.next());
    }
}
