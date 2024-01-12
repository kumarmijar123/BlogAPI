package com.springblog.springblog.service;

import java.util.List;

import com.springblog.springblog.entities.Blog;

public interface BlogService {
	
	public List<Blog> getBlogs();
	
	public Blog getBlog(long blogId);
	
	public Blog addBlog(Blog blog);
	
	public Blog updateBlog(Blog blog);

}
