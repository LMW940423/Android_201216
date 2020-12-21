package com.android.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity TAG";
    TextView mainText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "onCreate --- 메인 생성");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "onStart --- 메인 시작");
        super.onStart();

    }

    @Override
    protected void onResume() {
        Log.v(TAG, "onResume --- 메인 진행");
        super.onResume();

        mainText = findViewById(R.id.mainText);

        mainText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "onPause --- 메인 잠시 멈춤");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "onStop --- 메인 스탑");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestory --- 메인 종료");
        super.onDestroy();
    }
} // --------------
