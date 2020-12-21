package com.android.listener02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 이벤트 총 정리

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv01);
        Button btn = findViewById(R.id.btn01);
        ImageView iv = findViewById(R.id.iv01);
        EditText et = findViewById(R.id.et01);
        SeekBar sb = findViewById(R.id.sb01);

        tv.setOnClickListener(new View.OnClickListener() { // 그냥 클릭
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "TextView Click", Toast.LENGTH_SHORT).show();
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() { // 길게 클릭
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Button Long Click", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        iv.setOnTouchListener(new View.OnTouchListener() { // 이미지 뷰 터치
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(MainActivity.this, "ImageView Touch", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        et.addTextChangedListener(new TextWatcher() { // EditText
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                Toast.makeText(MainActivity.this, "Edit Before : " + s.toString(), Toast.LENGTH_SHORT).show(); // CharSequence는 글자
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Toast.makeText(MainActivity.this, "Edit On : " + s.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
                Toast.makeText(MainActivity.this, "Edit After : " + s.toString(), Toast.LENGTH_SHORT).show();
            }
        });

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(MainActivity.this, "Seek On : " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek Start : " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek Stop : " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}