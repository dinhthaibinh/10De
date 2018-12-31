package ex2;

import java.util.Scanner;

public class Student {
    private static int id = 10000;
    private int studentId;
    private String name;
    private String address;
    private String phoneNumber;
    private Subject[] subject = new Subject[8];
    private int n;

    public Student() {
        studentId = id++;
    }

    public Student(int studentId, String name, String address, String phoneNumber) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.subject = new Subject[8];
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên:");
        this.name = sc.nextLine();
        System.out.println("nhập vào địa chỉ:");
        this.address = sc.nextLine();
        System.out.println("nhập vào số điện thoại:");
        this.phoneNumber = sc.nextLine();
        System.out.println("đăng kí môn đi babe, bao nhiêu môn?");
        do {
            this.n = new Scanner(System.in).nextInt();
            if(this.n > 8){
                System.out.printf("chỉ có thể chọn tối đa 8 môn");
            }
        }while (this.n > 8);
        for (int i = 0; i < this.n; i++) {
            subject[i] = new Subject();
            subject[i].input();
        }


    }

    public void output(){
        System.out.println("mã sinh viên:" + this.studentId);
        System.out.println("tên sinh viên:" + this.name);
        System.out.println("địa chỉ:" + this.address);
        System.out.println("số điện thoại:" + this.phoneNumber);
        for (int i = 0; i < this.n; i++) {
            subject[i].output();
        }
    }
}
