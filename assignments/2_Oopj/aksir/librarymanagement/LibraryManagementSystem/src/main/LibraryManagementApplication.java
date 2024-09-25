package main;

import service.LibraryService;

public class LibraryManagementApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		
		LibraryService libraryService = new LibraryService();
		int choice;
		while((choice = LibraryService.menulist()) != 0) {
		
			switch (choice) {
				case 1:
					libraryService.addBook();
					break;
				case 2:
					libraryService.addMember();
					break;
				case 3:
					LibraryService.borrowBook();
					break;
				case 4:
					LibraryService.returnBook();
					break;
				case 5:
					LibraryService.printStatistics();
					break;
				case 6:
					libraryService.getBookByName();
					break;
				case 7:
					libraryService.getBookByISBN();
					break;
				case 8:
					LibraryService.getAllBooks();
					break;
				case 9:
					LibraryService.getBorrowedBooks();
					break;
				case 10:
					LibraryService.getAvailableBooks();
					break;
				case 11:
					LibraryService.getBorrowedBooksHistory();
					break;
					
				case 12:
					LibraryService.getTotalBooksCount();
					break;
				case 13:
					LibraryService.getBorrowedBooksCount();
					break;
				case 14:
					LibraryService.getAllMembers();
					break;
				case 15:
					LibraryService.getAllMembersCount();
					break;
				case 16:
					
					break;
				case 17:
					
					break;
				case 18:
					
					break;
			default:
				System.out.println("Wrong choice !!!");
		
			}
		
		
		
		}
	}
}