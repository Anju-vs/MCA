package com.example.face_book_login14;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView facebookView=findViewById(R.id.fbView);
        ImageView likeImgView=findViewById(R.id.likeView);
        ImageView commentImgView=findViewById(R.id.cmmntView);
        ImageView shareImageView=findViewById(R.id.ShareView);

        likeImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the like button");
            }
        });
        commentImgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the comment button");
            }
        });
        shareImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast("You clicked the share button");
            }
        });

    }
    private void showToast(String message){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
