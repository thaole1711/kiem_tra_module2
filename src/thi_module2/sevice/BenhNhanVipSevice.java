package thi_module2.sevice;

import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;
import thi_module2.repository.BenhNhanVipRepository;
import thi_module2.repository.IBenhNhanVipRepository;

import java.util.List;

public class BenhNhanVipSevice implements IBenhNhanVipRepository {
    IBenhNhanVipRepository iBenhNhanVipRepository = new BenhNhanVipRepository();

    @Override
    public List<BenhNhanVip> findAll() {
        return iBenhNhanVipRepository.findAll();
    }

    @Override
    public void add(BenhAn benhAn) {
        iBenhNhanVipRepository.add(benhAn);
    }

    @Override
    public boolean delete(String id) {
        return iBenhNhanVipRepository.delete(id);
    }
}

