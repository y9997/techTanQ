package com.tech_tanQ.techTanQ.controller;

import com.tech_tanQ.techTanQ.entity.Article;
import com.tech_tanQ.techTanQ.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SearchController {

    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/search")
    public String search(@RequestParam("q") String query, Model model) {
        List<Article> results = articleRepository.findByTitleContaining(query);
        model.addAttribute("query", query);
        model.addAttribute("results", results);
        return "search_results";
    }
}
