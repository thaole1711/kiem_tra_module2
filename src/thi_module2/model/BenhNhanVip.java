package thi_module2.model;

public class BenhNhanVip extends BenhAn{
    private String loaiVip;

    public BenhNhanVip(int soThuTu, String maBenhAn, String maBenhNhan, String tenBenhAn, int ngayNhapVien, int ngayRaVien, String liDo, String loaiVip) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhAn, ngayNhapVien, ngayRaVien, liDo);
        this.loaiVip = loaiVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    @Override
    public String toString() {
        return super.toString() +
                "loaiVip='" + loaiVip + '\'';
    }

    @Override
    public String getInfo() {
        return super.getInfo()+","+this.loaiVip;
    }
}
