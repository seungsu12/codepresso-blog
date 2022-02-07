package com.codepresso.blog.service;

import com.codepresso.blog.repository.UserCommentRepository;
import com.codepresso.blog.vo.UserComment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {

    private final UserCommentRepository userCommentRepository;

    public CommentService(UserCommentRepository userCommentRepository) {
        this.userCommentRepository = userCommentRepository;
    }

    public ArrayList<UserComment> getComment(Integer post_id){
        return userCommentRepository.getComments(post_id);
    }


    public void insertComment(UserComment userComment) {
        userCommentRepository.insertComment(userComment);
    }
}
