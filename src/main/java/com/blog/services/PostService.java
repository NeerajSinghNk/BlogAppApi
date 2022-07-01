package com.blog.services;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;

import java.util.List;

public interface PostService {

//    Create
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    //    Update
    PostDto updatePost(PostDto postDto, Integer postId);

//    Delete
    void deletePost(Integer postId);

//    Get Single Post
    PostDto getPostById(Integer postId);

//    GetAllPosts
    List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);

//    Get post by user
    List<PostDto> geyPostByUser(Integer userId);

//    Get post by category
    List<PostDto> getPostByCategory(Integer categoryId);

//    Search post
    List<PostDto> searchPost(String keyword);


}
