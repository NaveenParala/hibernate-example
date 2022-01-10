package com.sathya.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	private int bookId;
	
	@Column(length=12,nullable=true)
	private String bookName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="book_author",joinColumns=@JoinColumn(name="bookId_fk",referencedColumnName="bookId"),
	inverseJoinColumns=@JoinColumn(name="authorId_fk",referencedColumnName="authorId",nullable=true))
	private Set<Author> authors;
	
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	public Set<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", authors=" + authors + "]";
	}
	
}
