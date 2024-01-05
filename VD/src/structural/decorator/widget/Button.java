package structural.decorator.widget;

public class Button extends WidgetDecorator{
    @Override
    public void show() {
        System.out.println("<button>");
        child.show();
        System.out.println("</button>");
    }

    public Button(Widget child) {
        super(child);
    }
}
