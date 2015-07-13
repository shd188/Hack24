package com.aimer.shd.hack24;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Integer> list=new ArrayList<>();
//        for (int i=0;i<10;i++){
//            list.add(i,i+1);
//        }
        ListView mListView= (ListView) findViewById(R.id.listView);
        ImageView emptyView= (ImageView) findViewById(R.id.empty_view);
        emptyView.setVisibility(View.GONE);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        if (list.size()==0) {
            mListView.setEmptyView(emptyView);
        }else{
            mListView.setAdapter(arrayAdapter);
        }
    }


}
