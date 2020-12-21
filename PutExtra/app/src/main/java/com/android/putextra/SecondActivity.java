package com.android.putextra;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Intent intent = null;
    TextView tv_Second = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.v("SubActivity TAG", "Sub ------ onCreate 1");
        String text = intent.getStringExtra("main");
        Log.v("SubActivity TAG", "Sub ------ onCreate 2");
        int num = intent.getExtras().getInt("num");
        Log.v("SubActivity TAG", "Sub ------ onCreate 3");

        tv_Second = findViewById(R.id.tv_second);
        Log.v("SubActivity TAG", "Sub ------ onCreate 4");
        tv_Second.setText("TEXT : " + text + " / num : " + num);
        Log.v("SubActivity TAG", "Sub ------ onCreate 5");

        findViewById(R.id.btn_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SecondActivity.this, MainActivity.class);
                intent.putExtra("second", "From Second");
                intent.putExtra("num", num);
                startActivity(intent);
            }
        });

    }
}
