package com.melekalyaprak.myapplication.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.melekalyaprak.myapplication.FitnessMove;
import com.melekalyaprak.myapplication.PopupActivity;
import com.melekalyaprak.myapplication.R;
import com.melekalyaprak.myapplication.recyclerview.FitnessPictureAdapter;

import java.util.ArrayList;

public class FitnessPictures extends Fragment implements FitnessPictureAdapter.MyListener{
    private FitnessPictureAdapter fitnessPictureAdapter;
    private RecyclerView recyclerView;
    private ArrayList<FitnessMove> fitnessMoves;
    public static FitnessPictures newInstance(){

        return new FitnessPictures();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_fitness_pictures,container,false);
        fitnessPictureAdapter=new FitnessPictureAdapter((AppCompatActivity) getActivity(),this);
        fitnessMoves=fitnessPictureAdapter.getFitnessMoves();
        recyclerView=rootView.findViewById(R.id.fragment_fitness_pictures_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        if(isAdded()){
            recyclerView.setAdapter(fitnessPictureAdapter);
        }
        getFitnessMoves(fitnessMoves);

        return rootView;
    }

    private ArrayList<FitnessMove> getFitnessMoves(ArrayList<FitnessMove> fitnessMoves){
            fitnessMoves.add(new FitnessMove("Fitness Move : Squat ",
                    "https://i.paradurumu.com/files/2017/3/23/2701/2701_0.jpg",
                    "50 times a day",
                    50));
            fitnessMoves.add(new FitnessMove("Fitness Move : Lunges ",
                    "https://julielohre.com/wp-content/uploads/2018/07/AlternatingLunges-1-1024x760.jpg",
                    "50 times a day",
                    30));
            fitnessMoves.add(new FitnessMove("Fitness Move : Push-up ",
                    "https://sporbilimlerihaber.com/wp-content/uploads/2018/11/pilates-hareketleri.jpg",
                    "50 times a day",
                    40));
            fitnessMoves.add(new FitnessMove("Fitness Move : Pull-up ",
                    "https://www.kasvekuvvet.net/img/barfiks-nasil-cekilir.jpg",
                    "30 times a day",
                    25));
            fitnessMoves.add(new FitnessMove("Fitness Move : Inverted row ",
                    "https://healthydatabase.com/wp-content/uploads/2020/02/Inverted-row-workout.jpg",
                    "50 times a day",
                    60));
            fitnessMoves.add(new FitnessMove("Fitness Move : Hip bridge ",
                    "https://www.fitside.com.tr/wp-content/uploads/2018/07/glutebridge.jpg",
                    "50 times a day",
                    60));
            fitnessMoves.add(new FitnessMove("Fitness Move : Mountain climber ",
                    "https://eunicakes.files.wordpress.com/2014/02/mountain-climbers.jpg?w=604",
                    "50 times a day",
                    60));
            fitnessMoves.add(new FitnessMove("Fitness Move : Plunk ",
                    "https://www.sportsandmerits.com/upload/icerik/images/plank(3).jpg",
                    "50 times a day",
                    60));
            fitnessMoves.add(new FitnessMove("Fitness Move : Burpees ",
                    "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/workouts/2016/05/full-body-burn-20-minutes-no-equipment-composites-burpees-1462316291.jpg?resize=480:*",
                    "50 times a day",
                    60));

            return  fitnessMoves;
    }

    @Override
    public void MyListener(FitnessMove fitnessMove) {
        System.out.println("Fitness Move:"+fitnessMove.getFitnessName());
        Intent intent= PopupActivity.newIntent(getActivity(),fitnessMove);
        startActivity(intent);

    }
}
