package model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import exception.BookAlreadyBorrowed;
import exception.BookNotBorrowed;

public class Member {
	private Integer memberId; 
	private String memberName;
	private static Integer counter = 1000;
	
	private static List<Book> borrowedBooks = new ArrayList<>();
	private static List<Book> returnedBooks = new ArrayList<>();
	
	public Member() {
		
	}

	public Integer getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}
	

	public void setMemberName(String memberName) {
		this.memberName =  memberName;
		this.memberId = ++counter;
	}
	
	public static List<Book> getBorrowedBooks() {
		return borrowedBooks;
	}
	
	public static Integer getBorrowedBooksCount() {
		return borrowedBooks.size();	
	}
	
	public Boolean borrowBook(Book book) throws BookAlreadyBorrowed {
		if(borrowedBooks.contains(book)) {
			throw new BookAlreadyBorrowed("Book Already Borrowed by : "+this.memberName);
		}
		book.setMember(this);
		book.setAvailable(false);
		return borrowedBooks.add(book);
	}
	
	public Boolean returnBook(Book book) throws BookNotBorrowed {
		if(borrowedBooks.remove(book)) {
		
			book.setMember(null);
			book.setAvailable(true);
			return returnedBooks.add(book);
		
		}else {
			throw new BookNotBorrowed("This book is Not borrowed by Member : "+ this.memberId +" : " +this.memberName);
		}
		
	}
	
	@Override
	public String toString() {
		return "Member [Member Id : " + memberId + ", Member Name : " + memberName + "]";
	}

	public void printBorrowedBooks() {
		ListIterator<Book> itr = borrowedBooks.listIterator();
		System.out.println("Borrowed Books Record ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	public void printBorrowedBooksHistory() {
		ListIterator<Book> itr = returnedBooks.listIterator();
		System.out.println("Previously Borrowed Book History");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
