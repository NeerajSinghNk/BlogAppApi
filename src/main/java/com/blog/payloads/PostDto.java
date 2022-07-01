package com.blog.payloads;

import com.blog.entities.Category;
import com.blog.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Integer postId;

    @NotEmpty
    @Size(min = 5, message = "Minimum size of Title is 5")
    private String title;

    @NotEmpty
    @Size(min = 5, message = "Minimum size of category description is 5")
    private String content;

    private String imageName;

    private Date addedDate;

    private CategoryDto category;

    private UserDto user;

}
