package com.example.listgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Game {
    public Game(String name, String genre, String desc) {
        this.name = name;
        this.genre = genre;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    String name;
    String genre;
    String desc;
}