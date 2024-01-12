package com.springblog.springblog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springblog.springblog.entities.Blog;
import com.springblog.springblog.service.BlogService;

@RestController
public class BlogController {
	
	@Autowired
	private BlogService blogService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to my blog";
	}
	
	//get the courses
	
	@GetMapping("/Blogs")
	public List<Blog> getBlogs()
	{
		return this.blogService.getBlogs();
	}
	
	@GetMapping("/Blogs/{blogId}")
	public Blog getBlog(@PathVariable String blogId)
	{
		return this.blogService.getBlog(Long.parseLong(blogId));
	}
	
	//course add 
	@PostMapping("/Blogs")
	public Blog addBlog(@RequestBody Blog blog)
	{
		return this.blogService.addBlog(blog);
	}
	
	//update course using PUT request
	@PutMapping("/Blogs")
	public Blog updateBlog(@RequestBody Blog blog) 
	{
		return this.blogService.updateBlog(blog);
		
	}
	
}
	
   