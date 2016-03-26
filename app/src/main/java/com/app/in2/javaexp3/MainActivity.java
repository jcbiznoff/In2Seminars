package com.app.in2.javaexp3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

/**
 * Created by jaychung on 3/26/16.
 */
public class MainActivity extends Activity
        implements RecyclerViewAdapter.OnItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.item_layout);
        Log.d("Activity", "Oncreate");
//
        RecyclerView myRecyclerView = new RecyclerView(getApplicationContext());


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerViewAdapter myRecyclerViewAdapter = new RecyclerViewAdapter(this);
        myRecyclerViewAdapter.setOnItemClickListener(this);
        myRecyclerView.setAdapter(myRecyclerViewAdapter);
        myRecyclerView.setLayoutManager(linearLayoutManager);

        setContentView(myRecyclerView);

//        //insert dummy items
        String[] names = new String[]{
                "Eric",
                "Android",
                "Android-er",
                "Google",
                "android dev",
                "android-er.blogspot.com",
                "Peter",
                "Paul",
                "Mary",
                "May",
                "Divid",
                "Frankie"
        };

        for (int i = 0; i < 12; i++) {
            myRecyclerViewAdapter.add(i, names[i]);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity", "Onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity", "Onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity", "Onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity", "Onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity", "Ondestroy");
    }


    @Override
    public void onItemClick(RecyclerViewAdapter.ItemHolder item, int position) {

    }
}
