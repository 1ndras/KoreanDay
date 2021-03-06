package com.example.indra_act.koreanday;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btnstart);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent a = new Intent(getApplicationContext(), MenuGrid.class);
                startActivity(a);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btninfo);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getApplicationContext(), About.class);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnexit);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder alertexit = new AlertDialog.Builder(
                        MainActivity.this);
                alertexit
                        .setMessage("Apakah Anda Akan Keluar Dari Aplikasi ini?")
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .setTitle("Keluar")
                        .setCancelable(false)
                        .setPositiveButton("Ya",
                                new AlertDialog.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0,
                                                        int arg1) {
                                        System.exit(0);
                                    }
                                })
                        .setNegativeButton("Tidak",
                                new AlertDialog.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog a = alertexit.create();
                a.show();
            }
        });
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Keluar")
                .setMessage("Apakah Anda Akan Keluar Dari Aplikasi ini?")
                .setCancelable(false)
                .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        MainActivity.this.finish();
                    }
                })
                .setNegativeButton("Tidak", null)
                .show();
    }

    @Override public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
}