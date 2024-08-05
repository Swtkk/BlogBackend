package com.springboot.blogapp.blogapp.service;

import com.springboot.blogapp.blogapp.payload.PostDto;
import com.springboot.blogapp.blogapp.payload.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy,String sortDir);

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, long id);

    void deletePostById(long id);
}
