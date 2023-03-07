package bai2_3;

public class SinhVienBiz extends SinhVienPoly {
    public double diemMarketing;
    public double diemSales;
    public SinhVienBiz(String hoTen,String nganh,double diemMarketing,double diemSales){
        super(hoTen,nganh);
        this.diemMarketing=diemMarketing;
        this.diemSales=diemSales;
    }
    public double getDiem(){
        return (2*diemMarketing + diemSales)/3;
    }
}
