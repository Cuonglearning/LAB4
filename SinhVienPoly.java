package bai2_3;

public abstract class SinhVienPoly {
    public String hoTen;
    public String nganh;
    
    public SinhVienPoly(String hoTen,String nganh){
        this.hoTen=hoTen;
        this.nganh=nganh;
    }
    abstract double getDiem();
    public  String getHocLuc(){
        if (getDiem()<5&&getDiem()>0){
            return "Hoc luc yeu";
        }
        if (getDiem()>=5&&getDiem()<6.5){
            return "Hoc luc trung binh";
        }
        if (getDiem()>=6.5&&getDiem()<7.5){
            return "Hoc luc kha";
        }
        if (getDiem()>=7.5&&getDiem()<9){
            return "Hoc luc gioi";
        }
        if (getDiem()>=9&&getDiem()<=10){
            return "Hoc luc xuat sac";
        }
        else return "Diem khong hop le";
    }
    public void xuat(){
        System.out.println("Ho va ten:"+hoTen);
        System.out.println("Nganh:"+nganh);
        System.out.println("Diem:"+getDiem());
        System.out.println("Hoc luc:"+getHocLuc());
    }
}
