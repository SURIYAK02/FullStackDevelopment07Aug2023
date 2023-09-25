package com.gentech.contructoroverloading;
class Book {
	String name;
	int book_code;
	String book_auhtor;

	Book(String n, int bc) {
		name = n;
		book_code = bc;
		System.out.println("Book Name : " + name);
		System.out.println("Book code : " + book_code);
	}

	Book(String ba) {
		book_auhtor = ba;
		System.out.println("Collge Under University : " + book_auhtor);

	}

	Book() {

	}

}

public class Books {

	public static void main(String[] args) {
		Book obj = new Book("Java Development", 1002);
		Book obj2 = new Book("Anna");
	}

}
