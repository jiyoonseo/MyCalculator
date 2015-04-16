package com.jiyoonseo.mycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Mycalc extends ActionBarActivity {

    private static final String TAG = "MyCalc.Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mycalc);
    }




    public void clearButtonClicked(View view ){
        Log.d(TAG, String.valueOf(view.getTag()));

        final TextView textView = (TextView) findViewById(R.id.edit_number);
        //String tvString = textView.getText() + "clr"; //to test visually
        String tvString = "";
        textView.setText(tvString);

    }


    /*test modulizer : when any number button was clicked...*/
    public void anyButtonClicked(View view ){
        Log.d(TAG, String.valueOf(view.getTag()));

        final TextView textView = (TextView) findViewById(R.id.edit_number);
        String tvString = textView.getText() + String.valueOf(view.getTag());
        textView.setText(tvString);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mycalc, menu);
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
}
