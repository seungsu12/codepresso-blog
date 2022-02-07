package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Mapper
public interface PostRepository {

    ArrayList<Post> select_post();

    Post select_one(Long id);

    void insert_post(Post post);

    void update_post(Post post);

    void delete_post(Long id);
}
