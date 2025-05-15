package thi_module2.model;

public class BenhNhanThuong extends BenhAn{
    private double phi;
    public BenhNhanThuong(int soThuTu, String maBenhAn,String maBenhNhan, String tenBenhAn, int ngayNhapVien, int ngayRaVien, String liDo, double phi) {
        super(soThuTu, maBenhAn,maBenhNhan, tenBenhAn, ngayNhapVien, ngayRaVien, liDo);
        this.phi = phi;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    @Override
    public String toString() {
        return super.toString() +
                "phi=" + phi ;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+","+this.phi;
    }
}
