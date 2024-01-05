package behavioral.TemplateMethod.CD3;

import java.util.List;

public class SortByName extends SortCollection<Product>{
    @Override
    protected int myCompare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
