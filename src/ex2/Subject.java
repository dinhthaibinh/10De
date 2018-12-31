package ex2;

import java.util.Scanner;

public class Subject {
    private String idSubject;
    private String name;
    private int totalLesson;
    private int kindSubject;

    public Subject() {
    }

    public Subject(String idSubject, String name, int lesson, int kindSubject) {
        this.idSubject = idSubject;
        this.name = name;
        this.totalLesson = lesson;
        this.kindSubject = kindSubject;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào mã môn học:");
        this.idSubject = sc.nextLine();
        System.out.println("nhập vào tên môn học:");
        this.name = sc.nextLine();
        System.out.println("nhập vào số tiết:");
        this.totalLesson = sc.nextInt();
        System.out.println("lựa loại môn học:");
        this.kindSubject = sc.nextInt();

    }

    public void output() {
        System.out.println("mã môn:" + this.idSubject);
        System.out.println("tên môn:" + this.name);
        System.out.println("tổng số tiết:" + this.totalLesson);
        System.out.printf("loại môn: ");
        switch (this.kindSubject) {
            case IClassify.OUTLINE:
                System.out.printf("đại cương");
                break;
            case IClassify.BASE_BRANCH:
                System.out.printf("cơ sở ngành");
                break;
            case IClassify.COMPULSORY_MAJORS:
                System.out.printf("chuyên ngành bắt buộc");
                break;
            case IClassify.CHOOSE_MAJORS:
                System.out.printf("chuyên ngành tự chọn");
                break;
        }
        System.out.println(java.time.LocalDateTime.now());
    }
}
