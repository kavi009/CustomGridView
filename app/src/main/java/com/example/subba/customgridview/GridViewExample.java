package com.example.subba.customgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.subba.gridview.adapter.CustomGridAdapter;

public class GridViewExample extends AppCompatActivity {

    GridView gridView;
    Adapter GridAdapter;

    // This Data show in grid ( Used by adapter )

    static final String[ ] GRID_DATA = new String[] {"GingerBread","HoneyComb","IcecreamSandwich","JellyBean","KitKat","Lollipop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_example);

        // Get gridview object from xml file

        gridView = (GridView) findViewById(R.id.gridView1);

        // Set custom adapter (GridAdapter) to gridview

        gridView.setAdapter(  new CustomGridAdapter(this, GRID_DATA ) );

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {


                Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById( R.id.grid_item_label ))
                                .getText(), Toast.LENGTH_SHORT).show();

            }
        });

    }

}