package com.example.landmarbook1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.landmarbook1.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<LandmarkBook> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // Listeyi başlat
        landmarkArrayList = new ArrayList<>();

        // Veri ekle
        LandmarkBook pisa = new LandmarkBook("Pisa", "Italy", R.drawable.pisa);
        LandmarkBook eiffel = new LandmarkBook("Eiffel", "France", R.drawable.eyfel);
        LandmarkBook colosseum = new LandmarkBook("Colosseum", "Italy", R.drawable.colosseum);
        LandmarkBook londonBridge = new LandmarkBook("London Bridge", "London", R.drawable.londonbridge);

        landmarkArrayList.add(pisa);
        landmarkArrayList.add(eiffel);
        landmarkArrayList.add(colosseum);
        landmarkArrayList.add(londonBridge);



        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdapter landmarkAdapter=new LandmarkAdapter(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdapter);

        /*
        //LİSTVİEW
        // Adapter: Burdaki veri kaynağı ile xml ve listview(layoutu) ı birbirine bağlayan yapı
        // Mapping:bir şeyi bir şeye dönüştürmekte kullanılır.Bir yapıdan diğer yapıya
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmarkBook -> landmarkBook.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             //  Toast.makeText(MainActivity.this,landmarkArrayList.get(position).name,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("Landmark",landmarkArrayList.get(position));
                startActivity(intent);
            }
        });

*/
    }
}
