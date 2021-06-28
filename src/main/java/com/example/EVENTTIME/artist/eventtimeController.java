package com.example.EVENTTIME.artist;

import com.example.EVENTTIME.config.Endpoints;
import com.example.EVENTTIME.config.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class eventtimeController {

    @Autowired
    private ArtistService artistService;

    @GetMapping(path = Endpoints.ARTISTS)
    public ModelAndView showArtistsPage(){
        return new ModelAndView(ViewNames.ARTISTS);
    }
    @GetMapping(path = Endpoints.LOCATIONS)
    public ModelAndView showGenresPage(){
        return new ModelAndView(ViewNames.LOCATIONS);
    }
    //@GetMapping(path = Endpoints.FAVORITESLIST)
   // public ModelAndView showFavoriteslist(){return new ModelAndView(ViewNames.FAVORITESLIST);}


    @GetMapping(path = Endpoints.ADDFAVORITES)
    public String AddFavorite(Model model){
        model.addAttribute("artist", new Artist());
        return "addfavorites";
    }

    @PostMapping("/addfavorites2")
    public String addfavorites(@ModelAttribute Artist artist,
                               @AuthenticationPrincipal OidcUser user, Model model){
        artist.setOwner(user.getEmail());
        artistService.save(artist);
        model.addAttribute("artist",artist);
        return "gespeicherteKünstler";
    }

    @GetMapping("/getfavoriteslist")
    public String getAllFavorites(@AuthenticationPrincipal OidcUser user, Model model) {
        List<Artist> artists = artistService.findAllArtists(user.getEmail());
        model.addAttribute("artists", artists);
        return "favoriteslist";
    }
}


