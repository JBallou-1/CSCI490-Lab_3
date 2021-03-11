package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ListView schedule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        schedule = (ListView) this.findViewById(R.id.class_schedule);
        String[] classes = {"csci 370","csci 392","csci 320","csci 180","csci 462"};
        ArrayAdapter myAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,classes);
        schedule.setAdapter(myAdapter);
        schedule.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String s = (String) adapterView.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_SHORT).show();
            }
        });
        schedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Long click",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}