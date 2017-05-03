package com.example.soportecea.posicionamientodeinteriores;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SensorEventListener{
    private TextView textView;
    private SensorManager mSensorManager;
    Arbol arbol;
    String lab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init
        arbol = new Arbol();
        textView = (TextView)findViewById(R.id.textView);
        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        //event


        mSensorManager.registerListener(this, mSensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD),SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this){
            switch (event.sensor.getType()){
                case Sensor.TYPE_MAGNETIC_FIELD:
                    lab = arbol.comparar(event.values[0],event.values[1],event.values[2]);
                    Log.i("DEBUG",String.valueOf(event.values[0])+String.valueOf(event.values[1])+String.valueOf(event.values[2]));
                    textView.setText(textView.getText()+lab);
                    break;
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
