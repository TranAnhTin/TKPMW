package structural.decorator.widget;

public class MainWidget {
    public static void main(String[] args) {
        Text text =new Text("Chào lớp 63CNTT_CLC1");
        Widget center=new Center(text);
        center.show();
        Widget button=new Button(center);
        button.show();
    }
}
