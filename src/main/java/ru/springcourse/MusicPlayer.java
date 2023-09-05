package ru.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;


public class MusicPlayer {

    List<Music> musicGenre = new ArrayList<>();

    private MusicEnum musicEnum;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

        public MusicPlayer(List<Music> musicGenre) {
        this.musicGenre = musicGenre;
    }



        public String playMusic() {
        Random random = new Random();
        return  musicGenre.get(random.nextInt(musicGenre.size())).getSong();
        }
    }

