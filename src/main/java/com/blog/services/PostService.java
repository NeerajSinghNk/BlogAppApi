package com.blog.services;

import com.blog.entities.Post;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

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
    PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

//    Get post by user
    List<PostDto> getPostByUser(Integer userId);

//    Get post by category
    List<PostDto> getPostByCategory(Integer categoryId);

//    Search post
    List<PostDto> searchPosts(String keywords);


}
