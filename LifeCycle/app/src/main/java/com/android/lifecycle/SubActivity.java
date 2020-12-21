package com.android.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    TextView subText = null;
    String TAG = "SubActivity TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(TAG, "Sub onCreate --- 서브 생성");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    @Override
    protected void onStart() {
        Log.v(TAG, "Sub onStart --- 서브 시작");
        super.onStart();

    }

    @Override
    protected void onResume() {
        Log.v(TAG, "Sub onResume --- 서브 계속");
        super.onResume();

        subText = findViewById(R.id.subText);

        subText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        Log.v(TAG, "Sub onPause --- 서브 잠시 멈춤");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.v(TAG, "Sub onStop --- 서브 스탑");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.v(TAG, "Sub onDestory --- 서브 종료");
        super.onDestroy();
    }
}
