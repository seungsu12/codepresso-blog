package com.codepresso.blog.service;

import com.codepresso.blog.repository.PostRepository;
import com.codepresso.blog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public ArrayList<Post> select_post() {
        return postRepository.select_post();
    }

    public Post select_one(Long id) {
        return postRepository.select_one(id);
    }

    public void insert_post(Post post){
        postRepository.insert_post(post);
    }

    public void update_post(Post post) {
        postRepository.update_post(post);
    }
    public void delete_post(Long id){
        postRepository.delete_post(id);
    }
}
