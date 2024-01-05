package behavioral.Observer.BtCa2;

public class MainButton {
    public static void main(String[] args) {
        MyButton myButton =new MyButton();
        Activity activity=new Activity(myButton);
        myButton.onClickEvent();
        myButton.onClickEvent();
    }
}
