package com.android.showhidekey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //키패드 숨기고 보여주기

    InputMethodManager mImm;
    EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        mEdit = findViewById(R.id.edit);

        findViewById(R.id.showBtn).setOnClickListener(mClickListener);
        findViewById(R.id.hideBtn).setOnClickListener(mClickListener);

    }
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.showBtn:
                    mImm.showSoftInput(mEdit, 0); // 키패드 보여주기
                    break;
                case R.id.hideBtn:
                    mImm.hideSoftInputFromWindow(mEdit.getWindowToken(), 0); // 키패드 숨기기
                    break;
            }

        }
    };
}