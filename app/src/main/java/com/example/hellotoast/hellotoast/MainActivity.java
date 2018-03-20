package com.example.hellotoast.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Context;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count); // refers to the show_count text view
    }

    public void showToast(View view) {
        Context context = getApplicationContext(); // Can be replaced with this
        Toast toast = Toast.makeText(context, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
