package com.example.cabom.appchatmanhinhchinh2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Tab2 extends Fragment{

    HistoryAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {



        ArrayList<HistoryModel> historyList = new ArrayList<>();
        historyList.add(new HistoryModel(R.drawable.face, "Nam", "new message", "reply"));
        historyList.add(new HistoryModel(R.drawable.face, "Viet", "new message", "reply"));
        historyList.add(new HistoryModel(R.drawable.face, "Tom", "new friend", "agree"));
        historyList.add(new HistoryModel(R.drawable.face, "Tun", "new friend", "agree"));

        RecyclerView recyclerView =;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HistoryAdapter(this, historyList);
        recyclerView.setAdapter(adapter);


        return inflater.inflate(R.layout.tab2, container, false);
    }
}


























