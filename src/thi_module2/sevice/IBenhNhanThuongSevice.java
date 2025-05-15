package thi_module2.sevice;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;

import java.util.List;

public interface IBenhNhanThuongSevice {
    List<BenhNhanThuong> findAll();
    void add(BenhNhanThuong benhNhan);
    boolean delete(String id);
}
