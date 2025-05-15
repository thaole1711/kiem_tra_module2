package thi_module2.sevice;

import thi_module2.model.BenhNhanThuong;
import thi_module2.repository.BenhNhanThuongRepository;
import thi_module2.repository.IBenhNhanThuongRepository;

import java.util.List;

public class BenhNhanThuongSevice implements IBenhNhanThuongSevice {
    IBenhNhanThuongRepository iBenhNhanThuongRepository = new BenhNhanThuongRepository();

    @Override
    public List<BenhNhanThuong> findAll() {
        return iBenhNhanThuongRepository.findAll();
    }

    @Override
    public void add(BenhNhanThuong benhNhan) {
        iBenhNhanThuongRepository.add(benhNhan);
    }

    @Override
    public boolean delete(String id) {
 return  iBenhNhanThuongRepository.delete(id);
    }
}
