package com.example.indra_act.koreanday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MenuGrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_grid);

/*        //replace tittle to icon
        ActionBar menu = getSupportActionBar();
        menu.setDisplayShowHomeEnabled(false);
        menu.setDisplayHomeAsUpEnabled(false);
*/
        ImageButton btn1 = (ImageButton) findViewById(R.id.vokal);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, Vokal.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn2 = (ImageButton) findViewById(R.id.konsonan);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, Konsonan.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn3 = (ImageButton) findViewById(R.id.angka);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, Number.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn4 = (ImageButton) findViewById(R.id.dialog);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, Conversation.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn5 = (ImageButton) findViewById(R.id.latihan);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, Kuis.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });

        ImageButton btn6 = (ImageButton) findViewById(R.id.cbt);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = (new Intent(MenuGrid.this, CBT.class));
                startActivity(i);
                this.finish();
            }

            private void finish() {
            }
        });
    }
}