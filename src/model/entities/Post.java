package model.entities;

import java.util.Date;

public class Post {
	private int id;
	private String content;
	private Date date;
	private User user;

	public Post() {
		this(0);
	}

	public Post(int id) {
		this.id = id;
	}

	public Post(int id, String content, Date date, User user) {
		this.id = id;
		this.content = content;
		this.date = date;
		this.user = user;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
