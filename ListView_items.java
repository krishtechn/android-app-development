package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ListView_items extends AppCompatActivity {
 ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_items);
        listView = findViewById(R.id.listview);
        String [] city = {"Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content.","Sets the drawable that will be drawn above all other list content."};


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListView_items.this, android.R.layout.simple_dropdown_item_1line,city);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListView_items.this, ""+city[i], Toast.LENGTH_SHORT).show();
                new AlertDialog.Builder(ListView_items.this).
                        setIcon(R.drawable.ic_launcher_background).
                        setTitle("Error").
                        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        }).
                        setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                         }
                         );
            }
        });


    }
}