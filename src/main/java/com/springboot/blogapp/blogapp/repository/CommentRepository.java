package com.springboot.blogapp.blogapp.repository;

import com.springboot.blogapp.blogapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment,Long> {

    List<Comment> findByPostId(long postId);


}
