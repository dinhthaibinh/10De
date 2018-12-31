package ex8;

import java.util.Scanner;

public class Lop {
    private static int ma = 100;
    private int maLop;
    private String ten;
    private int soSinhVien;
    private int soPhong;
    private PhongHoc phongHoc;

    public Lop(){
        this.maLop = ma++;
        this.phongHoc = new PhongHoc();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten lop:");
        this.ten = sc.nextLine();
        System.out.println("so sinh vien:");
        this.soSinhVien = sc.nextInt();
        System.out.println("so phong can:");
        this.soPhong = sc.nextInt();
        for (int i = 0; i < this.soPhong; i++) {
            phongHoc.nhap();
        }
    }

    public void xuat(){
        System.out.println("ma lop: " + this.maLop);
        System.out.println("ten lop: " + this.ten);
        System.out.println("so sinh vien: " + this.soSinhVien);
        for (int i = 0; i < this.soPhong; i++) {
            phongHoc.xuat();
        }
    }
}
