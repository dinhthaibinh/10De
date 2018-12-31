package ex6;

import java.util.Scanner;

public class PhongHoc {
    private static int ma = 1000;
    private int maPhong;
    private String tenPhong;
    private int soGhe;
    private ThietBi thietBi;
    private int soLuong;


    public PhongHoc() {
        this.maPhong = ma++;
        this.thietBi = new ThietBi();
    }

    public void nhap() {
        System.out.println("nhap vao ten phong:");
        this.tenPhong = new Scanner(System.in).nextLine();
        System.out.println("nhap vao so ghe:");
        this.soGhe = new Scanner(System.in).nextInt();
        System.out.println("so luong thiet bi can them:");
        for (int i = 0; i < this.soLuong; i++) {
            thietBi.nhap();
        }
    }

    public void xuat() {
        System.out.println("ma phong: " + this.maPhong);
        System.out.println("ten phong: " + this.tenPhong);
        System.out.println("so ghe: " + this.soGhe);
        for (int i = 0; i < this.soLuong; i++) {
            thietBi.xuat();
        }
    }
}
