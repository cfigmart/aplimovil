package edu.unicauca.principal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.CountDownTimer;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creamos una notificación para mostrar un mensaje cuando se llama al método onCreate
        final Toast tag  = Toast.makeText(this, "llamando onCreate()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Toast tag  = Toast.makeText(this, "llamando onStart()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        final Toast tag  = Toast.makeText(this, "llamando onStop()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        final Toast tag  = Toast.makeText(this, "llamando onDestroy()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        final Toast tag  = Toast.makeText(this, "llamando onPause()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        final Toast tag  = Toast.makeText(this, "llamando onResume()", Toast.LENGTH_SHORT);
        tag.show();
        timeToast(tag, 500);
        System.out.println("En el método onResume()");
    }

    void timeToast(final Toast tag, int time){
        new CountDownTimer(time, time){
            public void onTick(long millisUntilFinished){
                tag.show();
            }public void onFinish(){
                tag.show();
            }
        }.start();
    }
}