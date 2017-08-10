package com.example.indra_act.koreanday.vokal;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.indra_act.koreanday.CustomExpandableListAdapter;
import com.example.indra_act.koreanday.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class VokalRangkap extends AppCompatActivity {

    public ListView textView;
    public MediaPlayer player;

    ExpandableListView expandableListViewRangkap;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitleRangkap;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vokal_rangkap);
        expandableListViewRangkap = (ExpandableListView) findViewById(R.id.expandableListVokalRAngkap);
        expandableListDetail = ListdataVokalRangkap.getData();

        expandableListTitleRangkap = new ArrayList<String>(expandableListDetail.keySet());

        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitleRangkap, expandableListDetail);
        expandableListViewRangkap.setAdapter(expandableListAdapter);

//mengeluarkan snackbar
        /*
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition),
                        Toast.LENGTH_SHORT).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                Toast.makeText(getApplicationContext(),
                        expandableListTitle.get(groupPosition),
                        Toast.LENGTH_SHORT).show();

            }
        });
*/
        expandableListViewRangkap.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        expandableListTitleRangkap.get(groupPosition)
                                + " -> "
                                + expandableListDetail.get(
                                expandableListTitleRangkap.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT
                ).show();
                return false;
            }
        });
    }


}
