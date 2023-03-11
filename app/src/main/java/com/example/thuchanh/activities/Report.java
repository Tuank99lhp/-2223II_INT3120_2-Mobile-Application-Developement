package com.example.thuchanh.activities;

import android.os.Bundle;
import android.widget.ListView;

import com.example.thuchanh.R;
import com.example.thuchanh.models.DonationAdapter;

public class Report extends Base {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        listView = (ListView) findViewById(R.id.reportList);
        DonationAdapter adapter = new DonationAdapter(this, donations);
        listView.setAdapter(adapter);
    }
}