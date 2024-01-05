package Creational.Factory.A3;

public class Rectangle extends Shape{

    @Override
    String draw() {
        return this.getClass().getSimpleName();
    }
    private static Rectangle mySingleTon;
    public static Rectangle Instance() {
        if (mySingleTon == null)
            mySingleTon = new Rectangle();
        return mySingleTon;
    }

    @Override
    public String toString() {
        return  "brush" + brush+
                "\npaper" + paper+
                "\nframe" + frame;
    }
}
