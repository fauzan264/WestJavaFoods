package com.fauzan264.westjavafoods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.fauzan264.westjavafoods.adapter.ListFoodAdapter;
import com.fauzan264.westjavafoods.model.Food;
import com.fauzan264.westjavafoods.model.FoodsData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Food> list = new ArrayList<>();
    private String title = "West Java Foods";

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        list.addAll(FoodsData.getListData());
        showFoodsList();

    }

    private void showSelectedFood(Food food) {
        Intent detail = new Intent(MainActivity.this, DetailActivity.class);
        detail.putExtra(DetailActivity.EXTRA_IMG, food.getPhoto());
        detail.putExtra(DetailActivity.EXTRA_NAME, food.getName());
        detail.putExtra(DetailActivity.EXTRA_CITY, food.getCity());
        detail.putExtra(DetailActivity.EXTRA_DETAIL, food.getDetail());
        startActivity(detail);
    }

    private void showFoodsList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFoods.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback(){
           @Override
           public void onItemClicked(Food data) {
               showSelectedFood(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            Intent about = new Intent(MainActivity.this, AboutMeActivity.class);
            about.putExtra(AboutMeActivity.EXTRA_IMG, R.drawable.saya);
            about.putExtra(AboutMeActivity.EXTRA_NAME, "Ahmad Fauzan");
            about.putExtra(AboutMeActivity.EXTRA_EMAIL, "fauzan.c4@gmail.com");
            startActivity(about);
        }
        return true;
    }
}
