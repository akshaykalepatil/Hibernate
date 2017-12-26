package com.hibernate.ManyToManyUni;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Authors {

	@Id
	int authorId;

	String authorName;

	
	public Authors() {
		super();
	}

	public Authors(int authorId, String authorName) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Authors [authorId=" + authorId + ", authorName=" + authorName + "]";
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
