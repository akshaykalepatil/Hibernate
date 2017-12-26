package com.hibernate.ManyToManyUni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Books {

	@Id
	@Column
	int bookId;

	@Column
	String bookName;

	@ManyToMany(cascade=CascadeType.ALL)
//	@PrimaryKeyJoinColumn
	@JoinColumn
	@JoinTable
	List<Authors> authors;

	public Books(int bookId, String bookName, List<Authors> authors) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authors = authors;
	}

	public Books() {
		super();
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public List<Authors> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Authors> authors) {
		this.authors = authors;
	}

}
