package bai1;

public class chuNhat {
    public double rong;
    public double dai;
    
    public chuNhat(double rong,double dai){
        this.dai=dai;
        this.rong=rong;
    }
    public double getChuVi(){
        return (dai+rong)*2;
    }
    public double getDienTich(){
        return (dai*rong);
    }
    public void xuat(){
        System.out.println("Chu vi hinh chu nhat:"+getChuVi());
        System.out.println("Dien tich hinh chu nhat:"+getDienTich());
    }
}
