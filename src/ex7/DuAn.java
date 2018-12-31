package ex7;

import java.util.Scanner;

public class DuAn {
    private static int ma = 1000;
    private int maDuAn;
    private String ten;
    private int kieuDuAn;
    private long tongKinhPhi;

    public DuAn() {
        this.maDuAn = ma++;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten:");
        this.ten = sc.nextLine();
        System.out.println("kieu du an:");

        System.out.println("tong kinh phi:");
        this.tongKinhPhi = sc.nextLong();
    }

    public void xuat(){
        System.out.println("ma du an:" + this.maDuAn);
        System.out.println("ten du an:" + this.ten);
        System.out.printf("kieu du an:");
        switch (this.kieuDuAn) {
            case IKieuDuAn.NHO:
                System.out.println("nho");
                break;
            case IKieuDuAn.VUA:
                System.out.println("vua");
                break;
            case IKieuDuAn.LON:
                System.out.println("lon");
                break;
        }
        System.out.println();
        System.out.println("tong kinh phi:" + this.tongKinhPhi);
    }
}
