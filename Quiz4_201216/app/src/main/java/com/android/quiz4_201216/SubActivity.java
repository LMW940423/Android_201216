package com.android.quiz4_201216;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {


    TextView sub_tv_01 = null;
    TextView closeBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Intent intent = null;
        String userId = intent.getExtras().getString("userId");
        String userPw = intent.getExtras().getString("userPw");

        sub_tv_01 = findViewById(R.id.sub_tv_01);
        sub_tv_01.setText("환영합니다. 아이디는 " + userId + " / 패스워드는 : " + userPw + " 입니다.");

        closeBtn = findViewById(R.id.sub_tv_close);


    }


}
