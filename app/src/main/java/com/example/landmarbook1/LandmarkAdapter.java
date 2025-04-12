package com.example.landmarbook1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.landmarbook1.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> {
    public LandmarkAdapter(ArrayList<LandmarkBook> landmarkBookArrayList) {
        this.landmarkBookArrayList = landmarkBookArrayList;
    }

    ArrayList<LandmarkBook> landmarkBookArrayList;
    @NonNull
    //OncReatViewHolder sınıfı ViewHolder da bir nesne oluşturulduğunda çağrılacak metot,xml burda bağlanır
    @Override
    public LandmarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandmarkHolder(recyclerRowBinding);
    }

    // OnBindViewHolder Layout içerisinde hangi verileri göstermek istiyorsak burada göstereceğiz
    @Override
    public void onBindViewHolder(@NonNull LandmarkHolder holder, int position) {
holder.binding.recyeclerViewTextView.setText(landmarkBookArrayList.get(position).name);
holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(holder.itemView.getContext(),DetailsActivity.class);
        intent.putExtra("Landmark",landmarkBookArrayList.get(position));
        holder.itemView.getContext().startActivity(intent);
    }
});
    }

    @Override
    public int getItemCount() {
        return landmarkBookArrayList.size();
    }

    // görünümlerimizi tutan yardımcı bir sınıf
    public class LandmarkHolder extends RecyclerView.ViewHolder{
private RecyclerRowBinding binding;
        public LandmarkHolder(RecyclerRowBinding binding) {

            super(binding.getRoot());
            this.binding=binding;
        }
    }


}
