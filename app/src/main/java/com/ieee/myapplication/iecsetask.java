package com.ieee.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class iecsetask extends AppCompatActivity {
    public void change(View view)
    {
        TextView tv_gm= findViewById(R.id.gm_tv);
        String gm="Good Morning *yawn*";
        String gb="Good Bye *wink*";
        String s = tv_gm.getText().toString();
        if(s.equals(gm)){
            tv_gm.setText(gb);
        }
        else if(s.equals(gb)){
            tv_gm.setText(gm);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iecsetask);
        }
    }

