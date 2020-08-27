package com.melekalyaprak.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.melekalyaprak.myapplication.fragment.PopupFragment1;

public class PopupActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity_1);

        FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment fragment=fragmentManager.findFragmentById(R.id.popup_activity1_framelayout);

        if(fragment==null){
            fragment= PopupFragment1.newInstance();
            fragmentManager.beginTransaction().add(R.id.popup_activity1_framelayout,fragment).commit();
        }
    }

    public static Intent newIntent(Context context,PlatesMove platesMove){
        Intent intent=new Intent(context,PopupActivity1.class);
        intent.putExtra("INFO",platesMove);
        return intent;
    }
}
