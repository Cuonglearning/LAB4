package bai1;

public class hinhVuong extends chuNhat{
    public hinhVuong(double canh){
        super(canh,canh);
    }
    public void xuat(){
        System.out.println("Chu vi hinh vuong:"+getChuVi());
        System.out.println("Dien tich hinh vuong"+getDienTich());
    }
}
