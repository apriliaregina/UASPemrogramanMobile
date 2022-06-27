package com.kelompok1.foodist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kelompok1.foodist.adapter.TerdekatFoodAdapter;
import com.kelompok1.foodist.adapter.PopularFoodAdapter;
import com.kelompok1.foodist.model.Terdekat;
import com.kelompok1.foodist.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView popularRecycler, asiaRecycler;
    PopularFoodAdapter popularFoodAdapter;
    TerdekatFoodAdapter terdekatFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Ayam Geprek", "20k", R.drawable.pf1));
        popularFoodList.add(new PopularFood("Nasi Goreng", "25k", R.drawable.pf2));
        popularFoodList.add(new PopularFood("Seblak", "15k", R.drawable.pf3));
        popularFoodList.add(new PopularFood("Tteokbokki", "20k", R.drawable.pf4));
        popularFoodList.add(new PopularFood("Dimsum", "25k", R.drawable.tf2));
        popularFoodList.add(new PopularFood("Ayam Bakar", "15k", R.drawable.tf1));

        setPopularRecycler(popularFoodList);


        List<Terdekat> terdekatList = new ArrayList<>();
        terdekatList.add(new Terdekat("Nasi Goreng", "20k", R.drawable.tf3, "4.5", "Dapoer Re"));
        terdekatList.add(new Terdekat("Mie Ayam", "18k", R.drawable.tf4, "4.2", "Lacosta"));
        terdekatList.add(new Terdekat("Ketoprak", "20k", R.drawable.tf5, "4.5", "Yummy"));
        terdekatList.add(new Terdekat("Dimsum", "20k", R.drawable.tf6, "4.2", "Mercon Judes"));
        terdekatList.add(new Terdekat("Ayam Geprek", "20k", R.drawable.tf7, "4.5", "Mang Udin"));
        terdekatList.add(new Terdekat("Seblak", "18k", R.drawable.pf3, "4.2", "Wak Ima"));

        setTerdekatRecycler(terdekatList);

    }


    private void setPopularRecycler(List<PopularFood> popularFoodList) {

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);

    }

    private void setTerdekatRecycler(List<Terdekat> terdekatList) {

        asiaRecycler = findViewById(R.id.asia_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        asiaRecycler.setLayoutManager(layoutManager);
        terdekatFoodAdapter = new TerdekatFoodAdapter(this, terdekatList);
        asiaRecycler.setAdapter(terdekatFoodAdapter);

    }

}
