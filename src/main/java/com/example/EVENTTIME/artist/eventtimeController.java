package com.example.EVENTTIME.artist;

import com.example.EVENTTIME.config.Endpoints;
import com.example.EVENTTIME.config.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class eventtimeController {

    @GetMapping(path = Endpoints.HOME)
    public ModelAndView showHomePage(){
        return new ModelAndView(ViewNames.HOME);
    }
    @GetMapping(path = Endpoints.ARTISTS)
    public ModelAndView showArtistsPage(){
        return new ModelAndView(ViewNames.ARTISTS);
    }
    @GetMapping(path = Endpoints.GENRES)
    public ModelAndView showGenresPage(){
        return new ModelAndView(ViewNames.GENRES);
    }
    @GetMapping(path = Endpoints.FAQ)
    public ModelAndView showFaqPage(){
        return new ModelAndView(ViewNames.FAQ);
    }

}


