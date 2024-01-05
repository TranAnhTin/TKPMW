package behavioral.Observer.BtCa2;

import java.util.Optional;

public class MyButton {
    OnClickListener listener;
    public static interface OnClickListener{
        void OnClick();
    }
    public void attach(OnClickListener listener)
    {
        this.listener=listener;
    }
    public void detach(OnClickListener listener)
    {
        this.listener=null;
    }
    public void onClickEvent(){
        if (listener!=null)
            listener.OnClick();
    }
}
