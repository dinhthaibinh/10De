package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddList {
    private List<Product> products;
    private List<Custumer> custumers;
    private Product product;
    private Custumer custumer;
    private int count;


    public AddList() {
        this.custumer = new Custumer();
        this.product = new Product();
        this.products = new ArrayList<>();
        this.custumers = new ArrayList<>();
    }


    public void add() {

        System.out.println("bạn muốn thêm cái gì " +
                "1.hàng hóa" +
                "2.danh sách khách hàng");
        int choose = new Scanner(System.in).nextInt();
        System.out.println("số lượng bạn ei: ");
        this.count = new Scanner(System.in).nextInt();
        switch (choose) {
            case 1:
                for (int i = 0; i < this.count; i++) {
                    product.input();
                    products.add(product);
                }
                break;
            case 2:
                for (int i = 0; i < this.count; i++) {
                    custumer.input();
                    custumers.add(custumer);
                }
                break;
        }
    }


    public void printProduct() {
        for (Product product : products) {
            product.output();
        }
    }

    public void printCustumer() {
        for (int i = 0; i < this.count; i++) {
            custumers.get(i).output();
        }
    }
}
