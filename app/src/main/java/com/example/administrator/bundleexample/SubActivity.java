package com.example.administrator.bundleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Vector;

public class SubActivity extends AppCompatActivity {

    private TextView subActivityTextView;
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        subActivityTextView = (TextView)findViewById(R.id.subActivityTextView);

        Bundle bundle = getIntent().getExtras();
        ArrayList<String> getDatas = new ArrayList<>();
        getDatas = bundle.getStringArrayList("bundleKey");

        String getStringData = bundle.getString("stringKey");
        Log.i("getDatas", String.valueOf(getDatas));
        Log.i("getStringData", getStringData);
//        String arrayListValue0 = getDatas.get(0);
//        subActivityTextView.setText(arrayListValue0);
    }
}
