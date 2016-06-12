package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Federico on 12/06/2016.
 */
@Controller
public class SearchController {

    @RequestMapping("/no-results")
    String noResults(){
        return "no-results";
    }

    @RequestMapping("/search-results")
    String searchResults(){
        return "search-results";
    }
}