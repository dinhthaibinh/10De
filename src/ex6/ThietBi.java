package ex6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ThietBi {
    private static int ma = 10000;
    private int maThietbi;
    private String ten;
    private String xuatXu;
    private Date namSanXuat;
    private int tinhTrang;
    private int soLuong;

    public ThietBi() {
        this.maThietbi = ma++;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten thiet bi:");
        this.ten = sc.nextLine();
        System.out.println("nhap noi san xuat:");
        this.xuatXu = sc.nextLine();
        System.out.println("nhap ngay san xuat:");
        String ngay = sc.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.namSanXuat = df.parse(ngay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("so luong:");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("cu hay moi:");
        this.tinhTrang = new Scanner(System.in).nextInt();
    }

    public void xuat(){
        System.out.println("ma thiet bi:" + this.maThietbi);
        System.out.println("ten thiet bi:" + this.ten);
        System.out.println("noi san xuat:" + this.xuatXu);
        System.out.println("ngay san xuat:" + this.namSanXuat);
        System.out.println("so luong:" + this.soLuong);
        System.out.printf("tinh trang:");
        switch (this.tinhTrang) {
            case ITinhTrang.CU:
                System.out.println("cu");
                break;
            case ITinhTrang.MOI:
                System.out.println("moi");
                break;
        }
    }
}
