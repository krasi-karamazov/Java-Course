package com.kpk.giflib.data;

import com.kpk.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by krasi on 3/8/2017.
 */
@Component
public class GifRepository {
    private List<Gif> gifList;

    public GifRepository() {
        gifList = new ArrayList<Gif>();
        gifList.add(new Gif("android-explosion", Calendar.getInstance().getTime(), "kkaramazov", true));
        gifList.add(new Gif("ben-and-mike", Calendar.getInstance().getTime(), "kkaramazov", true));
        gifList.add(new Gif("book-dominos", Calendar.getInstance().getTime(), "kkaramazov", true));
        gifList.add(new Gif("compiler-bot", Calendar.getInstance().getTime(), "kkaramazov", true));
        gifList.add(new Gif("cowboy-coder", Calendar.getInstance().getTime(), "kkaramazov", true));
        gifList.add(new Gif("infinite-andrew", Calendar.getInstance().getTime(), "kkaramazov", true));
    }

    public Gif getGifByName(String name) {
        for(Gif gif : gifList) {
            if(gif.getName().equalsIgnoreCase(name)) {
                return gif;
            }
        }
        return null;
    }
}
