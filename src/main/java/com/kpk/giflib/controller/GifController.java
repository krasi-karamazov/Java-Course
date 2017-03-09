package com.kpk.giflib.controller;

import com.kpk.giflib.data.GifRepository;
import com.kpk.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Calendar;

/**
 * Created by krasi on 3/7/2017.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping(value = "/gif/{name}")
    public String getGitInfo(@PathVariable String name, ModelMap modelMap) {
        Gif gif = gifRepository.getGifByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
