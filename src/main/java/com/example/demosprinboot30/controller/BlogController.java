package com.example.demosprinboot30.controller;

import com.example.demosprinboot30.entity.Blog;
import com.example.demosprinboot30.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")

public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping("/getAllPost")
    public List<Blog> getAllPost(){
            return blogRepository.findAll();
    }

    @PostMapping("savePost")
    public Blog savePost(@RequestBody Blog blog){
        return blogRepository.save(blog);
    }
}
