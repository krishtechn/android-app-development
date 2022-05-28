package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.viewbinding.ViewBinding;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstapp.Adapters.BookAdapters;
import com.example.firstapp.Models.BookModals;
import com.example.firstapp.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
// TextView text;
// Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

//        binding.button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "button click", Toast.LENGTH_SHORT).show();
//            }
//        });

//        getSupportActionBar().hide();

//        text = findViewById(R.id.textView4);
//        btn = findViewById(R.id.button8);

//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                text.setText("hello world");
//                showalert();
//                Toast.makeText(MainActivity.this, "button was click", Toast.LENGTH_SHORT).show();
//                Snackbar mySnackbar = Snackbar.make(text, "hello world", Snackbar.LENGTH_SHORT);
//                mySnackbar.setAction("undo", new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                       mySnackbar.dismiss();
//                    }
//                });
//                mySnackbar.show();

//                Intent intent = new Intent(MainActivity.this,ShareIntent.class);
//                intent.putExtra("text","hello world");
//                startActivity(intent);
//            }
//        });

        ArrayList<BookModals> list = new ArrayList<>();
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));

        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));


        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));

        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));

        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));

        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food1,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food2,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food3,"this is Nepali Book"));
        list.add(new BookModals(R.drawable.food4,"this is Nepali Book"));


        BookAdapters adapters = new BookAdapters(list,this);
        binding.recyclerView.setAdapter(adapters);

//        Linear layout
//           LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//           binding.recyclerView.setLayoutManager(linearLayoutManager);

//          LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//          binding.recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
//        binding.recyclerView.setLayoutManager(gridLayoutManager);

//          StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.HORIZONTAL);
//          binding.recyclerView.setLayoutManager(staggeredGridLayoutManager);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        binding.recyclerView.setLayoutManager(staggeredGridLayoutManager);

    }
}