package ex8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BangSapXep {
    private List<Lop> lops;
    private Lop lop;
    private int soLuong;

    public BangSapXep() {
        this.lop = new Lop();
        this.lops = new ArrayList<>();
    }

    public void nhap() {
        System.out.println("so luong lop can them:");
        this.soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            lop.nhap();
            lops.add(lop);
        }
    }

    public void xuat() {
        for (Lop lop : lops) {
            lop.xuat();
        }
    }
}
