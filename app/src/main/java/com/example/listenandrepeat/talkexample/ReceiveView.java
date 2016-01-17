package com.example.listenandrepeat.talkexample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 17..
 */
public class ReceiveView extends FrameLayout{
    public ReceiveView(Context context) {
        super(context);
        init();
    }
    ImageView iconView;
    TextView textView;
    ReceiveData data;
    private void init() {
        inflate(getContext(), R.layout.view_receive, this);
        iconView = (ImageView)findViewById(R.id.imgeView);
        textView = (TextView)findViewById(R.id.textView);
    }

    public void setData(ReceiveData data) {
        this.data = data;
        iconView.setImageResource(data.iconId);
        textView.setText(data.message);
    }


}
