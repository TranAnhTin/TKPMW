package Creational.Singleton.A6;


import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

public class DataAccess {
    private static Dictionary<String,DataAccess> dataAccessObject=new  Hashtable<>();
    //private static DataAccess dataAccess;
    List<SanPham> list=new ArrayList<>();
//    public static DataAccess getInstance(){
//        if(dataAccess == null)
//            dataAccess = new DataAccess();
//        return dataAccess;
//    }
    public static  DataAccess getInstance(String tag){
        if (dataAccessObject.get(tag)==null){
            DataAccess d=new DataAccess();
            dataAccessObject.put(tag,d);
        }
        return dataAccessObject.get(tag);
    }
}
