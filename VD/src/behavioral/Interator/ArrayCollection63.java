package behavioral.Interator;

public class ArrayCollection63 extends Collection63{
    int[] arr={1,2,3,4,5,7,8,9};
    public int getItem(int i){
        return arr[i];
    }
    public int count(){
        return arr.length;
    }

    @Override
    public Iterator63 createIterator() {
        return new ArrayIterator63(this);
    }
}
