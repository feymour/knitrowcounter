package com.feymour.knitrowcounter.gui;

import com.feymour.knitrowcounter.R;
import com.feymour.knitrowcounter.data.MainListAdapter;
import com.feymour.knitrowcounter.data.Project;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainList extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main_list);
        ListView mainListView = (ListView) this.findViewById(R.id.mainListView);
        
        //TODO: Fill with data from memory
        String values[] = new String[] {
        	"Gloves",
        	"Scarf", 
        	"Poncho"	
        };
        Integer imageIds[] = new Integer[] {
        		Project.Type.gloves.getImageId(),
        		Project.Type.scarf.getImageId(),
        		Project.Type.poncho.getImageId()
        };
        
        MainListAdapter adapter = new MainListAdapter(this, values, imageIds);
        mainListView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        this.getMenuInflater().inflate(R.menu.main_list, menu);
        return true;
    }
    
}
