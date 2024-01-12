package com.springblog.springblog.service;

import org.springframework.stereotype.Service;
import com.springblog.springblog.entities.Blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    private final List<Blog> list;

    public BlogServiceImpl() {
        list = new ArrayList<>();
        list.add(new Blog(12, "designer", "This contains the topic related to graphic designing", "Graphic designer"));
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public Blog getBlog(long blogId) {
        Optional<Blog> optionalBlog = list.stream()
                .filter(blog -> blog.getId() == blogId)
                .findFirst();
        return optionalBlog.orElse(null);
    }

    @Override
    public Blog addBlog(Blog blog) {
        // Perform validation here if needed
        list.add(blog);
        return blog;
    }

    @Override
    public Blog updateBlog(Blog blog) {
        // Perform validation here if needed
        list.forEach(e -> {
            if (e.getId() == blog.getId()) {
                e.setTitle(blog.getTitle());
                e.setDescription(blog.getDescription());
                e.setCategory(blog.getCategory());
            }
        });
        return blog;
    }
}
