package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    int scaling = 1;
    int limit = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonAdd(View view){
        counter = counter + 1*scaling;
        TextView counterView = (TextView) findViewById(R.id.textView);
        TextView FigureOval = (TextView) findViewById(R.id.textView2);
        if (counter >= limit){
            ViewGroup.LayoutParams ovalparams = counterView.getLayoutParams();
            ovalparams.width = (FigureOval.getWidth() + 25);
            ovalparams.height = (FigureOval.getHeight() + 25);
            FigureOval.setLayoutParams(ovalparams);
            limit *= 10;
        }
        counterView.setText(Integer.toString(counter));
    }

}