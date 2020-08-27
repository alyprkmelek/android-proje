package com.melekalyaprak.myapplication.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.melekalyaprak.myapplication.R;
import com.melekalyaprak.myapplication.SignUpActivity;
import com.squareup.picasso.Picasso;


public class Chat extends Fragment {
    Activity context;
    private Chat caht;

    public static Chat newInstance() {
        return new Chat();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_chat, container, false);

        context=getActivity();

        final ImageView image1=(ImageView)view.findViewById(R.id.imageView);

        String url_image1="https://www.helpscout.com/images/helpu/2020/feb/live-chat-best-practices.png";
        Picasso.get().load(url_image1).into(image1);

        image1.setOnClickListener(new View.OnClickListener()

        {

            @Override

            public void onClick(View v)

            {

                Intent a=new Intent(getActivity(),SignUpActivity.class);

                startActivity(a);

            } });

        return view;

    }
    }



















