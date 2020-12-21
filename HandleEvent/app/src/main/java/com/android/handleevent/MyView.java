package com.android.handleevent;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MyView extends View {
    // Field
    private Context mContext;

    // Constructor
    public MyView(Context context) {
        super(context);
        this.mContext = context;
    }

    // Method
    @Override
    public boolean onTouchEvent(MotionEvent event) { // 아무곳이나 터치했을 때 액션 발생(게임쪽에서 사용 많이 한다)
        super.onTouchEvent(event);

        if(event.getAction() == MotionEvent.ACTION_DOWN) { // 눌렀다 뗐을 때
            Toast.makeText(this.mContext, "Touch Event Recevied", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;
    }
}
