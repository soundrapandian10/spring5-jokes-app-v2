package com.springframework.spring5_jokes_app_v2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springframework.spring5_jokes_app_v2.services.JokeService;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({ "/", "" })
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }

}
