package net.vidalibarraquer.laiass.projecteandroid;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class TaulellActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton bt_dau;
    private int dau;
    private View dialogView;
    private AlertDialog.Builder dialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taulell);

        bt_dau = (ImageButton) findViewById(R.id.bt_dau);
        bt_dau.setOnClickListener(this);

        dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        dialogView = inflater.inflate(R.layout.dau, null);
        dialogBuilder.setView(dialogView);
    }

    @Override
    public void onClick(View v) {
        Random random = new Random();
        if (v.getId() == R.id.bt_dau){
            dau = random.nextInt(6)+1;
            //System.out.println("----------------------------dau : "+dau);
            alerta();
        }
    }

    public void alerta(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(TaulellActivity.this);
        builder.create();
        builder.setMessage("DAU:"+dau).show();
    }

}
