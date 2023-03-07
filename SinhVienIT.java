package bai2_3;

public class SinhVienIT extends SinhVienPoly{
    public double diemJava;
    public double diemCSS;
    public double diemHtml;
    public SinhVienIT(String hoTen,String nganh,double diemJava,double diemCSS, double diemHtml){
        super(hoTen,nganh);
        this.diemJava=diemJava;
        this.diemCSS=diemCSS;
        this.diemHtml=diemHtml;
    }
    public double getDiem(){
        return (2*diemJava + diemHtml + diemCSS)/4;
    }
}