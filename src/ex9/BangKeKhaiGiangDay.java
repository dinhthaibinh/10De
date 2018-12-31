package ex9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BangKeKhaiGiangDay {
    private List<GiangVien> giangViens;
    private GiangVien giangVien;
    private int soLuong;

    public BangKeKhaiGiangDay(){
        this.giangVien = new GiangVien();
        this.giangViens = new ArrayList<>();
    }

    public void nhapBang(){
        System.out.println("so luong giao vien:");
        this.soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            giangVien.nhap();
            giangViens.add(giangVien);
        }
    }

    public void xuatBang(){
        for (GiangVien giangVien : giangViens) {
            giangVien.xuat();
        }
    }
}
