package com.example.administrator.bundleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView mainActivityTextView;

    private ArrayList<String> datas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datas = new ArrayList<>();
        datas.add("오늘날씨");
        datas.add("좋음");
        mainActivityTextView = (TextView)findViewById(R.id.mainActivityTextView);
        mainActivityTextView.setOnClickListener(this::mainActivityTextviewClick);
    }

    private void mainActivityTextviewClick(View view) {
        Intent intent = new Intent(this, SubActivity.class);
        Bundle bundle = new Bundle();

        bundle.putStringArrayList("bundleKey", datas);
        bundle.putString("stringKey","나쁨");
        intent.putExtras(bundle);

        startActivity(intent);
    }

}
