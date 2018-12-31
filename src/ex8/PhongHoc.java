package ex8;

import java.util.Scanner;

public class PhongHoc {
    private static int ma =  100;
    private int maPhong;
    private String ten;
    private String kieuPhong;
    private int soGhe;

    public PhongHoc(){
        this.maPhong = ma++;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten phong:");
        this.ten = sc.nextLine();
        System.out.println("kieu phong:");
        this.kieuPhong = sc.nextLine();
        System.out.println("so ghe:");
        this.soGhe = sc.nextInt();
    }

    public void xuat(){
        System.out.println("ma phong: " + this.maPhong);
        System.out.println("ten phong: " + this.ten);
        System.out.println("kieu phong: " + this.kieuPhong);
        System.out.println("so ghe: " + this.soGhe);;
    }
}
