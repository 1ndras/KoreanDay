package com.example.indra_act.koreanday.konsonan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListdataKonsonanRangkap {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> kk = new ArrayList<String>();
        kk.add("ㄲ");

        List<String> tt = new ArrayList<String>();
        tt.add("ㄸ");

        List<String> pp = new ArrayList<String>();
        pp.add("ㅃ");

        List<String> ss = new ArrayList<String>();
        ss.add("ㅆ");

        List<String> cc = new ArrayList<String>();
        cc.add("ㅉ");


        expandableListDetail.put("KK", kk);
        expandableListDetail.put("TT", tt);
        expandableListDetail.put("PP", pp);
        expandableListDetail.put("SS", ss);
        expandableListDetail.put("CC", cc);

        return expandableListDetail;
    }
}
