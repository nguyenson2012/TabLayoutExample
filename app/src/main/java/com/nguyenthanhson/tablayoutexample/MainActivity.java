package com.nguyenthanhson.tablayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout tab1;
    LinearLayout tab2;
    LinearLayout tabListening;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab1 = (LinearLayout) findViewById(R.id.tab1);
        tab2 = (LinearLayout) findViewById(R.id.tab2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        loadTabs();


//        tabListening=(LinearLayout)findViewById(R.id.Listening);

    }

    private void loadTabs() {
        final TabHost tab = (TabHost) findViewById
                (android.R.id.tabhost);

        tab.setup();
        TabHost.TabSpec spec;

        spec = tab.newTabSpec("t1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab 1");
        tab.addTab(spec);

        spec = tab.newTabSpec("t2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab2");
        tab.addTab(spec);

        spec = tab.newTabSpec("hello");
        spec.setContent(R.id.Listening);
        spec.setIndicator("Listening");
        tab.addTab(spec);
        tab.setCurrentTab(0);
    }

}
