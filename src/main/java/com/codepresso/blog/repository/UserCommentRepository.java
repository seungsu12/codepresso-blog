package com.codepresso.blog.repository;

import com.codepresso.blog.vo.UserComment;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserCommentRepository {

    ArrayList<UserComment> getComments (Integer post_id);

    void insertComment(UserComment userComment);
}
