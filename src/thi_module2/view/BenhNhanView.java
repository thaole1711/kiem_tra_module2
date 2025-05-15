package thi_module2.view;

import thi_module2.common.RegularExpression;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.LoaiVip;

import java.util.List;
import java.util.Scanner;

public class BenhNhanView {
    private static Scanner scanner= new Scanner(System.in);
    public static void findAll(List<BenhNhanThuong> benhNhanThuongs){
        for (int i = 0; i < benhNhanThuongs.size(); i++) {
            System.out.println(benhNhanThuongs);
        }

    }
    public static BenhNhanThuong add(){
        System.out.println("nhap số thứ tự:");
        int stt= Integer.parseInt(scanner.nextLine());
        String maBenhAn= RegularExpression.checkMaBenhAn(scanner,"nhập mã bênh án[BA-XXX]");
        String maBenhNhan= RegularExpression.ckeckMaBenhNhan(scanner,"nhập mã bênh nhan[BN-XXX]");
        String ten= RegularExpression.checkName(scanner,"nhap ten[Nguyen Van A]");
        System.out.println("nhap ngay nhap vien:");
        int ngayNhap=Integer.parseInt(scanner.nextLine());
        System.out.println("nhap ngay xuat vien:");
        int ngayXuat=Integer.parseInt(scanner.nextLine());
        System.out.println("li do nhap vien");
        String lido=scanner.nextLine();
        System.out.println("nhap phi:");
        double phi= Double.parseDouble(scanner.nextLine());
        BenhNhanThuong benhNhanThuong= new BenhNhanThuong(stt,maBenhAn,maBenhNhan,ten,ngayNhap,ngayXuat,lido,phi);
        return benhNhanThuong;


    }
    public static String delete(){
        System.out.println("nhap ma benh ban muon xoa:");
        String ma = scanner.nextLine();
        return ma;
    }

}
