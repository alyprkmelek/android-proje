package com.melekalyaprak.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.melekalyaprak.myapplication.fragment.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    //EditText emailText,passwordText;

   // private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.main_activity_view_pager);
        tabLayout=findViewById(R.id.main_activity_tab_layout);

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




       // emailText=(EditText) findViewById(R.id.user_email_edit_text);
       // passwordText=(EditText) findViewById(R.id.user_password_edit_text);

       // mAuth=FirebaseAuth.getInstance();
    }

   // public void signIn(View view){

   // }

   // public void signUp(View view){
      //  mAuth.createUserWithEmailAndPassword(emailText.getText().toString(),passwordText.getText().toString())
              //  .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                  //  @Override
                  //  public void onComplete(@NonNull Task<AuthResult> task) {
                    //    if(task.isSuccessful()){
                        //    FirebaseUser user=mAuth.getCurrentUser();
                         //   String useremail=user.getEmail().toString();
                          //  System.out.println("user e-mail:"+useremail);
                       // } else {
                        //    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_LONG).show();
                       // }
                   // }
               // });

   // }
}
