package Creational.Factory.A3;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        if (type.equals(ShapeType.RECTANGLE)){
            return new Rectangle();
        }
        else
            return null;
    }
//    private static ShapeFactory mySingleTon;
//
//
//    // Methods
//    public static ShapeFactory Instance() {
//        if (mySingleTon == null)
//            mySingleTon = new ShapeFactory();
//        return mySingleTon;
//    }

}
