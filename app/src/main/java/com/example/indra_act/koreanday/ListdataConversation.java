package com.example.indra_act.koreanday;

import android.content.Intent;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListdataConversation {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        List<String> Apakabar = new ArrayList<String>();
        Apakabar.add("Annyeong haseyo");
        Apakabar.add("안녕 하세요? ");

        List<String> Selamattinggal = new ArrayList<String>();
        Selamattinggal.add("Annyeonghi kyeseyo");
        Selamattinggal.add("안녕히 계세요 ");

        List<String> Selamatjalan = new ArrayList<String>();
        Selamatjalan.add("Annyeonghi kaseyo");
        Selamatjalan.add("안녕히 가세요 ");

        List<String> Terimakasih = new ArrayList<String>();
        Terimakasih.add("Komapseumnida/Kamsahamnida");
        Terimakasih.add("고맙습니다 / 감사합니다");

        List<String> Maaf = new ArrayList<String>();
        Maaf.add("Choesonghamnida/Mianhamnida");
        Maaf.add("죄송합니다 / 미안합니다 ");

        List<String> Ya = new ArrayList<String>();
        Ya.add("Ne");
        Ya.add("네");

        List<String> Bukan = new ArrayList<String>();
        Bukan.add("Aniyo");
        Bukan.add("아니요");

        List<String> selamattidur = new ArrayList<String>();
        selamattidur.add("Annyeonghi Chumusipsiyo");
        selamattidur.add("안녕히 주무십시오");

        List<String> selamat = new ArrayList<String>();
        selamat.add("Chukhahamnida");
        selamat.add("축하합니다");

        List<String> Selamatulangtahun = new ArrayList<String>();
        Selamatulangtahun.add("Saengil chukhahamnida");
        Selamatulangtahun.add("생일 축합니다");

        List<String> Permisi = new ArrayList<String>();
        Permisi.add("Sillyehamnida");
        Permisi.add("실례합니다");

        List<String> Yaada = new ArrayList<String>();
        Yaada.add("Ne, Isseumnida");
        Yaada.add("네, 있습니다 ");

        List<String> Tidaktidakada = new ArrayList<String>();
        Tidaktidakada.add("Aniyo, opsemnida");
        Tidaktidakada.add("아니오, 없습니다 ");

        List<String> Tentusaja = new ArrayList<String>();
        Tentusaja.add("Mullon imnida");
        Tentusaja.add("물론 입니다  ");

        List<String> terimakasih = new ArrayList<String>();
        terimakasih.add("Kamsahamnida");
        terimakasih.add("감사합니다 ");

        List<String> maaf = new ArrayList<String>();
        maaf.add("Mianhamnida");
        maaf.add("미안합니다 ");

        List<String> Mohonmaaf = new ArrayList<String>();
        Mohonmaaf.add("Choesonghamnida");
        Mohonmaaf.add("죄송합니다 ");

        List<String> Tidakapaapa = new ArrayList<String>();
        Tidakapaapa.add("Kwenchanseumnida");
        Tidakapaapa.add("괜찮습니다 ");

        List<String> Sudahtahu = new ArrayList<String>();
        Sudahtahu.add("Arasseumnida");
        Sudahtahu.add("알았습니다");

        List<String> Kabarbaik= new ArrayList<String>();
        Kabarbaik.add("Chal chinaeseumnida");
        Kabarbaik.add("잘 지내습니다  ");

        List<String> Tidakbaik= new ArrayList<String>();
        Tidakbaik.add("Anjoseumnida");
        Tidakbaik.add("안좋습니다 ");

        List<String> Sampaibertemulagi= new ArrayList<String>();
        Sampaibertemulagi.add("Tto manapsida");
        Sampaibertemulagi.add("또 만납시다  ");

        List<String> benarkah= new ArrayList<String>();
        benarkah.add("Cheongmalimnikka?");
        benarkah.add("정말입니까 ? ");

        List<String> Apabetul= new ArrayList<String>();
        Apabetul.add("Keuroseumnikka");
        Apabetul.add("그렇습니까 ?");

        expandableListDetail.put("Apa kabar ?", Apakabar);
        expandableListDetail.put("Selamat tinggal", Selamattinggal);
        expandableListDetail.put("Selamat jalan", Selamatjalan);
        expandableListDetail.put("Terima kasih", Terimakasih);
        expandableListDetail.put("Ma’af",maaf);
        expandableListDetail.put("Ya",Ya);
        expandableListDetail.put("Tidak/Bukan",Bukan);
        expandableListDetail.put("Selamat Tidur",selamattidur);
        expandableListDetail.put("Selamat",selamat);
        expandableListDetail.put("Selamat ulang tahun",Selamatulangtahun);
        expandableListDetail.put("Permisi",Permisi);
        expandableListDetail.put("Ya, ada",Yaada);
        expandableListDetail.put("Tidak, tidak ada", Tidaktidakada);
        expandableListDetail.put("Tentu saja", Tentusaja);
        expandableListDetail.put("Terima kasih", terimakasih);
        expandableListDetail.put("Mohon ma’af", Mohonmaaf);
        expandableListDetail.put("Tidak apa-apa", Tidakapaapa);
        expandableListDetail.put("Sudah tahu", Sudahtahu);
        expandableListDetail.put("Kabar baik", Kabarbaik);
        expandableListDetail.put("Tidak baik", Tidakbaik);
        expandableListDetail.put("Sampai bertemu lagi", Sampaibertemulagi);
        expandableListDetail.put("Benarkah ?", benarkah);
        expandableListDetail.put("Apa betul ?", Apabetul);

        return expandableListDetail;

    }
}
