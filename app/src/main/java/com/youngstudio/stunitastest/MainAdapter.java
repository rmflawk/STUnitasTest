package com.youngstudio.stunitastest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

    // 이 메소드가 실행된다면 재활용할 뷰가 없다는 뜻임.
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 이 메소드 안에서 리사이클러뷰가 보여줄 뷰를 만들어 내서 리턴함.(like. getView()와 비슷함)

        LayoutInflater inflater= LayoutInflater.from(context);

        View itemView= inflater.inflate(R.layout.lsitview_item,parent,false);

        // itemView를 보관하는 Viewholder객체 생성
        VH holder= new VH(itemView);

        return holder;
    }// onCreateViewHolder End

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        VH vh= (VH)holder;

        String s= datas.get(position);
        vh.tv.setText(s);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }


    // 이너 클래스
    class VH extends RecyclerView.ViewHolder{

        TextView tv;


        public VH(@NonNull View itemView) {
            super(itemView);

            tv=itemView.findViewById(R.id.tv);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 클릭된 아이템뷰가 리사이클러뷰에서 몇번째 인덱스 포지션인지 알아내기
                    int posiion= getAdapterPosition();
                }
            });

        }// VH() End
    }// VH class End





}//MaiuAdapter End
