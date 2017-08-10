package com.example.indra_act.koreanday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListdataNumber {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();




        List<String> satu = new ArrayList<String>();
        satu.add("Hana");
        satu.add("하나 (한)");

        List<String> dua = new ArrayList<String>();
        dua.add("Dul");
        dua.add("둘 (두)");

        List<String> tiga = new ArrayList<String>();
        tiga.add("Set");
        tiga.add("셋 (세)");

        List<String> empat = new ArrayList<String>();
        empat.add("ㄹ");

        List<String> lima = new ArrayList<String>();
        lima.add("ㅁ");

        List<String> enam = new ArrayList<String>();
        enam.add("ㅂ");

        List<String> tujuh = new ArrayList<String>();
        tujuh.add("ㅅ");

        List<String> delapan = new ArrayList<String>();
        delapan.add("ㅇ");

        List<String> sembilan = new ArrayList<String>();
        sembilan.add("ㅈ");

        List<String> sepuluh = new ArrayList<String>();
        sepuluh.add("ㅊ");

        List<String> sebelas = new ArrayList<String>();
        sebelas.add("ㅋ");

        List<String> duabelas = new ArrayList<String>();
        duabelas.add("ㅌ");

        List<String> duapuluh = new ArrayList<String>();
        duapuluh.add("ㄳ");

        List<String> duasatu = new ArrayList<String>();
        duasatu.add("ㄶ");

        List<String> duadua = new ArrayList<String>();
        duadua.add("ㄻ");

        List<String> tigapuluh = new ArrayList<String>();
        tigapuluh.add("ㄼ");

        List<String> tigasatu = new ArrayList<String>();
        tigasatu.add("ㄽ");

        List<String> tigadua = new ArrayList<String>();
        tigadua.add("ㄾ");

        List<String> empatpuluh = new ArrayList<String>();
        empatpuluh.add("ㄿ");

        List<String> empatsatu = new ArrayList<String>();
        empatsatu.add("ㄿ");

        List<String> empatdua = new ArrayList<String>();
        empatdua.add("ㄿ");

        List<String> limapuluh = new ArrayList<String>();
        limapuluh.add("ㅀ");

        List<String> limasatu = new ArrayList<String>();
        limasatu.add("ㅊ");

        List<String> enampuluh = new ArrayList<String>();
        enampuluh.add("ㅋ");

        List<String> enamsatu = new ArrayList<String>();
        enamsatu.add("ㅌ");

        List<String> tujuhpuluh = new ArrayList<String>();
        tujuhpuluh.add("ㄳ");

        List<String> tujuhsatu = new ArrayList<String>();
        tujuhsatu.add("ㄶ");

        List<String> delapanpuluh = new ArrayList<String>();
        delapanpuluh.add("ㄻ");

        List<String> delapansatu = new ArrayList<String>();
        delapansatu.add("ㄼ");

        List<String> sembilanpuluh = new ArrayList<String>();
        sembilanpuluh.add("ㄽ");

        List<String> sembilansatu = new ArrayList<String>();
        sembilansatu.add("ㄾ");

        List<String> seratus = new ArrayList<String>();
        seratus.add("ㄿ");

        List<String> seribu = new ArrayList<String>();
        seribu.add("ㄿ");

        List<String> sepuluhribu = new ArrayList<String>();
        sepuluhribu.add("ㄿ");

        List<String> seratusribu = new ArrayList<String>();
        seratusribu.add("ㄶ");

        List<String> satujuta = new ArrayList<String>();
        satujuta.add("ㄻ");

        List<String> sepuluhjuta = new ArrayList<String>();
        sepuluhjuta.add("ㄼ");

        List<String> seratusjuta = new ArrayList<String>();
        seratusjuta.add("ㄽ");

        List<String> satumilyar = new ArrayList<String>();
        satumilyar.add("ㄾ");

        List<String> sepuluhmilyar = new ArrayList<String>();
        sepuluhmilyar.add("ㄿ");

        List<String> seratusmilyar = new ArrayList<String>();
        seratusmilyar.add("ㄿ");

        List<String> satutriliun = new ArrayList<String>();
        satutriliun.add("ㄿ");


        expandableListDetail.put("1", satu);
        expandableListDetail.put("2", dua);
        expandableListDetail.put("3", tiga);
        expandableListDetail.put("4", empat);
        expandableListDetail.put("5", lima); //4
        expandableListDetail.put("6", enam); //6
        expandableListDetail.put("7", tujuh);
        expandableListDetail.put("8", delapan);
        expandableListDetail.put("9", sembilan);
        expandableListDetail.put("10", sepuluh); //2
        expandableListDetail.put("11", sebelas);
        expandableListDetail.put("12", duabelas);
        expandableListDetail.put("20", duapuluh);
        expandableListDetail.put("21", duasatu);
        expandableListDetail.put("22", duadua);
        expandableListDetail.put("30", tigapuluh);
        expandableListDetail.put("31", tigasatu);
        expandableListDetail.put("32", tigadua);
        expandableListDetail.put("40", empatpuluh);
        expandableListDetail.put("41", empatsatu);
        expandableListDetail.put("42", empatdua);
        expandableListDetail.put("50", limapuluh);
        expandableListDetail.put("51", limasatu);
        expandableListDetail.put("60", enampuluh);
        expandableListDetail.put("61", enamsatu);
        expandableListDetail.put("70", tujuhpuluh);
        expandableListDetail.put("71", tujuhsatu);
        expandableListDetail.put("80", delapanpuluh);
        expandableListDetail.put("81", delapansatu);
        expandableListDetail.put("90", sembilanpuluh); //5
        expandableListDetail.put("91", sembilansatu); //3
        expandableListDetail.put("100", seratus); //1
        expandableListDetail.put("1000", seribu);
        expandableListDetail.put("10.000", sepuluhribu);
        expandableListDetail.put("100.000", seratusribu);
        expandableListDetail.put("1000.000", satujuta);
        expandableListDetail.put("10.000.000", sepuluhjuta);
        expandableListDetail.put("100.000.000", seratusjuta);
        expandableListDetail.put("1000.000.000", satutriliun);

/*
        expandableListDetail.put( String.valueOf( expandableListDetail.get(0) ),satu);
        expandableListDetail.put( String.valueOf( expandableListDetail.get(1) ),dua);
        expandableListDetail.put( String.valueOf( expandableListDetail.get(2) ),tiga);
*/

        return expandableListDetail;
    }
}
