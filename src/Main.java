class Book {
    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable = true;

    public Book(String titleName, String authorName, int numberPages){
        title = titleName;
        author = authorName;
        pages = numberPages;
        System.out.println("A new book " + title + " by " + author + " has been added to the library");
    }

    public void displayInfo(){
        if(title.equals("The Great Gatsby")) {
            System.out.println("The Great Gatsby is a 1925 novel by American writer F. Scott Fitzgerald.");
        }
        if(title.equals("To Kill a Mockingbird")) {
            System.out.println("To Kill a Mockingbird is a 1960 Southern Gothic novel by American author Harper Lee.");
        }
        if(title.equals("1984")) {
            System.out.println("1984 is a dystopian novel by George Orwell, exploring totalitarianism and surveillance.");
        }
    }

    public void borrowBook(){
        isAvailable = false;
        System.out.println("This book " + title + " is not available.");
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println("This book " + title + " is available.");
    }

    public static void main(String[] args) {
        System.out.println();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 220);
        book1.displayInfo();
        book1.borrowBook();

        System.out.println();
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 336);
        book2.displayInfo();
        book2.borrowBook();

        System.out.println();
        Book book3 = new Book("1984", "George Orwell", 328);
        book3.displayInfo();
        book3.borrowBook();
    }
}
