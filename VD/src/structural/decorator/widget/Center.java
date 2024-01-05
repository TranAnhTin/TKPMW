package structural.decorator.widget;

public class Center extends WidgetDecorator{
    @Override
    public void show() {
        System.out.println("<center>");
        System.out.print("\t");
        child.show();
        System.out.println("</center>");
    }

    public Center(Widget child) {
        super(child);
    }
}
