package ir.fardup.blog.post.controller;

import ir.fardup.blog.post.model.PostModel;
import ir.fardup.blog.post.orm.Post;
import ir.fardup.blog.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/{name}")
    public String welcome(@PathVariable("name") String name){
        return "Hi," + name;
    }

    @GetMapping(value = {"","/"})
    public String welcomeParam(@RequestParam("name") String name){
        return "Hi," + name;
    }

    @PostMapping("/post/create")
    public PostModel create(@RequestBody PostModel post){
        return postService.create(post);
    }
}
