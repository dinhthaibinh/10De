package ex7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BangPhanCong {
    private List<NhanVien> nhanViens;
    private NhanVien nhanVien;
    private int soLuong;

    public BangPhanCong() {
        this.nhanVien = new NhanVien();
        this.nhanViens = new ArrayList<>();
    }

    public void nhapBang() {
        System.out.println("so luong nhan vien");
        this.soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            nhanVien.nhap();
            nhanViens.add(nhanVien);
        }
    }

    public void xuatBang() {
        for (NhanVien nhanVien : nhanViens) {
            nhanVien.xuat();
        }
    }
}
