package com.melekalyaprak.myapplication.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.melekalyaprak.myapplication.PlatesMove;
import com.melekalyaprak.myapplication.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PopupFragment1 extends Fragment {

    TextView nameText;
    TextView descriptionText;
    TextView calorieText;
    ImageView imageView;
    ProgressBar progressBar;
    private PlatesMove platesMove;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_popup_1,container,false);
        nameText=rootView.findViewById(R.id.fragment_popup_name_textview_1);
        descriptionText=rootView.findViewById(R.id.fragment_popup_description_textview_1);
        calorieText=rootView.findViewById(R.id.fragment_popup_calorie_textview_1);
        imageView=rootView.findViewById(R.id.fragment_popup_imagevieww);
        progressBar=rootView.findViewById(R.id.fragment_popup_progressbarr);
        nameText.setText(platesMove.getPlatesName());
        descriptionText.setText(platesMove.getPlatesDescription());
        calorieText.setText(""+platesMove.getPlatesCalorie());
        Picasso.get().load(platesMove.getPlatesPictures()).fit().centerCrop().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.INVISIBLE);
            }
            @Override
            public void onError(Exception e) {
            }
        });
        return rootView;
    }

    public static PopupFragment1 newInstance(){
        return new PopupFragment1();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        platesMove=getActivity().getIntent().getParcelableExtra("INFO");
    }
}
