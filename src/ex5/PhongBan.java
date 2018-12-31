package ex5;

import java.util.Scanner;

public class PhongBan {
    private static int ma = 100;
    private int maPhong;
    private String tenPhong;
    private String moTa;
    private int heSoCongViec;
    private Employee employee;
    private int n;

    public PhongBan(){
        this.maPhong = ma++;
        this.employee = new Employee();
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên phòng");
        this.tenPhong = sc.nextLine();
        System.out.println("nhập mô tả");
        this.moTa = sc.nextLine();
        System.out.println("nhập hệ số công việc");
        do {
            this.heSoCongViec = sc.nextInt();
            if (this.heSoCongViec > 20 || this.heSoCongViec < 1){
                System.out.println("trong khoảng 1->20");
            }
        }while (this.heSoCongViec > 20 || this.heSoCongViec < 1);
        System.out.println("số lượng nhân viên:");
        this.n = sc.nextInt();
        for (int i = 0; i < this.n; i++) {
            employee.nhap();
        }
    }

    public void xuat(){
        System.out.println("mã phòng: " + this.maPhong);
        System.out.println("tên phòng: " + this.tenPhong);
        System.out.println("mô tả: " + this.moTa);
        System.out.println("hệ số công việc: " + this.heSoCongViec);
        for (int i = 0; i < this.n; i++) {
            employee.xuat();
        }
    }

    public int getMaPhong() {
        return maPhong;
    }

    public int getHeSoCongViec() {
        return heSoCongViec;
    }

    public Employee getEmployee() {
        return employee;
    }
}
