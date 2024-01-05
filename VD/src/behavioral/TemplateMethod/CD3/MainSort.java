package behavioral.TemplateMethod.CD3;

import java.util.ArrayList;
import java.util.List;

public class MainSort {
    public static void main(String[] args) {
        //1.Tạo 1 SortCollection
        //2.Tạo list<Product>
        //3.Sử dụng SortCollection để sắp xếp
        //4.In ds
        List<Product> p =new ArrayList<>();
        p.add(new Product("but",1000,5));
        p.add(new Product("ao",300,5));
        p.add(new Product("game",100,5));
        p.add(new Product("mu",500,5));
        SortCollection s=new SortByPrice();
        s.sort(p);
        for (Product list:p){
            System.out.println(list.toString());
        }
    }
}
