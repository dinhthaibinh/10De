package ex10;

import java.util.Scanner;

public class CauThu {
    private static int ma = 100;
    private int maCauThu;
    private String ten;
    private int tuoi;
    private long mucLuong;

    public CauThu() {
        this.maCauThu = ma++;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten cau thu:");
        this.ten = sc.nextLine();
        System.out.println("tuoi:");
        this.tuoi = sc.nextInt();
        System.out.println("muc luong:");
        this.mucLuong = sc.nextLong();
    }

    public void xuat(){
        System.out.println("ma cau thu:" + this.maCauThu);
        System.out.println("ten cau thu:" + this.ten);
        System.out.println("tuoi:" + this.tuoi);
        System.out.println("muc luong:" + this.mucLuong);
    }

    public long getMucLuong() {
        return mucLuong;
    }
}
