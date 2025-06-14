package com.kh.practice.list.libarary.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.list.libarary.model.vo.Book;

public class BookController {
	
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	public BookController() {
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 27000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "강보람", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				searchList.add(bookList.get(i));
			}
		}
		
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i = 0; i < bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(title) && bookList.get(i).getAuthor().equals(author)) {
				removeBook = bookList.remove(i);
			}
		}
		
		return removeBook;
	}
}
