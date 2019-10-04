package com.example.dni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        ImageView iv = (ImageView)findViewById(R.id.imagen);
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.animacion);
        iv.startAnimation(animacion);
    }
}
