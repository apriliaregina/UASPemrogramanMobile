package com.kelompok1.foodist.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kelompok1.foodist.DetailTerdekat;
import com.kelompok1.foodist.R;
import com.kelompok1.foodist.model.Terdekat;

import java.util.List;


public class TerdekatFoodAdapter extends RecyclerView.Adapter<TerdekatFoodAdapter.AsiaFoodViewHolder> {

    Context context;
    List<Terdekat> terdekatList;



    public TerdekatFoodAdapter(Context context, List<Terdekat> terdekatList) {
        this.context = context;
        this.terdekatList = terdekatList;
    }

    @NonNull
    @Override
    public AsiaFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.terdekat_food_row_item, parent, false);
        return new AsiaFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder( AsiaFoodViewHolder holder, int position) {

        holder.foodImage.setImageResource(terdekatList.get(position).getImageUrl());
        holder.name.setText(terdekatList.get(position).getName());
        holder.price.setText(terdekatList.get(position).getPrice());
        holder.rating.setText(terdekatList.get(position).getRating());
        holder.restorantName.setText(terdekatList.get(position).getRestorantname());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailTerdekat.class);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return terdekatList.size();
    }


    public static final class AsiaFoodViewHolder extends RecyclerView.ViewHolder{


        ImageView foodImage;
        TextView price, name, rating, restorantName;

        public AsiaFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            price = itemView.findViewById(R.id.price);
            name = itemView.findViewById(R.id.name);
            rating = itemView.findViewById(R.id.rating);
            restorantName = itemView.findViewById(R.id.restorant_name);



        }
    }

}
