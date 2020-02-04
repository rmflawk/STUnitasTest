package com.youngstudio.stunitastest;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter {

    ArrayList<String> datas;
    Context context;

    public MainAdapter(ArrayList<String> datas, Context context){
        this.datas= datas;
        this.context= context;
    }

    //이 메소드가 실행된다면 재활용할 뷰가 없다는 뜻임.
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
