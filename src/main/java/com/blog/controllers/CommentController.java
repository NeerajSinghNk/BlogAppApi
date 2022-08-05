package com.blog.controllers;

import com.blog.entities.Comment;
import com.blog.payloads.ApiResponse;
import com.blog.payloads.CommentDto;
import com.blog.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentBody, @PathVariable Integer postId){
        CommentDto createComment = this.commentService.createComment(commentBody, postId);
        return new ResponseEntity<CommentDto>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{commentId}")
    ResponseEntity<ApiResponse> createComment(@PathVariable Integer commentId){
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted successfully !!", true), HttpStatus.OK);
    }
}
