package bai1;
import java.util.Scanner;

public class running {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Nhap do dai chieu dai cua hinh chu nhat:");
        double dai=scan.nextDouble();
        System.out.println("Nhap do dai chieu rong cua hinh chu nhat:");
        double rong=scan.nextDouble();
        System.out.println("Nhap canh hinh vuong:");
        double canh=scan.nextDouble();
        chuNhat cn=new chuNhat(dai,rong);
        chuNhat vu=new hinhVuong(canh);
        cn.xuat();
        vu.xuat();
    }
    
}
