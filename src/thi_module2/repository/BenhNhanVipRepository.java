package thi_module2.repository;

import thi_module2.common.ReadAndWriteFileCSV;
import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BenhNhanVipRepository implements IBenhNhanVipRepository {
    private final String stringPath = "D:\\codegym\\model2\\bai_kiem_tra_module_2\\src\\thi_module2\\data\\benhNhanVip.csv";

    @Override
    public List<BenhNhanVip> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        List<BenhNhanVip> benhNhanVips = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            benhNhanVips.add(new BenhNhanVip(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], (arr[7])));
        }
        return benhNhanVips;
    }

    @Override
    public void add(BenhAn benhAn) {
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, Arrays.asList(benhAn.getInfo()), true);
    }

    @Override
    public boolean delete(String id) {
        boolean found= false;
        List<BenhNhanVip> benhNhanVips= findAll();
        for (int i = 0; i <benhNhanVips.size() ; i++) {
            if(benhNhanVips.get(i).getMaBenhAn().equals(id)){
                benhNhanVips.remove(i);
                found =true;
                break;

            }
        }
        if(found) {
            List<String> stringList= new ArrayList<>();
            for (int i = 0; i < benhNhanVips.size(); i++) {
                stringList.add(benhNhanVips.get(i).getInfo());
            }
            ReadAndWriteFileCSV.WriteFileCSV(stringPath,stringList,false);

        }
        return found;

    }
}
