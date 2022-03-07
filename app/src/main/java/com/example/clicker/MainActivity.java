package com.example.clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private Integer limit = 10;
    public void onButtonAdd(View view){
        counter++;
        TextView counterView = (TextView) findViewById(R.id.textView);
        TextView FigureOval = (TextView) findViewById(R.id.textView2);
        if (counter >= limit){
            ViewGroup.LayoutParams ovalparams = counterView.getLayoutParams();
            ovalparams.width = (FigureOval.getWidth() + 50);
            ovalparams.height = (FigureOval.getHeight() + 50);
            FigureOval.setLayoutParams(ovalparams);
            limit *= 10;
        }
        counterView.setText(Integer.toString(counter));
    }


}