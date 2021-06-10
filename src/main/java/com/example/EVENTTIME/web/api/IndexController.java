package com.example.EVENTTIME.web.api;

import com.example.EVENTTIME.config.Endpoints;
import com.example.EVENTTIME.config.ViewNames;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {

    @GetMapping(value = {Endpoints.HOME})
    public ModelAndView getCurrentUser(@AuthenticationPrincipal OidcUser user){
        Map<String, Object> viewModel = new HashMap<>();
        if (user != null) {
            viewModel.put("name", user.getGivenName() + " " + user.getFamilyName());
        }
        return new ModelAndView(ViewNames.HOME, viewModel);
    }
}
