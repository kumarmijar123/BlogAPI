package com.springblog.springblog.entities;



//@Entity
public class Blog {
   // @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String category;
	public Blog(int id, String title, String description, String category) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
	}
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", description=" + description + ", category=" + category + "]";
	}

    
    
}
