package com.android.putextra;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final static int RValue = 0;
    TextView tv_main = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_main = findViewById(R.id.tv_main);

        findViewById(R.id.btn_second).setOnClickListener(mClickListener);
        findViewById(R.id.btn_third).setOnClickListener(mClickListener);

    }
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;

            switch (v.getId()){
                case R.id.btn_second:
                    Log.v("MainActivity TAG", "Main ------ Second onClick1");
                    intent = new Intent(MainActivity.this, SecondActivity.class);
                    Log.v("MainActivity TAG", "Main ------ Second onClick2");
                    intent.putExtra("main", "From Main Activity");
                    Log.v("MainActivity TAG", "Main ------ Second onClick3");
                    intent.putExtra("num", 2);
                    Log.v("MainActivity TAG", "Main ------ Second onClick4");
                    startActivity(intent);
                    Log.v("MainActivity TAG", "Main ------ Second onClick5");
                    break;
                case R.id.btn_third:
                    Log.v("MainActivity TAG", "Main ------ Third onClick");
                    intent = new Intent(MainActivity.this, ThirdActivity.class);
                    intent.putExtra("main", "From Main Activity");
                    intent.putExtra("num", 3);
                    startActivityForResult(intent, RValue);
                    break;

            }

        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) { // 넘어온 값을 받는 함수
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case MainActivity.RValue:
                tv_main.setText("Return Value : " + RValue);

        }
    }
}