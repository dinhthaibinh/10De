package ex3;

import java.util.Scanner;

public class Product {
    private static int id = 1;
    private int idProduct;
    private String name;
    private int group;
    private long cost;

    public Product() {
        this.idProduct = id++;
    }

    public Product(String name, int group, long cost){
        this.idProduct = id++;
        this.name = name;
        this.group = group;
        this.cost = cost;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên hàng:");
        this.name = sc.nextLine();
        System.out.println("lựa chọn nhóm hàng:");
        System.out.printf("1.thoi trang == 2.tieu dung" +
                "3.dien may ==  4.gia dung");
        this.group = sc.nextInt();
        System.out.println("nhập giá bán:");
        this.cost = sc.nextLong();
    }

    public void output() {
        System.out.println("mã hàng: " + this.idProduct);
        System.out.println("tên hàng: " + this.name);
        switch (this.group) {
            case IGroupPruduct.THOI_TRANG:
                System.out.println("thời trang");
                break;
            case IGroupPruduct.DIEN_MAY:
                System.out.println("điện máy");
                break;
            case IGroupPruduct.GIA_DUNG:
                System.out.println("gia dụng");
                break;
            case IGroupPruduct.TIEU_DUNG:
                System.out.println("tiêu dùng");
                break;
        }
        System.out.println("giá bán: " + this.cost);
    }
}
