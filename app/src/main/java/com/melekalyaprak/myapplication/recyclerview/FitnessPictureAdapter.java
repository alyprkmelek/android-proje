package com.melekalyaprak.myapplication.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.melekalyaprak.myapplication.FitnessMove;
import com.melekalyaprak.myapplication.R;

import java.util.ArrayList;

public class FitnessPictureAdapter extends RecyclerView.Adapter<FitnessPictureViewHolder> implements View.OnClickListener {
    private ArrayList<FitnessMove> fitnessMoves;
    private LayoutInflater layoutInflater;
    private AppCompatActivity appCompatActivity;
    private MyListener myListener;

    public FitnessPictureAdapter(AppCompatActivity appCompatActivity, MyListener myListener) {
        this.appCompatActivity = appCompatActivity;
        this.myListener = myListener;
        layoutInflater=appCompatActivity.getLayoutInflater();
        fitnessMoves=new ArrayList<>();
    }

    public ArrayList<FitnessMove> getFitnessMoves() {
        return fitnessMoves;
    }

    @NonNull
    @Override
    public FitnessPictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listView=layoutInflater.inflate(R.layout.recyclerview_fitness_pictures_list,parent,false);
        listView.setOnClickListener(this);
        return new FitnessPictureViewHolder(listView);
    }

    @Override
    public void onBindViewHolder(@NonNull FitnessPictureViewHolder holder, int position) {
        holder.getMoves(appCompatActivity,fitnessMoves.get(position));

    }

    @Override
    public int getItemCount() {
        return fitnessMoves.size();
    }

    @Override
    public void onClick(View view) {
        if(view.getTag() instanceof FitnessMove){
            FitnessMove fitnessMove= (FitnessMove) view.getTag();
            myListener.MyListener(fitnessMove);

        }


    }

    public interface MyListener{
       public void MyListener(FitnessMove fitnessMove);

    }
}
