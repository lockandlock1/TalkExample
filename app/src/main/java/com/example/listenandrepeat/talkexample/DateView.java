package com.example.listenandrepeat.talkexample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 17..
 */
public class DateView extends FrameLayout {

    public DateView(Context context) {
        super(context);
        init();
    }




    TextView textView;
    DateData data;
    private void init() {
        inflate(getContext(), R.layout.view_date, this);
        textView = (TextView)findViewById(R.id.textView3);
    }

    public void setData(DateData data) {
        this.data = data;
        textView.setText(data.message);
    }
}
