package collection;

import java.util.Stack;

public class StackDemo{
    public static void main(String[] args) {
        book18 book1 = new book18("1234", "Dasar Pemrograman");
        book18 book2 = new book18("7145", "Hafalah Shalat Delisa");
        book18 book3 = new book18("3562", "Muhammad Al-Fatih");

        Stack<book18> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        book18 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        book18 tmp2=books.pop();

        if(tmp2 != null){
            System.out.println(tmp2.toString());
        }

        for(book18 book : books){
            System.out.println(book.toString());
        }

        System.out.println(books);

        int search = books.search(book1);
        System.out.println("Search: " + search);

    }
}