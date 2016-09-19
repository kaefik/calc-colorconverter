package ru.kaefik.isaifutdinov.calc_colorconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mX;
    EditText mY;
    TextView mZ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onRunCalc(View v){
        Float x,y,z;
        mX = (EditText) findViewById(R.id.editTextX);
        mY = (EditText) findViewById(R.id.editTextY);
        mZ = (TextView) findViewById(R.id.textViewZ);

        x=Float.parseFloat(mX.getText().toString());
        y=Float.parseFloat(mY.getText().toString());

        z=((x-0.332f)/(0.1858f-y))*((x-0.332f)/(0.1858f-y))*((x-0.332f)/(0.1858f-y))*449.0f+((x-0.332f)/(0.1858f-y))*((x-0.332f)/(0.1858f-y))*3525+((x-0.332f)/(0.1858f-y))*6823.3f+5520.33f;

        mZ.setText(Float.toString(z));


    }
}
