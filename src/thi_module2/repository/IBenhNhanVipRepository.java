package thi_module2.repository;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;

import java.util.List;

public interface IBenhNhanVipRepository {
    List<BenhNhanVip> findAll();
    void add(BenhAn benhAn);
    boolean delete(String id);
}

