package com.example.spring5webapp.controllers;

import com.example.spring5webapp.repository.AuthorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepo authorRepo;

    public AuthorController(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model){

        model.addAttribute("authors", authorRepo.findAll());

        return "authors";
    }
}
