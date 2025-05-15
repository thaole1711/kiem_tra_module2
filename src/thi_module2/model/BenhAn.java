package thi_module2.model;

public abstract class BenhAn  {
    protected int soThuTu;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhAn;
    protected int ngayNhapVien;
    protected int ngayRaVien;
    protected String liDo;

    public BenhAn(int soThuTu, String maBenhAn,String maBenhNhan, String tenBenhAn, int ngayNhapVien, int ngayRaVien, String liDo) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.tenBenhAn = tenBenhAn;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.liDo = liDo;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getTenBenhAn() {
        return tenBenhAn;
    }

    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }

    public int getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(int ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public int getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(int ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLiDo() {
        return liDo;
    }

    public void setLiDo(String liDo) {
        this.liDo = liDo;
    }

    @Override
    public String toString() {
        return
                "soThuTu=" + soThuTu +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", tenBenhAn='" + tenBenhAn + '\'' +
                ", ngayNhapVien=" + ngayNhapVien +
                ", ngayRaVien=" + ngayRaVien +
                ", liDo='" + liDo + '\'';
    }
    public String getInfo(){
        return this.soThuTu+","+this.maBenhAn+","+this.maBenhAn+","+this.tenBenhAn+","+this.ngayNhapVien+","+this.ngayRaVien+","+this.liDo;
    }
}
