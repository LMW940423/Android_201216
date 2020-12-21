package com.android.listadddel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<String>();
        items.add("Frist");
        items.add("Second");
        items.add("Third");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, items);
        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setChoiceMode(listView.CHOICE_MODE_SINGLE);

        listView.setOnItemClickListener(mItemClickListener);
        findViewById(R.id.addBtn).setOnClickListener(mClickListener);
        findViewById(R.id.delBtn).setOnClickListener(mClickListener);
    }

    AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String message;
            message = "Select Item = " + items.get(position);
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

        }
    };
    // 버튼 눌렀을 때 리스트 추가 및 삭제
    View.OnClickListener mClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText editText = findViewById(R.id.newItem);

            switch (v.getId()){
                case R.id.addBtn:
                    String text = editText.getText().toString(); // ArrayList 타입에 맞춰 변환시켜야 한다.

                    if (text.length() != 0){
                        items.add(text);
                        editText.setText("");
                        adapter.notifyDataSetChanged(); // 이미 선언된 Adapter의 데이터를 바꾸는 방법!

                    }
                    break;
                case R.id.delBtn:
                    int id; // 몇번째를 눌렀는 지 확인하기 위한 변수
                    id = listView.getCheckedItemPosition();

                    if(id != ListView.INVALID_POSITION){ // 예외처리
                        items.remove(id); // items의 선택된 값 삭제
                        listView.clearChoices(); // 체크된 거 초기화
                        adapter.notifyDataSetChanged();
                    }

            }

        }
    };

} // -----------------