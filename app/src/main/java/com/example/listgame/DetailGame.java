package com.example.listgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailGame extends AppCompatActivity {

    TextView txtName,txtGenre,txtDesc;
    String name, genre, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game);

        txtName = findViewById(R.id.txt_name);
        txtGenre = findViewById(R.id.txt_genre);
        txtDesc = findViewById(R.id.txt_description);

        Intent intent = getIntent();

        name = intent.getStringExtra("name");
        genre = intent.getStringExtra("genre");
        description = intent.getStringExtra("desc");

        txtName.setText(name);
        txtGenre.setText(genre);
        txtDesc.setText(description);
    }
}