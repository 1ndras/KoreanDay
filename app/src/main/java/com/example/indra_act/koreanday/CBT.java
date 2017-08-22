package com.example.indra_act.koreanday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.indra_act.koreanday.cbt.Listening;
import com.example.indra_act.koreanday.cbt.SoalActivity;

public class CBT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cbt);

        ImageButton btn1 = (ImageButton) findViewById(R.id.cbt);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(CBT.this, SoalActivity.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.listening);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(CBT.this, Listening.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });


    }
}
