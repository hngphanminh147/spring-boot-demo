package com.controller;

import com.model.Attr;
import com.service.Serv;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Ctrller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(
            @RequestParam(name = "name", required = false) String name,
            Model model
    ) {

        model.addAttribute("name", name);
        return "about";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(Model model){
//        List<Attr> list = (new Serv()).getRepo().getProfileList();
//        model.addAttribute("profileList", list);
        List<Attr> list = new ArrayList<>();
        list.add(new Attr("name1", "addr1", "1"));
        list.add(new Attr("name2", "addr2", "2"));
        list.add(new Attr("name3", "addr3", "3"));
        model.addAttribute("list", list);
        return "profile";
    }
}
