package thi_module2.repository;

import thi_module2.common.ReadAndWriteFileCSV;
import thi_module2.model.BenhAn;
import thi_module2.model.BenhNhanThuong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BenhNhanThuongRepository implements IBenhNhanThuongRepository {
    private final String stringPath = "D:\\codegym\\model2\\bai_kiem_tra_module_2\\src\\thi_module2\\data\\benhNhanThuong.csv";

    @Override
    public List<BenhNhanThuong> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.ReadFileCSV(stringPath);
        List<BenhNhanThuong> benhNhanThuongs = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            benhNhanThuongs.add(new BenhNhanThuong(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), arr[6], Double.parseDouble(arr[7])));
        }
        return benhNhanThuongs;

    }

    @Override
    public void add(BenhAn benhAn) {
        ReadAndWriteFileCSV.WriteFileCSV(stringPath, Arrays.asList(benhAn.getInfo()), true);
    }

    @Override
    public boolean delete(String id) {
        boolean found= false;
        List<BenhNhanThuong> benhNhanThuongs= findAll();
        for (int i = 0; i <benhNhanThuongs.size() ; i++) {
            if(benhNhanThuongs.get(i).getMaBenhAn().equals(id)){
                benhNhanThuongs.remove(i);
                found =true;
                break;

            }
        }
        if(found) {
           List<String> stringList= new ArrayList<>();
            for (int i = 0; i < benhNhanThuongs.size(); i++) {
                stringList.add(benhNhanThuongs.get(i).getInfo());
            }
            ReadAndWriteFileCSV.WriteFileCSV(stringPath,stringList,false);

            }
        return found;


    }
}
