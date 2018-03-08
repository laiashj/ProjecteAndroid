package net.vidalibarraquer.laiass.projecteandroid;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class TaulellActivity extends AppCompatActivity implements View.OnClickListener, assignaModel<Model>{

    private ImageButton bt_dau;
    private int dau;
    private View dialogView;
    private AlertDialog.Builder dialogBuilder;
    private Model model;
    private int torn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taulell);

        bt_dau = (ImageButton) findViewById(R.id.bt_dau);
        bt_dau.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        if (v.getId() == R.id.bt_dau){
            dau = random.nextInt(6)+1;
            alerta();
        }
    }

    public void alerta(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(TaulellActivity.this);
        builder.create();
        builder.setMessage("DAU:"+dau).show();
    }
    public void tornJugador(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(TaulellActivity.this);
        builder.create();
        builder.setMessage("TORN DEL JUGADOR:"+model.getJugadorTorn(torn)).show();
    }

    public void canviTorn(){
        torn = (torn + 1)% model.getMida();
    }


    @Override
    public void assignaModel(Model obj) {
        model = obj;
    }
}
