package com.example.indra_act.koreanday.vokal;

import android.media.MediaPlayer;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListdataVokalRangkap {

    public ListView mlist;
    public MediaPlayer mediaPlayer;
    public ExpandableListView expandableListViewRangkap;



    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();


        List<String> ae = new ArrayList<String>();
        ae.add("애");
        ae.add("아 + 이");

        List<String> yae = new ArrayList<String>();
        yae.add("얘");
        yae.add("야 + 이");

        List<String> e = new ArrayList<String>();
        e.add("에");
        e.add("어 + 이");

        List<String> ye = new ArrayList<String>();
        ye.add("예");
        ye.add("여 + 이");

        List<String> oe = new ArrayList<String>();
        oe.add("외");
        oe.add("오 + 이");

        List<String> wa = new ArrayList<String>();
        wa.add("와");
        wa.add("오 + 아");

        List<String> wae = new ArrayList<String>();
        wa.add("왜");
        wae.add("오 + 애");

        List<String> wo = new ArrayList<String>();
        wo.add("워");
        wo.add("우 + 어");

        List<String> we = new ArrayList<String>();
        we.add("웨");
        we.add("우 + 에");

        List<String> wi = new ArrayList<String>();
        wi.add("위");
        wi.add("우 + 이");

        List<String> eui = new ArrayList<String>();
        eui.add("의");
        eui.add("으 + 이");

        expandableListDetail.put("AE/E", ae);
        expandableListDetail.put("YAE/YE", yae);
        expandableListDetail.put("E", e);
        expandableListDetail.put("YE", ye);
        expandableListDetail.put("OE", oe);
        expandableListDetail.put("WA", wa);
        expandableListDetail.put("WAE/WE", wae);
        expandableListDetail.put("WO", wo);
        expandableListDetail.put("WE", we);
        expandableListDetail.put("WI", wi);
        expandableListDetail.put("EUI/UI", eui);

        return expandableListDetail;
    }
}
