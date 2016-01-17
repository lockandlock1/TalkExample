package com.example.listenandrepeat.talkexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

import java.util.Date;

public class MainActivity extends AppCompatActivity {


    EditText inputView;
    RadioGroup selectView;
    ChattingAdapter mAdapter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView = (EditText)findViewById(R.id.edit_input);
        selectView = (RadioGroup)findViewById(R.id.category);
        listView = (ListView)findViewById(R.id.listView);

        mAdapter = new ChattingAdapter();

        listView.setAdapter(mAdapter);

        Button btn = (Button)findViewById(R.id.btn_insert);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = selectView.getCheckedRadioButtonId();

                if(id == R.id.radio_send){
                    SendData sendData = new SendData();
                    sendData.iconId = R.mipmap.ic_launcher;
                    sendData.message = inputView.getText().toString();
                    mAdapter.add(sendData);
                } else if (id == R.id.radio_receive){
                    ReceiveData receiveData = new ReceiveData();
                    receiveData.iconId = R.mipmap.ic_launcher;
                    receiveData.message = inputView.getText().toString();
                    mAdapter.add(receiveData);
                } else {
                    DateData dateData = new DateData();
                    dateData.message = new Date().toString();
                    mAdapter.add(dateData);
                }
            }
        });


    }
}
