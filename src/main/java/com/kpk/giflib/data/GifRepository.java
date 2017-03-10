package com.kpk.giflib.data;

import com.kpk.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by krasi on 3/8/2017.
 */
@Component
public class GifRepository {
    private List<Gif> gifList;

    public GifRepository() {
        gifList = new ArrayList<Gif>();
        gifList.add(new Gif("android-explosion", Calendar.getInstance().getTime(), "kkaramazov", true, 0));
        gifList.add(new Gif("ben-and-mike", Calendar.getInstance().getTime(), "kkaramazov", true, 0));
        gifList.add(new Gif("book-dominos", Calendar.getInstance().getTime(), "kkaramazov", true, 1));
        gifList.add(new Gif("compiler-bot", Calendar.getInstance().getTime(), "kkaramazov", true, 2));
        gifList.add(new Gif("cowboy-coder", Calendar.getInstance().getTime(), "kkaramazov", true, 1));
        gifList.add(new Gif("infinite-andrew", Calendar.getInstance().getTime(), "kkaramazov", true, 0));
    }

    public Gif getGifByName(String name) {
        for(Gif gif : gifList) {
            if(gif.getName().equalsIgnoreCase(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifsByCategoryId(int categoryId) {
        List<Gif> result = new LinkedList<Gif>();
        for(Gif gif : gifList) {
            if(gif.getCategoryId() == categoryId) {
                result.add(gif);
            }
        }
        return result;
    }

    public List<Gif> getAllGifs() {
        return gifList;
    }
}
