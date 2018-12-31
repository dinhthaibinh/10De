package ex3;

import java.util.Scanner;

public class Custumer {
    private static long id = 11111;
    private long idCustumer;
    private String name;
    private String address;
    private String phoneNumber;
    private Product product;
    private int count;

    public Custumer() {
        this.idCustumer = id++;
        this.product = new Product();
    }

    public long getIdCustumer() {
        return idCustumer;
    }

    public void setIdCustumer(long idCustumer) {
        this.idCustumer = idCustumer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào tên khách hàng:");
        this.name = sc.nextLine();
        System.out.println("nhập vào địa chỉ khách hàng:");
        this.address = sc.nextLine();
        System.out.println("nhập vào số điên thoại khách hàng");
        this.phoneNumber = sc.nextLine();
        System.out.println("số lượng sản phẩm mua của khách hàng:");
        this.count = new Scanner(System.in).nextInt();
        for (int i = 0; i < this.count; i++) {
            product.input();
        }
    }

    public void output() {
        System.out.println("mã khách hàng: " + this.idCustumer);
        System.out.println("tên khách hang: " + this.name);
        System.out.println("địa chỉ khách: " + this.address);
        System.out.println("số điện thoại: " + this.phoneNumber);
        for (int i = 0; i < this.count; i++) {
            product.output();
        }
    }
}
