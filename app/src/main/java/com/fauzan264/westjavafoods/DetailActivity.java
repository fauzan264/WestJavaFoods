package com.fauzan264.westjavafoods;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_IMG = "image";
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_CITY = "city";
    public static final String EXTRA_DETAIL = "detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgItem = findViewById(R.id.img_item_received);
        TextView tvItemName = findViewById(R.id.tv_item_name_received);
        TextView tvItemCity = findViewById(R.id.tv_item_city_received);
        JustifiedTextView tvItemDetail = findViewById(R.id.tv_item_detail_received);

        int image = getIntent().getIntExtra(EXTRA_IMG, R.mipmap.food_logo);
        imgItem.setImageResource(image);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        tvItemName.setText(name);

        String city = getIntent().getStringExtra(EXTRA_CITY);
        tvItemCity.setText(city);

        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        tvItemDetail.setText(detail);
    }
}
