package model;

public class Book {
	private String ISBN;
	private String bookTitle;
	private String authorName;
	private Boolean isAvailable = true;
	private Member member = null;
	
	public Boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Book() {
		
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "BookTitle : " + bookTitle + ", Author : " + authorName + ", ISBN : " + ISBN + ", Available : "
				+ isAvailable+"\n";
	}

	public void setMember(Member member) {
		this.member = member;
	}
	public Member getMember() {
		return this.member;
	}
	
}
