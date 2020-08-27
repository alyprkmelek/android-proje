package com.melekalyaprak.myapplication.recyclerview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.melekalyaprak.myapplication.PlatesMove;
import com.melekalyaprak.myapplication.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class PlatesPictureViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    ProgressBar progressBar;

    public PlatesPictureViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=itemView.findViewById(R.id.recyclerview_plates_pictures_list_imageview);
        progressBar=itemView.findViewById(R.id.recyclerview_plates_pictures_list_progressbar);
    }

    public void getMoves(Context context, PlatesMove platesMove){
        itemView.setTag(platesMove);
        Picasso.get().load(platesMove.getPlatesPictures()).fit().centerCrop().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.INVISIBLE);

            }

            @Override
            public void onError(Exception e) {

            }
        });


    }
}
