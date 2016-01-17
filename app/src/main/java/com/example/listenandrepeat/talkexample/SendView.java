package com.example.listenandrepeat.talkexample;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ListenAndRepeat on 2016. 1. 17..
 */
public class SendView extends FrameLayout{

    public SendView(Context context) {
        super(context);
        init();
    }
    ImageView iconView;
    TextView textView;
    SendData data;
    private void init(){
        inflate(getContext(),R.layout.view_send,this);
        iconView = (ImageView)findViewById(R.id.imageView2);
        textView = (TextView)findViewById(R.id.textView2);
    }
    public void setData(SendData data){
        this.data = data;
        iconView.setImageResource(data.iconId);
        textView.setText(data.message);
    }

}
