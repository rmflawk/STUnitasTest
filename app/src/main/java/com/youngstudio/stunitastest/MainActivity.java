package com.youngstudio.stunitastest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    RecyclerView recyclerView;
    ArrayList<String> datas= new ArrayList<>();

    MainAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");

        recyclerView= findViewById(R.id.recyclerview);
        adapter= new MainAdapter(datas,this);
        recyclerView.setAdapter(adapter);




    }//onCrerate End


}//MainActivity End
