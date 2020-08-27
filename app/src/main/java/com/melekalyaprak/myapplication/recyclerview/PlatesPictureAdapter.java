package com.melekalyaprak.myapplication.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.melekalyaprak.myapplication.PlatesMove;
import com.melekalyaprak.myapplication.R;

import java.util.ArrayList;

public class PlatesPictureAdapter extends RecyclerView.Adapter<PlatesPictureViewHolder> implements View.OnClickListener {

    private ArrayList<PlatesMove> platesMoves;
    private LayoutInflater layoutInflater;
    private AppCompatActivity appCompatActivity;
    private MyListener myListener;

    public PlatesPictureAdapter(AppCompatActivity appCompatActivity, MyListener myListener) {
        this.appCompatActivity = appCompatActivity;
        this.myListener = myListener;
        layoutInflater=appCompatActivity.getLayoutInflater();
        platesMoves=new ArrayList<>();
    }

    public ArrayList<PlatesMove> getPlatesMoves() {
        return platesMoves;
    }

    @NonNull
    @Override
    public PlatesPictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listview =layoutInflater.inflate(R.layout.recyclerview_plates_pictures_list,parent,false);
        listview.setOnClickListener(this);
        return new PlatesPictureViewHolder(listview);
    }

    @Override
    public void onBindViewHolder(@NonNull PlatesPictureViewHolder holder, int position) {
        holder.getMoves(appCompatActivity,platesMoves.get(position));

    }

    @Override
    public int getItemCount() {
        return platesMoves.size();
    }

    @Override
    public void onClick(View view) {
        if(view.getTag() instanceof PlatesMove){
            PlatesMove platesMove=(PlatesMove) view.getTag();
            myListener.MyListener(platesMove);
        }
    }

    public interface MyListener{
        public void MyListener(PlatesMove platesMove);

    }
}
