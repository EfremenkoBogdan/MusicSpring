package ru.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RockMusic implements Music {
    Random random = new Random();

   public List<String> rockMusicList = new ArrayList<>();

   {
       rockMusicList.add("We will Rock Biba");
       rockMusicList.add("Biba Numb");
       rockMusicList.add("Boulevard of Broken Biba");
    }

    @Override
    public String getSong() {
        int randomElement = random.nextInt(rockMusicList.size());

        return  rockMusicList.get(randomElement);
    }
}
