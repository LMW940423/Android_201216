package com.android.quiz4_201216;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView main_tv_ok = null;
    EditText main_et_id = null;
    EditText main_et_pw = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_tv_ok = findViewById(R.id.tv_ok);
        main_et_id = findViewById(R.id.input_id);
        main_et_pw = findViewById(R.id.input_pw);

        main_tv_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;

                if(main_et_id.getText().toString().equals("test") && main_et_pw.getText().toString().equals("test")){
                    intent = new Intent(MainActivity.this, SubActivity.class);
                    intent.putExtra("userId", "test");
                    intent.putExtra("userPw", "test");
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "아이디와 비밀번호를 확인해주세요.", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}