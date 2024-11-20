// Create an object to represent a book with properties such as title, author, and
// year published. Add a method to display the book details.

var book = {
    title : "Who will cry when you die",
    author : "Robin Sharma",
    year : 2002   
}

function displayBookDetails(obj){
    console.log(obj.title);
    console.log(obj.author);
    console.log(obj.year);
}

displayBookDetails(book);
