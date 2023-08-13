package com.ugur.entity;

import java.util.Scanner;

import com.ugur.repository.IView;

public class Library implements IView {

	Scanner sc = new Scanner(System.in);
	Book book = new Book();
	Book[] bookList;
	int boyut = 0;

	public void application() {
		int secilen;
		do {

			showAll();
			secilen = choose();
			if (secilen == 0) {
				System.out.println("ÇIKIŞ YAPILDI");
			} else {
				menu(secilen);
			}

		} while (secilen != 0);

	}

	public void menu(int secim) {

		switch (secim) {
		case 1:

			add(create());

			break;
		case 2:

			remove();
			break;
		case 3:
			search();
			book.goruntule();
			break;
		case 4:
			list(bookList);
			goruntule();
			break;
		default:
			System.out.println("Lütfen geçerli bir değer giriniz. ");

		}

	}

	public void showAll() {

		System.out.println();
		System.out.println("***************************");
		System.out.println("******* LIBRARY APP *******");
		System.out.println("***************************");
		System.out.println();
		System.out.println("1- Kitap ekle");
		System.out.println("2- Kitap sil");
		System.out.println("3- Kitap ara");
		System.out.println("4- Kitapları görüntüle");
		System.out.println("0- Ç I K I Ş");
		System.out.println();

	}

	public int choose() {

		System.out.print("Lütfen bir seçim yapınız: ");

		int secim = sc.nextInt();
		sc.nextLine();

		return secim;

	}

	public Book create() {
		System.out.print("Lütfen kitap adı giriniz: ");
		String kitapAdi = sc.nextLine();
		System.out.print("Lütfen yazar adı giriniz: ");
		String yazarAdi = sc.nextLine();
		System.out.print("Lütfen ISBN no giriniz: ");
		int isbnNo = sc.nextInt();
		System.out.print("Lütfen yayımlanma yılını giriniz: ");
		int yayimYili = sc.nextInt();

		Book book = new Book(kitapAdi, yazarAdi, isbnNo, yayimYili);
		return book;

	}

	public void add(Book book) {

		Book[] tmp;
		if (bookList == null) {
			bookList = new Book[1];
			bookList[0] = book;
		} else {
			tmp = new Book[boyut + 1];
			for (int i = 0; i < boyut; i++) {
				tmp[i] = bookList[i];
			}
			tmp[boyut] = book;
			bookList = tmp;
		}
		boyut++;

	}

	public void remove() {
		if (boyut == 0) {
			System.out.println("Kütüphane boş.");
		} else {
			System.out.print("Lütfen ISBN no giriniz: ");
			int isbnNo = sc.nextInt();
			Book[] tmp = new Book[boyut - 1];
			int j = 0;
			for (int i = 0; i < boyut - 1; i++) {
				if (bookList[i].getIsbn() != isbnNo) {
					tmp[i] = bookList[i + j];
				} else {
					j = 1;
					tmp[i] = bookList[i + j];
				}
			}
			bookList = tmp;
			boyut--;
		}
	}

	public void search() {
		System.out.println("Lütfen kitap adı giriniz: ");
		String kitapAdi = sc.nextLine();
		boolean status = false;
		for (int i = 0; i < boyut; i++) {
			if (bookList[i].getTitle().equalsIgnoreCase(kitapAdi)) {
				status = true;
				System.out.println("*********************************");
				System.out.println("Kitabın başlığı: " + bookList[i].getTitle());
				System.out.println("Kitabın yazarı: " + bookList[i].getAuthor());
				System.out.println("Kitabın ISBN no: " + bookList[i].getIsbn());
				System.out.println("Kitabın yayım yılı: " + bookList[i].getPublicationYear());
				System.out.println();
			}

		}
		if (status == false) {
			System.out.println("Aradığınız kitap stoklarımızda bulunamamıştır.");
		}
	}

	public void list(Book[] bookList) {
		if (boyut == 0) {
			System.out.println("Kütüphane boş.");
		} else {
			for (int i = 0; i < boyut; i++) {
				System.out.println("---------------------------------");
				System.out.println("Kitabın başlığı: " + bookList[i].getTitle());
				System.out.println("Kitabın yazarı: " + bookList[i].getAuthor());
				System.out.println("Kitabın ISBN no: " + bookList[i].getIsbn());
				System.out.println("Kitabın yayım yılı: " + bookList[i].getPublicationYear());
			}
		}
	}

	@Override
	public void goruntule() {
		System.out.println("Kütüphane görüntülemesi tamamlandı.");

	}

}
