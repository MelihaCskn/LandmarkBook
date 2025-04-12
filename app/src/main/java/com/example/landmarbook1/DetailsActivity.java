package com.example.landmarbook1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.landmarbook1.databinding.ActivityDetailsBinding;
import com.example.landmarbook1.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {
    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent=getIntent();

     //  LandmarkBook selectedLandmarkBook=intent.getSerializableExtra("Landmark");
//casting=bişeyi bişeye dönüştürmek
        LandmarkBook selectedLandmarkBook=(LandmarkBook) intent.getSerializableExtra("Landmark");
        binding.nameText.setText(selectedLandmarkBook.name);
        binding.countryText.setText(selectedLandmarkBook.country);
        binding.imageView.setImageResource(selectedLandmarkBook.image);
    }
}