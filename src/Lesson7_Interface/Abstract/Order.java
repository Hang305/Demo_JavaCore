package Lesson7_Interface.Abstract;

import java.util.Date;

public abstract class Order {
    private Date _createOn;
    private long _amount;

    public abstract void validate();
    public abstract void process();

    public final void cancel(){
        //
    }
}
