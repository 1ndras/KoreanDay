package com.example.indra_act.koreanday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.indra_act.koreanday.vokal.VokalDasar;
import com.example.indra_act.koreanday.vokal.VokalRangkap;


public class Vokal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vokal);

        ImageButton btn1 = (ImageButton) findViewById(R.id.vokaldasar);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(Vokal.this, VokalDasar.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.vokalrangkap);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(Vokal.this, VokalRangkap.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });


    }
}
