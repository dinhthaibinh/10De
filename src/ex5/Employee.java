package ex5;

import java.util.Scanner;

public class Employee {
    private static int ma = 1000;
    private int maNhanVien;
    private String ten;
    private String diaChi;
    private String soDienThoai;
    private int bacLuong;
    private int soNgayLamViec;

    public Employee(){
        this.maNhanVien = ma++;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên");
        this.ten = sc.nextLine();
        System.out.println("nhập địa chỉ");
        this.diaChi = sc.nextLine();
        System.out.println("nhập số điện thoại");
        this.soDienThoai = sc.nextLine();
        System.out.println("nhập bậc lương");
        do {
            this.bacLuong = sc.nextInt();
            if (this.bacLuong > 9){
                System.out.println("chỉ từ 1 -> 9");
            }
        }while (this.bacLuong > 9);
        System.out.println("số ngày làm việc");
        this.soNgayLamViec = sc.nextInt();
    }

    public void xuat(){
        System.out.println("mã nhân viên: " + this.maNhanVien);
        System.out.println("tên: " + this.ten);
        System.out.println("địa chỉ: " + this.diaChi);
        System.out.println("số điện thoại: " + this.soDienThoai);
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public String getTen() {
        return ten;
    }
}
