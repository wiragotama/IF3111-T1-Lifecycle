package com.vogella.android.life.cycle.activity;

/**
 * Created by wira gotama on 2/5/2015.
 */
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class SecondActivity extends TracerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String[] values = getResources().getStringArray(R.array.operating_systems);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        spinner.setAdapter(adapter);
    }
}
