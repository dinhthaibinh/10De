package ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyThietBi {
    private List<PhongHoc> phongHocs;
    private PhongHoc phongHoc;
    private int soLuong;

    public QuanLyThietBi(){
        this.phongHoc = new PhongHoc();
        this.phongHocs = new ArrayList<>();
    }

    public void nhapDanhSach(){
        System.out.println("so luong phong hoc can them thiet bi:");
        this.soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            phongHoc.nhap();
            phongHocs.add(phongHoc);
        }
    }

    public void xuatDanhSach(){
        for (PhongHoc phongHoc : phongHocs) {
            phongHoc.xuat();
        }
    }
}
