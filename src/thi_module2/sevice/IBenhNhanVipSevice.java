package thi_module2.sevice;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;

import java.util.List;

public interface IBenhNhanVipSevice {
    List<BenhNhanVip> findAll();
    void add(BenhAn benhAn);
    boolean delete(String id);
}

