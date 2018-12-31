package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddList {
    private List<Book> books;
    private List<Reader> readers;
    private Book book;
    private Reader reader;
    private int number;


    public AddList(){
        this.book = new Book();
        this.reader = new Reader();
        this.readers = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void insetInto(){
        System.out.println("lựa chọn phần bạn muốn thêm" +
                "(1:sách)" +
                "(2:bạn đọc)");
        int choose = new Scanner(System.in).nextInt();
        System.out.println("số lượng cần thêm:");
        this.number = new Scanner(System.in).nextInt();
        switch (choose){
            case 1:
                for (int i = 0; i < this.number; i++) {
                    book.input();
                    books.add(book);
                }
            case 2:
                for (int i = 0; i < this.number; i++) {
                    reader.input();
                    readers.add(reader);
                }
        }
    }

    public void printfBook(){
        for (Book book : books) {
            book.output();
        }
    }

    public void printfReader(){
        for (Reader reader : readers){
            reader.output();
        }
    }
}
