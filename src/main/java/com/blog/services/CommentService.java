package com.blog.services;

import com.blog.entities.Comment;
import com.blog.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
