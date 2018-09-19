package com.gio.callbacks;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

@Entity
@EntityListeners(ArticleListener.class)
public class Article {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "article_name")
	private String articleName;

	private Date date;

	public Article() {
	}

	public Article(String articleName) {
		this.articleName = articleName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
