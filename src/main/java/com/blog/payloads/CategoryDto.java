package com.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;

    @NotBlank
    @Size(min = 5, message = "Minimum size of category is 5")
    private String categoryTitle;

    @NotBlank
    @Size(min = 5, message = "Minimum size of category description is 5")
    private String categoryDescription;
}
