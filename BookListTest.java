import java.util.ArrayList;

import java.util.List.*;
public class BookListTest {

    public static void main(String[] args) {
        ArrayList2 obj = new ArrayList2();

        ArrayList<String> bookList= new ArrayList<>();
        bookList.add("math");
        bookList.add("science");
        bookList.add("Social");

        obj.setBooks(bookList);

        //getting all list of books
        ArrayList<String> retrivedBooks = obj.getBooks();
        System.out.println("list of all books:");
        for (String book : retrivedBooks){
            System.out.println(book);
        }
    }
}

