package ex10;

import java.util.Scanner;

public class ViTri {
    private static int ma = 100;
    private int maViTri;
    private String tenViTri;
    private long mucThuong;
    private CauThu cauThu;
    private int soLuong;

    public ViTri() {
        this.maViTri = ma++;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten vi tri:");
        this.tenViTri = sc.nextLine();
        System.out.println("muc thuong:");
        this.mucThuong = sc.nextLong();
        System.out.println("so luong cau thu cho vi tri nay:");
        this.soLuong = sc.nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            cauThu.nhap();
        }
    }

    public void xuat(){
        System.out.println("ma vi tri:" + this.maViTri);
        System.out.println("ten vi tri:" + this.tenViTri);
        System.out.println("muc thuong:" + this.mucThuong);
        for (int i = 0; i < this.soLuong; i++) {
            cauThu.xuat();
        }
    }

    public long getMucThuong() {
        return mucThuong;
    }

    public CauThu getCauThu() {
        return cauThu;
    }
}
