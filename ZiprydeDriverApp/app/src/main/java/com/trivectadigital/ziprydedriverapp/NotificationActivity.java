package com.trivectadigital.ziprydedriverapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.trivectadigital.ziprydedriverapp.assist.CommissionAdapter;
import com.trivectadigital.ziprydedriverapp.assist.CommissionDetails;

import java.util.LinkedList;

public class NotificationActivity extends AppCompatActivity {

    LinkedList<CommissionDetails> commissionDetailsList;
    ListView commissionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LayoutInflater mInflater = LayoutInflater.from(this);
        View mCustomView = mInflater.inflate(R.layout.actionbar_titleback, null);
        toolbar.setContentInsetsAbsolute(0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        toolbar.addView(mCustomView, layoutParams);
        TextView titleText = (TextView) mCustomView.findViewById(R.id.titleText);
        titleText.setText("Notifications");
        ImageView backImg = (ImageView) mCustomView.findViewById(R.id.backImg);
        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        commissionDetailsList = new LinkedList<CommissionDetails>();
        commissionDetailsList.add(new CommissionDetails("101", "We have received your commission payment! Happy ride", "Today 22:03"));
        commissionDetailsList.add(new CommissionDetails("102", "Please pay you commission on or before June 2017", "Today 20:28"));

        commissionList = (ListView) findViewById(R.id.commissionList);

        CommissionAdapter commissionAdapter = new CommissionAdapter(commissionDetailsList, this);
        commissionList.setAdapter(commissionAdapter);
    }
}
