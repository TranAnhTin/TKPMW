package Builder.MyString;

public class MainMyStringBuilder {
    public static void main(String[] args) {
        MyStringBuilder s=new MyStringBuilder()
                .addString("Hello")
                .addFloat(3.14f)
                .addBool(true);
        System.out.println("Chuoi: "+s.toString());
    }
}
