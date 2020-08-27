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

import com.melekalyaprak.myapplication.PlatesMove;
import com.melekalyaprak.myapplication.PopupActivity1;
import com.melekalyaprak.myapplication.R;
import com.melekalyaprak.myapplication.recyclerview.PlatesPictureAdapter;

import java.util.ArrayList;

public class PlatesPictures extends Fragment implements PlatesPictureAdapter.MyListener {

    private PlatesPictureAdapter platesPictureAdapter;
    private RecyclerView recyclerView;
    private ArrayList<PlatesMove> platesMoves;

    public static PlatesPictures newInstance(){
        return new PlatesPictures();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_pilates_pictures,container,false);
        platesPictureAdapter=new PlatesPictureAdapter((AppCompatActivity) getActivity(),this);
        platesMoves=platesPictureAdapter.getPlatesMoves();
        recyclerView=rootView.findViewById(R.id.fragment_plates_pictures_recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        if (isAdded()){
            recyclerView.setAdapter(platesPictureAdapter);
        }

        getPlatesMoves(platesMoves);
        return rootView;
    }

    private ArrayList<PlatesMove> getPlatesMoves(ArrayList<PlatesMove> platesMoves){

        platesMoves.add(new PlatesMove("Roll-up",
                "https://cagdasyasamrehberi.com/wp-content/uploads/2017/05/roll-up-roll-down-300x300.jpg",
                "50 times a day",
                55));
        platesMoves.add(new PlatesMove("Hip Bridge",
                "https://www.verywellfit.com/thmb/5PHeB9hlE1BYHivoo6zcm8HPYsY=/2500x1667/filters:fill(FFDB5D,1)/Verywell-12-3567220-Bridge02-772copy-5c631946c9e77c0001d93219.jpg",
                "30 times a day",
                65));
        platesMoves.add(new PlatesMove("Leg Circles",
                "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/BBfbTiw/_h400_w284_m1_bwhite.jpg",
                "75 times a day",
                35));
        platesMoves.add(new PlatesMove("Helicopter",
                "https://s3.amazonaws.com/prod.skimble/assets/32381/skimble-workout-trainer-exercise-scissors-in-bridge-4_iphone.jpg",
                "30 times a day",
                45));
        platesMoves.add(new PlatesMove("Toe Taps",
                "https://cdn.shopify.com/s/files/1/0197/2970/files/Screenshot_2015-03-25_14.51.39_large.jpg?13305145451905174301",
                "50 times a day",
                25));
        platesMoves.add(new PlatesMove("V-sit ",
                "https://i.pinimg.com/originals/14/ca/6e/14ca6e57f32bb7285e8d308d833fffe0.jpg",
                "60 times a day",
                45));
        platesMoves.add(new PlatesMove("Ball Jog",
                "https://s3.eu-central-1.amazonaws.com/cdn.barcin.com/2020/03/evde-pilates-yapmanin-incelikleri-sportmen.jpg",
                "40 times a day",
                45));
        platesMoves.add(new PlatesMove("Knee Tuck",
                "https://media.istockphoto.com/photos/young-pretty-woman-exercising-with-fittness-ball-in-pilates-workout-picture-id695305216",
                "20 times a day",
                25));
        platesMoves.add(new PlatesMove("Side Squat",
                "https://www.verywellfit.com/thmb/JsvCdfc479SsEihLoscNgVa9wKk=/1885x1414/smart/filters:no_upscale()/GettyImages-922551728-5ab1289418ba010037b9b5de.jpg",
                "45 times a day",
                90));
        platesMoves.add(new PlatesMove("Overhead Ball Squat",
                "https://3i133rqau023qjc1k3txdvr1-wpengine.netdna-ssl.com/wp-content/uploads/2014/11/Stability-Ball-Squat_Exercise.jpg",
                "45 times a day",
                90));

        return platesMoves;
    }



    @Override
    public void MyListener(PlatesMove platesMove) {

        Intent intent= PopupActivity1.newIntent(getActivity(),platesMove);
        startActivity(intent);

    }
}
