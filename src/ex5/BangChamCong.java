package ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BangChamCong {
    private List<PhongBan> phongBans;
    private PhongBan phongBan;
    private double luong;
    private int soLuong;

    public BangChamCong(){
        this.phongBan = new PhongBan();
        this.phongBans = new ArrayList<>();
    }

    public void nhap(){
        System.out.println("sô lượng phòng ban");
        this.soLuong = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.soLuong; i++) {
            phongBan.nhap();
            phongBans.add(phongBan);
        }
    }

    public void xuat(){
        for (PhongBan phongBan : phongBans){
            phongBan.xuat();
        }
    }

    public void tinhLuong(){
        for (PhongBan phongBan : phongBans) {
            System.out.println("ma nhan vien:" + phongBan.getEmployee().getMaNhanVien());
            System.out.println("ten nhan vien:" + phongBan.getEmployee().getTen());
            this.luong = 850000*(2 + phongBan.getEmployee().getBacLuong()/3)
                    *phongBan.getHeSoCongViec()*(phongBan.getEmployee().getSoNgayLamViec()/22);
            System.out.printf("lương: " + this.luong);
            System.out.println();
            System.out.println("----------------");
        }
    }
}
