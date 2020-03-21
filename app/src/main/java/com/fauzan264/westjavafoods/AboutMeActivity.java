package com.fauzan264.westjavafoods;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMeActivity extends AppCompatActivity {
    public static final String EXTRA_IMG = "image";
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_EMAIL = "email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_me);

        ImageView rvImage = findViewById(R.id.img_data_received);
        TextView tvName = findViewById(R.id.tv_name_received);
        TextView tvEmail = findViewById(R.id.tv_email_received);

        int image = getIntent().getIntExtra(EXTRA_IMG, R.drawable.aboutme);
        rvImage.setImageResource(image);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        tvName.setText(name);

        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        tvEmail.setText(email);
    }
}
