package com.feymour.knitrowcounter.gui;

import com.feymour.knitcounter.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_list, menu);
        return true;
    }
    
}
