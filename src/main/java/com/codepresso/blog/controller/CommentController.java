package com.codepresso.blog.controller;

import com.codepresso.blog.service.CommentService;
import com.codepresso.blog.vo.Result;
import com.codepresso.blog.vo.UserComment;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CommentController {
    @GetMapping(value = "/comments")
    public ArrayList<UserComment> getComment(@RequestParam Integer post_id){
        return commentService.getComment(post_id);
    }

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping(value = "/comment")
    public Result insertComment(@RequestBody UserComment userComment){
        commentService.insertComment(userComment);
        return new Result(200,"OK");
    }
}
