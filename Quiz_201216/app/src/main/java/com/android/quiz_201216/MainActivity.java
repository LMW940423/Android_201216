package com.android.quiz_201216;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView = null;
    ImageView imageView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.fruit);
        imageView = findViewById(R.id.imageView);

        findViewById(R.id.AppleBtn).setOnClickListener(mClickListener);
        findViewById(R.id.OrangeBtn).setOnClickListener(mClickListener);

    }

    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.AppleBtn:
                    textView.setText("APPLE");
                    textView.setTextColor(Color.RED);
                    imageView.setImageResource(R.drawable.apple);
                    break;
                case R.id.OrangeBtn:
                    textView.setText("ORANGE");
                    textView.setTextColor(Color.YELLOW);
                    imageView.setImageResource(R.drawable.orange);
                    break;

            }

        }
    };
}