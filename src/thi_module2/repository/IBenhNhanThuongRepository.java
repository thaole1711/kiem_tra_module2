package thi_module2.repository;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;

import java.util.List;

public interface IBenhNhanThuongRepository {
    List<BenhNhanThuong> findAll();
    void add(BenhAn benhAn);
    boolean delete(String id);
}
