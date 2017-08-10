package com.example.indra_act.koreanday.vokal;

import android.media.MediaPlayer;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListdataVokalDasar {

    public ListView mlist;
    public MediaPlayer mediaPlayer;
    public ExpandableListView expandableListView;



    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


        List<String> a = new ArrayList<String>();
        a.add("ㅏ");
        a.add("아");

        List<String> o = new ArrayList<String>();
        o.add("ㅗ");
        o.add("오");

        List<String> i = new ArrayList<String>();
        i.add("ㅣ");
        i.add("이");

        List<String> u = new ArrayList<String>();
        u.add("ㅜ");
        u.add("우");

        List<String> eo = new ArrayList<String>();
        eo.add("ㅓ");
        eo.add("어");

        List<String> eu = new ArrayList<String>();
        eu.add("ㅡ");
        eu.add("으");

        List<String> ya = new ArrayList<String>();
        ya.add("ㅑ");
        ya.add("야");

        List<String> yo = new ArrayList<String>();
        yo.add("ㅛ");
        yo.add("요");

        List<String> yu = new ArrayList<String>();
        yu.add("ㅠ");
        yu.add("유");

        List<String> yeo = new ArrayList<String>();
        yeo.add("ㅕ");
        yeo.add("여");


        expandableListDetail.put("A", a);
        expandableListDetail.put("O", o);
        expandableListDetail.put("I", i);
        expandableListDetail.put("U", u);
        expandableListDetail.put("EO", eo);
        expandableListDetail.put("EU", eu);
        expandableListDetail.put("YA", ya);
        expandableListDetail.put("YO", yo);
        expandableListDetail.put("YU", yu);
        expandableListDetail.put("YEO", yeo);


        return expandableListDetail;
    }
}
