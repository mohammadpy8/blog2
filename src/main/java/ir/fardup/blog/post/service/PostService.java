package ir.fardup.blog.post.service;

import ir.fardup.blog.post.model.PostModel;
import ir.fardup.blog.post.orm.Post;
import ir.fardup.blog.post.orm.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
    public PostModel create(PostModel postModel){
        Post post=new Post();
        post.setText(postModel.getText());
        post.setTitle(postModel.getTitle());

        postRepository.save(post);

        postModel.setId(post.getId());

        return postModel;
    }
}
