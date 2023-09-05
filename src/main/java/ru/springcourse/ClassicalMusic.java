package ru.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {

    Random random = new Random();


    public List<String> classicalMusicList = new ArrayList<>();
    {
        classicalMusicList.add("Biba Serenade");
        classicalMusicList.add("Nocture Biba");
        classicalMusicList.add("Moon Biba");
    }

    @Override
    public String getSong() {
        int randomElement = random.nextInt(classicalMusicList.size());

        return  classicalMusicList.get(randomElement);
    }
}
