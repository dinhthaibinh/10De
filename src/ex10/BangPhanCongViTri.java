package ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BangPhanCongViTri {
    private List<ViTri> viTris;
    private ViTri viTri;
    private int soLuongViTri;
    private double tongTien;

    public BangPhanCongViTri(){
        this.viTri = new ViTri();
        this.viTris = new ArrayList<>();
    }

    public void nhapBang(){
        System.out.println("nhap so luong:");
        this.soLuongViTri = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuongViTri; i++) {
            viTri.nhap();
            viTris.add(viTri);
        }
    }

    public void xuatBang(){
        for (ViTri viTri : viTris) {
            viTri.xuat();
        }
    }

    public double tinhTien(){
        for (ViTri viTri : viTris) {
            this.tongTien += (viTri.getMucThuong() + 0.1*viTri.getCauThu().getMucLuong());
        }
        return this.tongTien;
    }
}
