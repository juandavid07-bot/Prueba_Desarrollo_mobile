package app.carperta.prueba_desarrollo_mobile;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.health.TimerStat;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Design_BottomSheetDialog);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscareen);
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent in = new Intent(MainActivity.this,Inicio.class);
                startActivity(in);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(tarea,3000);
    }
}