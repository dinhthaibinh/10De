package ex7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhanVien {
    private static int ma = 10000;
    private int maNhanVien;
    private String ten;
    private String diaChi;
    private String chuyenNganh;
    private Date ngayBatDauDuAn;
    private Date ngayKetThucDuAn;
    private DuAn duAn;
    private int soLuong;

    public NhanVien(){
        this.maNhanVien = ma++;
        this.duAn = new DuAn();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ten nhan vien:");
        this.ten = sc.nextLine();
        System.out.println("nhap vao dia chi:");
        this.diaChi = sc.nextLine();
        System.out.println("nhap vao chuyen nganh:");
        this.chuyenNganh = sc.nextLine();
        System.out.println("ngay bat dau du an:");
        String ngay = sc.nextLine();
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayBatDauDuAn = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("ngay ket thuc su an:");
        String ngay2 = sc.nextLine();
        try {
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            this.ngayBatDauDuAn = df.parse(ngay2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("sp luong du an cho nhan vien nay:");
        this.soLuong = sc.nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            duAn.nhap();
        }
    }

    public void xuat(){
        System.out.println("ma nhan vien:" +this.maNhanVien);
        System.out.println("ten nhan vien:" + this.ten);
        System.out.println("dia chi:" + this.diaChi);
        System.out.println("chuyen nganh:" + this.chuyenNganh);
        System.out.println("ngay bat dau:" + this.ngayBatDauDuAn);
        System.out.println("ngay ket thuc:" + this.ngayKetThucDuAn);
        for (int i = 0; i < this.soLuong; i++) {
            duAn.xuat();
        }
    }
}
