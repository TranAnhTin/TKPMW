package behavioral.TemplateMethod.CD3;

public class SortByPrice extends SortCollection<Product>{
    @Override
    protected int myCompare(Product t1, Product t2) {
        if(t1.getPrice()> t2.getPrice())
            return 1;
        else if(t1.getPrice()< t2.getPrice())
            return -1;
        else
            return 0;
    }
}
