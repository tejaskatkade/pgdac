class Book {
    String name;
    int noOfPages;
    String authorName;
    float price;

    Book(String name, int noOfPages, String authorName, float price) {
        this.name =name;
        this.noOfPages = noOfPages;
        this.authorName =authorName;
        this.price =price;
    }
    void displayDetails() {
        System.out.println("Name :"+name+" Total Pages :"+noOfPages+"Author Name :"+ authorName+" Price :"+price);

    }
}