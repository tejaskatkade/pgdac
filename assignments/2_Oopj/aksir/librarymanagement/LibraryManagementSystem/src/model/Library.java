package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

import exception.BooksNotAvailable;
import exception.MemberNotFound;

public class Library {

	private static Map<String , Book > books = new HashMap<String, Book>();
	private static Set<Member> members = new HashSet<Member>();
	
	public static Map<String , Book >  getBooks() {
		return books;
	}
	public static Set<Member> getMembers() {
		return members;
	}
	
	public Library() {
	
	}
	
	public Book addBook(Book book) {
		
		Book newBook = books.put(book.getISBN(), book);
		if(newBook == null) {
			System.out.println("New Booked added");
		}else {
			System.out.println("Book with ISBN already exist and Get Replaced Now");
		}
		return book;
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public void deleteMember(Member member) throws MemberNotFound {
		if(members.contains(member)) {
			members.remove(member);			
		}else {
			throw new MemberNotFound("Member : "+member.getMemberName()+ " not exist");
	}
		
	}
	public void displayBooks() {
		Set<Entry<String,Book>> set = books.entrySet();
		Iterator<Entry <String, Book>> itr = set.iterator();
		System.out.println("Books From Libray ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void getBorrowedBooks() {
		Set<Entry<String,Book>> set = books.entrySet();
		//Iterator<Entry <String, Book>> itr = set.iterator();
		System.out.println("Borrowed Books   ");
//		while(itr.hasNext()) {
//			if(itr.next().getValue().isAvailable() == false )
//				System.out.println(itr.next());
//		}
		
		set.stream().filter(e->e.getValue().isAvailable() == false).forEach(b->System.out.println(b+"Borrowed by "+b.getValue().getMember().getMemberName()));

//		List<Book> list = members.getBorrowedBook();
//		list.forEach(name -> System.out.println(name));
		
		
	}
	public void getAvailableBooks() {
		Set<Entry<String,Book>> set = books.entrySet();
		Iterator<Entry <String, Book>> itr = set.iterator();
		System.out.println("Books Available in Library  ");
//		while(itr.hasNext()) {
//			if(itr.next().getValue().isAvailable() == true ) {
//				try {
//				System.out.println(itr.next());
//				}catch(NoSuchElementException e) {
//					System.out.println("Book not available in Library");
//					e.printStackTrace();
//				}
//			}
//		}
		
		set.stream().filter(e->e.getValue().isAvailable() == true).forEach(b->System.out.println(b));
	}
	
	public Integer getTotalBookscount() {
		return books.size();
	}
	
	public void getTotalMembers() {
		Iterator<Member> itr = members.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public Integer getTotalMembersCount() {
		return members.size();
	}
	
	public Book searchBookByISBN(String ISBNName) throws BooksNotAvailable {
		 if(books.containsKey(ISBNName)) {
			 return books.get(ISBNName);
		 }else {
			 throw new BooksNotAvailable("Book with ISBN :"+ISBNName+ " not available");
		 }
	}
	
	public Map.Entry<String,Book> searchBookByName(String bookName) {
		Set<Entry<String,Book>> set = books.entrySet();
		Map.Entry<String,Book> map = null;
		try {
			 map = set.stream().filter(e->e.getValue()
							   .getBookTitle().equals(bookName))
					           .findFirst()
					           .orElseThrow(
					        	 ()->new BooksNotAvailable("Book with Name :"+bookName+ " not available")
					        	);
		} catch (BooksNotAvailable e) {
			e.printStackTrace();
		}
		return map;
	}
	
	
	
}
