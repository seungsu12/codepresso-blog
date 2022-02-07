package com.codepresso.blog.controller;

import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public ArrayList<Post> select_post() {
         return postService.select_post();
    }

    @GetMapping("/post")
    public Post select_one(@RequestParam Long id) {
        return postService.select_one(id);
    }

    @PostMapping("/post")
    public Result insert_post(@RequestBody Post post) {
         postService.insert_post(post);
         return new Result(200,"Success");
    }
    @PutMapping("/post")
    public Result update_post(@RequestBody Post post){
        postService.update_post(post);
        return new Result(200,"Success");

    }

    @DeleteMapping("/post")
    public Result delete_post(@RequestParam Long id) {
        postService.delete_post(id);
        return new Result(200,"Success");

    }
}
