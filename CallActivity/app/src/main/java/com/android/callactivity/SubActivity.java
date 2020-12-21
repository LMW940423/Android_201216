package com.android.callactivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        // 화면 전환
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); // 화면 돌리기 (Manifest.xml에서도 바꿀 수 있다.)

        Button btnClose = findViewById(R.id.close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 특별히 주고받는 값이 없을 때는 간단하게 현재 창만 종료시킬 수 있다.
            }
        });
    }
}
