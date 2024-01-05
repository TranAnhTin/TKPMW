package behavioral.Observer.BtCa2;

import java.nio.Buffer;

public class Activity implements MyButton.OnClickListener{
    MyButton button;
    int count=0;
    public Activity(MyButton button) {
        this.button = button;
        button.attach(this);
    }

    @Override
    public void OnClick() {
        count++;
        System.out.println("Ban da click lan: "+count);
    }
}
