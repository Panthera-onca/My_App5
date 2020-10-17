package com.example.myapplication.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickEditerPDF(View view) {
        Intent intent = new Intent(Intent.ACTION_EDIT);
        intent.setType("application:pdf");
        if(intent.resolveActivity(getPackageManager()) == null){
            Toast.makeText(this, "Aucune activite disponible", Toast.LENGTH_SHORT).show();
        }else{
            startActivity(intent);
        }

    }
}