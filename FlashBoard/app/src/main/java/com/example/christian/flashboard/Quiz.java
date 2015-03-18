package com.example.christian.flashboard;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Quiz extends ActionBarActivity {

    private GestureDetectorCompat mGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        TextView mTextView = (TextView) findViewById(R.id.textView);
        mGestureDetector = new GestureDetectorCompat(this, new MyGestureListener());
    }
    
    @Override 
    public boolean onTouchEvent(MotionEvent event){ 
        this.mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

        //For changing cards
        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, 
                float velocityX, float velocityY) {
            //if x velocity < 0, fling left
            
            //if x velocity > 0, fling right
            
            return true;
        }
        
        //For flipping the card
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            
        }
        
    }
}
