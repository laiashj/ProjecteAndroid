package net.vidalibarraquer.laiass.projecteandroid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
//per crear el tauler constraint layout pq sigui responsiu
// gridLayout per posar imageView

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bt_jugar;
    private Button bt_opcions;
    private Button bt_inst;
    private View dialogView;
    private AlertDialog.Builder dialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_jugar = (Button)findViewById(R.id.bt_jugar);
        bt_inst = (Button)findViewById(R.id.bt_inst);
        bt_opcions = (Button)findViewById(R.id.bt_opcions);

        bt_jugar.setOnClickListener(this);
        bt_inst.setOnClickListener(this);
        bt_opcions.setOnClickListener(this);

        dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        dialogView = inflater.inflate(R.layout.instruccions, null);
        dialogBuilder.setView(dialogView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_jugar:
                Intent intent = new Intent(MainActivity.this, JugadorsActivity.class);
                startActivity(intent);
                break;
            case R.id.bt_inst:
                AlertDialog alertDialog = dialogBuilder.create();
                alertDialog.show();
                break;
            case R.id.bt_opcions:
                break;
            default:
                break;
        }
    }
}
