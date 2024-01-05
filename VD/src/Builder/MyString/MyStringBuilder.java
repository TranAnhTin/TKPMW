package Builder.MyString;

public class MyStringBuilder {
    private String s="";
    public MyStringBuilder addString(String sub){
        s+=sub+"\n";
        return this;
    }
    public MyStringBuilder addFloat(Float f){
        s+=f+"\n";
        return this;
    }
    public MyStringBuilder addBool(boolean b){
        s+=b;
        return this;
    }

    @Override
    public String toString() {
        return s;
    }
}
