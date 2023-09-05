package ru.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music
{
    Random random = new Random();


    public List<String> JazzMusicList = new ArrayList<>();
    {
        JazzMusicList.add("Biba Jazz");
        JazzMusicList.add("Raining Biba");
        JazzMusicList.add("Space Jazz Biba");
    }

    @Override
    public String getSong() {
        int randomElement = random.nextInt(JazzMusicList.size());

        return  JazzMusicList.get(randomElement);
    }
}
