package com.ugur.entity;

import com.ugur.repository.IView;

public class Book implements IView {

	private String title;
	private String author;
	private int isbn;
	private int publicationYear;

	public Book() { // default constructor oluştur

	}

	public Book(String title, String author, int isbn, int publicationYear) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.publicationYear = publicationYear;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	@Override
	public void goruntule() {
		System.out.println("Kitap görüntülemesi tamamlandı.");

	}

}
