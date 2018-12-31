package ex1;

import java.util.Scanner;

public class Book {
    private static int id = 11111;
    private int idBook;
    private String bookName;
    private int specialized;
    private int year;
    private int amount;

    public Book(){
        this.idBook = id++;
    }

    public Book(int idBook, String bookName, int specialized, int year, int amount) {
        this.idBook = idBook;
        this.bookName = bookName;
        this.specialized = specialized;
        this.year = year;
        this.amount = amount;
    }

    public void input(){
        System.out.println("nhập vào tên sách: ");
        this.bookName = new Scanner(System.in).nextLine();
        System.out.println("chuyên ngành(1:khoa học tự nhiên)" +
                "(2:văn học - nghệ thuật)" +
                "(3:điện tử)" +
                "(4:công nghệ thông tin)");
        this.specialized = new Scanner(System.in).nextInt();
        System.out.println("nhập vào năm xuất bản:");
        this.year = new Scanner(System.in).nextInt();
        System.out.println("nhập vào số lượng sách:");
        this.amount = new Scanner(System.in).nextInt();
    }

    public void output(){
        System.out.println("mã sách: " + this.idBook);
        System.out.println("tên sách: " + this.bookName);
        System.out.println("chuyên ngành: ");
        switch (this.specialized){
            case ISpecialties.NATURAL_SCIENCES:
                System.out.println("khoa học tự nhiên");
            case ISpecialties.LITERARY_ARTS:
                System.out.println("văn học - nghệ thuật");
            case ISpecialties.ELECTRONIC:
                System.out.println("điện tử");
            case ISpecialties.INFORMATION_TECHNOLOGY:
                System.out.println("công nghệ thông tin");
        }
        System.out.println("số lượng sách: " + this.amount);
    }
}
