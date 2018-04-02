package com.example.listviewjavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    EditText etlst;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //listView=(listView)findViewById(R.i.listview);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        etlst=(EditText)findViewById(R.id.etlst);
            List<String> ds=new ArrayList<>();
            ds.add("Android");
            ds.add("Java");
            ds.add("CPP");

                ArrayAdapter < String > adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ds);
        ((ListView)findViewById(R.id.listView)).setAdapter((ListAdapter) adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ds.add(etlst.getText().toString());
                ((ListView)findViewById(R.id.listView)).setAdapter((ListAdapter) adapter);
            }
        });

    }
}
