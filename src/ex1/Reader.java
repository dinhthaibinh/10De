package ex1;

import java.util.Scanner;

public class Reader {
    private static int id = 10000;
    private int idReader;
    private String name;
    private String address;
    private String phoneNumber;
    private Book book;
    private int number;

    public Reader(){
        this.idReader = id++;
        this.book = new Book();
    }

    public Reader(int idReader, String name, String address, String phoneNumber) {
        this.book = new Book();
        this.idReader = idReader;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void input(){
        System.out.println("nhập vào tên bạn đọc:");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("nhập vào địa chỉ:");
        this.address = new Scanner(System.in).nextLine();
        System.out.println("nhập vào số điện thoại:");
        this.phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("nhập số lượng sách mượn:");
        this.number = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.number; i++) {
            book.input();
        }
    }

    public void output(){
        System.out.println("mã bạn đọc: " + this.idReader);
        System.out.println("tên: " + this.name);
        System.out.println("địa chỉ: " + this.address);
        System.out.println("số điện thoại: " + this.phoneNumber);
        for (int i = 0; i < this.number; i++) {
            book.output();
        }
    }
}
