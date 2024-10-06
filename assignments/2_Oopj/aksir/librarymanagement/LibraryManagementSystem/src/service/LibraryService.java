package service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import exception.BookAlreadyBorrowed;
import exception.BookNotBorrowed;
import exception.BooksNotAvailable;
import exception.MemberNotFound;
import model.Book;
import model.Library;
import model.Member;

public class LibraryService {
	private static Library library = new Library();
	private static Scanner sc = new Scanner(System.in);
	
	
	public void addBook() {
		Book book = new Book();
		sc.nextLine();
		System.out.print("Enter book Title : ");
		book.setBookTitle(sc.nextLine());
		System.out.print("Enter ISBN : ");
		book.setISBN(sc.nextLine());
		System.out.print("Enter Author Name : ");
		book.setAuthorName(sc.nextLine());
		book = library.addBook(book);
		System.out.println("Book addded: "+ book.getBookTitle()+" by "+book.getAuthorName()+"( "+book.getISBN() +")");
	}
	
	public void addMember() {
		Member member = new Member();
		sc.nextLine();
		System.out.print("Enter Member Name : ");
		member.setMemberName(sc.nextLine());
		library.addMember(member);
		System.out.println("Member "+member.getMemberName() +" added with Member ID : " + member.getMemberId());
	
	}
	
	
	public static void borrowBook() {
		System.out.print("Enter Member ID : ");
		Integer memberId = sc.nextInt();
		
		Member member = null;
		Book book = null;
		
		try {
			member = Library.getMembers().stream().filter(m->m.getMemberId().equals(memberId)).findFirst().orElseThrow(() -> new MemberNotFound("Member : "+memberId+ " not found"));
		} catch (MemberNotFound e) {
			System.out.println("Member with "+memberId+" not found");
			e.printStackTrace();
		}
		sc.nextLine();
		System.out.print("Enter ISBN of Book : ");
		String ISBN =  sc.nextLine();
			
		//Map<String,Book> map = Library.getBooks();
		//Boolean value = Library.getBooks().values().stream().filter(e->e.getISBN().equals(ISBN)).anyMatch(b->b.isAvailable());
		
		
		try {
			book = Library.getBooks().values().stream().filter(e->e.getISBN().equals(ISBN)).findFirst().orElseThrow(() ->new  BooksNotAvailable("Book with "+ISBN+" not available"));
		} catch (BooksNotAvailable e) {
			System.out.println("Book with "+ISBN+" not found");
			e.printStackTrace();
		}
		
		try {
			 if(member.borrowBook(book))
				 System.out.println(book.getBookTitle() +" borrowed by "+ member.getMemberName());
		} catch (BookAlreadyBorrowed e) {
			System.out.println("Book with "+book.getISBN()+" already Borrowed");
			e.printStackTrace();
		}
			
	 }
	
	public static void returnBook() {
		sc.nextLine();
		System.out.print("Enter Member ID : ");
		Integer memberId = sc.nextInt();
		Member member = null;
		try {
			member = Library.getMembers().stream().filter(m->m.getMemberId().equals(memberId)).findFirst().orElseThrow(() -> new MemberNotFound("Member : "+memberId+ " not found"));
		} catch (MemberNotFound e) {
			System.out.println("Member with "+memberId+" not found");
			e.printStackTrace();
		}
		
		sc.nextLine();
		System.out.print("Enter ISBN of Book : ");
		String ISBN =  sc.nextLine();
	    Book book = null;
		try {
			book = Library.getBooks().values().stream().filter(e->e.getISBN().equals(ISBN)).findFirst().orElseThrow(() ->new  BooksNotAvailable("Book with "+ISBN+" not available"));
		} catch (BooksNotAvailable e) {
			System.out.println("Book with "+ISBN+" not found");
			e.printStackTrace();
		}
		if(Member.getBorrowedBooks().contains(book)){
			try {
				if(member.returnBook(book))
					System.out.println("Book returned successfully");
			} catch (BookNotBorrowed e) {
				System.out.println("Book with "+book.getISBN()+" not Borrowed by "+member.getMemberName());
				e.printStackTrace();
			}
		}
	}
	
	public static void printStatistics() {
		int count = library.getTotalBookscount();
		System.out.println("Total Books in Library are : "+ count);
		if(count >= 1) {
			library.displayBooks();			
		}
		count = library.getTotalMembersCount();
		System.out.println("Total Member count : "+count);
		if(count >= 1) {			
			library.getTotalMembers();
		}
		count = Member.getBorrowedBooksCount();
		System.out.println("Total Borrowed Book count : "+count);
		if(count >= 1)
			library.getBorrowedBooks();
		library.getAvailableBooks();
	}
	
	public void getBookByName() {
		sc.nextLine();
		System.out.print("Enter Book Name : ");
		library.searchBookByName(sc.nextLine());
		
	}
	public void getBookByISBN() {
		sc.nextLine();
		System.out.print("Enter ISBN of Book : ");
		try {
			library.searchBookByISBN(sc.nextLine());
		} catch (BooksNotAvailable e) {
			System.out.println("Book not available");
			e.printStackTrace();
		}
	}
	
	public static void getAllBooks() {
		library.displayBooks();	
	}
	
	public static void getBorrowedBooks() {
		library.getBorrowedBooks();
	}

	public static void getAvailableBooks() {
		library.getAvailableBooks();
	}

	public static void getBorrowedBooksHistory() {
		List<Book> books =  Member.getBorrowedBooks();
		books.forEach(book -> System.out.println(book));
	}

	public static void getAllMembers() {
		library.getTotalMembers();
	}

	public static void getAllMembersCount() {
		System.out.println("Total Member count : "+library.getTotalMembersCount());
		
	}

	public static void getTotalBooksCount() {
		System.out.println("Total Books in Library are : "+library.getTotalBookscount());
		
	}

	public static void getBorrowedBooksCount() {
		Member.getBorrowedBooksCount();
		
	}
	
	public static int menulist() {
		System.out.println(" 0. EXIT");
		
		System.out.println(" 1. ADD BOOK");
		System.out.println(" 2. ADD MEMBER");
		
		System.out.println(" 3. BORROW BOOK");
		System.out.println(" 4. RETURN BOOK");
		System.out.println(" 5. PRINT STATISTICS");
		
		System.out.println(" 6. GET BOOK BY NAME");
		System.out.println(" 7. GET BOOK BY ISBN");
		System.out.println(" 8. GET ALL BOOKS");
		System.out.println(" 9. GET BORROWED BOOKS");
		System.out.println("10. GET AVAILABLE BOOKS");
		System.out.println("11. GET BORROWED BOOK HISTORY");
		System.out.println("12. GET TOTAL BOOKS COUNT");
		System.out.println("13. GET BORROWED BOOKS COOUNT");
				
		System.out.println("14. GET ALL MEMBER");
		System.out.println("15. GET ALL MEMBERS COUNT");
		System.out.println("16. UPDATE MEMBER");
		System.out.println("17. UPDATE MEMBER");
		System.out.println("18. DELETE MEMBER");
		
		return sc.nextInt();
	}

	

	
}
