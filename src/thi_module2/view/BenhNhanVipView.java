package thi_module2.view;

import thi_module2.common.RegularExpression;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;
import thi_module2.model.LoaiVip;

import java.util.List;
import java.util.Scanner;

public class BenhNhanVipView {
    private static Scanner scanner =new Scanner(System.in);
    public static void findAll(List<BenhNhanVip> benhNhanVips){
        for (int i = 0; i < benhNhanVips.size(); i++) {
            System.out.println(benhNhanVips);
        }

    }
    public static BenhNhanVip add(){
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
        String lido= scanner.nextLine();
        System.out.println("nhap loai vip");
        String loaiVip = scanner.nextLine();
//        int chon = 0;
//        do {
//            for (int i = 0; i < loaiVips.size(); i++) {
//                System.out.println(i + 1 + "." + loaiVips.get(i).getStt() + loaiVips.get(i).getVip());
//            }
//            System.out.println("nhap so ban chon:");
//            try {
//                chon = Integer.parseInt(scanner.nextLine());
//                for (int i = 0; i < loaiVips.size(); i++) {
//                    if (chon >= i + 1 && chon <= loaiVips.size()) {
//                        loaiVip = loaiVips.get(chon - 1).getVip();
//                        break;
//                    }
//                    if (chon < 1 || chon > loaiVips.size()) {
//                        System.out.println("nhap lai so :");
//                    }
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("vui long nhap so");
//            }
//        } while (chon < 1 || chon > loaiVips.size());

        BenhNhanVip benhNhanVip= new BenhNhanVip(stt,maBenhAn,maBenhNhan,ten,ngayNhap,ngayXuat,lido,loaiVip);
        return benhNhanVip;
    }
    public static String delete(){
        System.out.println("nhap ma benh ban muon xoa:");
        String ma = scanner.nextLine();
        return ma;
    }

}
