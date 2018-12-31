package ex9;

import java.util.Scanner;

public class GiangVien {
    private static int ma = 100;
    private int maGiangVien;
    private String ten;
    private String diaChi;
    private int trinhDo;
    private MonHoc monHoc;
    private int soLuong;

    public GiangVien() {
        this.maGiangVien = ma++;
        this.monHoc = new MonHoc();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ten giang vien:");
        this.ten = sc.nextLine();
        System.out.println("dia chi:");
        this.diaChi = sc.nextLine();
        System.out.println("trinh do:");
        this.trinhDo = sc.nextInt();
        System.out.println("so luong mon day cua giang vien:");
        this.soLuong = sc.nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            monHoc.nhap();
        }
    }

    public void xuat() {
        System.out.println("ma giang vien:" + this.maGiangVien);
        System.out.println("ten:" + this.ten);
        System.out.println("dia chi:" + this.diaChi);
        System.out.println("trinh do:" + this.trinhDo);
        switch (this.trinhDo) {
            case ITrinhDo.GS_TS:
                System.out.println("GS_TS");
                break;
            case ITrinhDo.PGS_TS:
                System.out.println("PGS_TS");
                break;
            case ITrinhDo.GIANG_VIEN_CHINH:
                System.out.println("giang vien chinh");
                break;
            case ITrinhDo.THAC_SI:
                System.out.println("thac si");
                break;
        }
        for (int i = 0; i < this.soLuong; i++) {
            monHoc.xuat();
        }
    }


}
