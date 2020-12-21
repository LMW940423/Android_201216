package com.android.putextra;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    final static int RValue = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = findViewById(R.id.tv_third);

        findViewById(R.id.btn_main2).setOnClickListener(onClickListener);

        Intent intent = getIntent();
        String text = intent.getStringExtra("main");
        int num = intent.getExtras().getInt("num");

        textView.setText("text : " + text + " / num : " + num);
    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("result", "From ThirdActivity");
            setResult(RValue, intent);
            finish();
        }
    };
}
