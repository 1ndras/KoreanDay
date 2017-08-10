package com.example.indra_act.koreanday;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";

    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE IF NOT EXISTS tbl_soal(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        values.put("soal", "Apa Bahasa indonesia dari gambar di samping?");
        values.put("pil_a", "Tidur");
        values.put("pil_b","Makan");
        values.put("pil_c", "Makan Sambil Tidur");
        values.put("jwban","0");
        values.put("img", R.drawable.satu);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa Bahasa indonesia dari gambar di samping?");
        values.put("pil_a", "Jalan-jalan");
        values.put("pil_b","Mencuci.");
        values.put("pil_c", "Mengerjakan.");
        values.put("jwban","2");
        values.put("img", R.drawable.dua);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa nama latin dari gambar di samping?");
        values.put("pil_a", "1");
        values.put("pil_b","2");
        values.put("pil_c", "3");
        values.put("jwban","0");
        values.put("img", R.drawable.dua);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa Bahasa indonesia dari gambar di samping?");
        values.put("pil_a", "10");
        values.put("pil_b","20");
        values.put("pil_c", "30");
        values.put("jwban","0");
        values.put("img", R.drawable.satu);
        db.insert("tbl_soal", "soal", values);

        values.put("soal", "Apa Bahasa indonesia dari gambar di samping?");
        values.put("pil_a", "100 ");
        values.put("pil_b","200");
        values.put("pil_c", "300");
        values.put("jwban","0");
        values.put("img", R.drawable.dua);
        db.insert("tbl_soal", "soal", values);

        String sql2 = "CREATE TABLE IF NOT EXISTS tbl_gambar(id INTEGER PRIMARY KEY AUTOINCREMENT, nama TEXT, img BLOB)";
        db.execSQL(sql2);

        ContentValues v = new ContentValues();
        v.put("nama", "Satu");
        v.put("img", R.drawable.satu);
        db.insert("tbl_gambar", "nama", v);

        v.put("nama", "Dua");
        v.put("img", R.drawable.dua);
        db.insert("tbl_gambar", "nama", v);

    }

    public List<Soal> getSoal(){
        List<Soal> listSoal = new ArrayList<Soal>();
        String query = "select * from tbl_soal";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                Soal s = new Soal();
                s.setSoal(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setPil_c(cursor.getString(4));
                s.setJwban(cursor.getInt(5));
                s.setGambar(cursor.getInt(6));
                listSoal.add(s);
            }while(cursor.moveToNext());
        }

        return listSoal;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_soal");
        db.execSQL("DROP TABLE IF EXISTS tbl_gambar");
        onCreate(db);
    }

}