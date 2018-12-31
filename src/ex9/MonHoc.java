package ex9;

import java.util.Scanner;

public class MonHoc {
    private static int ma = 100;
    private int maMon;
    private String ten;
    private int tongSoTiet;
    private long mucKinhPhi;

    public MonHoc(){
        this.maMon = ma++;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ten:");
        this.ten = sc.nextLine();
        System.out.println("tong so tiet:");
        this.tongSoTiet = sc.nextInt();
        System.out.println("muc kinh phi:");
        this.mucKinhPhi = sc.nextLong();
    }

    public void xuat(){
        System.out.println("ma mon: " + this.maMon);
        System.out.println("ten: " + this.ten);
        System.out.println("tong so tiet: " + this.tongSoTiet);
        System.out.println("muc kinh phi: " + this.mucKinhPhi);
    }
}
