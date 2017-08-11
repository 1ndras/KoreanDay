package com.example.indra_act.koreanday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.indra_act.koreanday.konsonan.KonsonanDasar;
import com.example.indra_act.koreanday.konsonan.KonsonanRangkap;
import com.example.indra_act.koreanday.vokal.VokalDasar;

public class Konsonan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konsonan);

        ImageButton btn1 = (ImageButton) findViewById(R.id.konsonandasar);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(Konsonan.this, KonsonanDasar.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.konsonanrangkap);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(Konsonan.this, KonsonanRangkap.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });


    }
}
