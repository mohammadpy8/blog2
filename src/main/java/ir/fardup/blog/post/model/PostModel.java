package ir.fardup.blog.post.model;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PostModel {
    private Integer id;
    private String title;
    private String text;
}
