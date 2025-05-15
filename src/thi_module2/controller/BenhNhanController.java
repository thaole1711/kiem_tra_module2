package thi_module2.controller;

import thi_module2.common.ExceptionMenu;
import thi_module2.model.BenhNhanThuong;
import thi_module2.model.BenhNhanVip;
import thi_module2.model.LoaiVip;
import thi_module2.sevice.BenhNhanThuongSevice;
import thi_module2.sevice.BenhNhanVipSevice;
import thi_module2.sevice.LoaiVipSevice;
import thi_module2.view.BenhNhanView;
import thi_module2.view.BenhNhanVipView;

import java.util.List;
import java.util.Scanner;

public class BenhNhanController {
    private static Scanner scanner = new Scanner(System.in);
    private static BenhNhanThuongSevice benhNhanThuongSevice = new BenhNhanThuongSevice();
    private static BenhNhanVipSevice benhNhanVip = new BenhNhanVipSevice();

    public static void displayMenu() {
        boolean flag = true;
        do {
            int number = 0;

            System.out.println(" CHƯƠNG TRINH QUẢN LÍ BỆNH ÁN ");
            System.out.println(
                    "\n 1.thêm mới bệnh nhân" +
                            "\n 2. hiện thị thông tin bệnh nhân" +
                            "\n 3.xoa khach hang" +
                            "\n 4. thoát");
            number = ExceptionMenu.exception(scanner, "chức năng bạn chon là:");
            switch (number) {
                case 1:
                    addBenhnhan();
                    break;
                case 2:
                    List<BenhNhanThuong> benhNhanThuongs = benhNhanThuongSevice.findAll();
                    BenhNhanView.findAll(benhNhanThuongs);
                    List<BenhNhanVip> benhNhanVips = benhNhanVip.findAll();
                   BenhNhanVipView.findAll(benhNhanVips);
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.out.println("thoát chương trình");
                    flag = false;
                    break;
                default:
                    System.out.println("nhập lại từ 1 đến 4");
            }
        } while (flag);
    }

    public static void addBenhnhan() {
        boolean flag = true;
        do {
            int number;
            System.out.println("chọn bệnh nhân bạn muốn thêm mới");
            System.out.println(
                    "\n 1.thêm bênh nhân thường" +
                            "\n 2. thêm bệnh nhân vip" +
                            "\n 3. thoát");
            number = ExceptionMenu.exception(scanner, "chức năng bạn chọn là:");
            switch (number) {
                case 1:
                    BenhNhanThuong benhNhanThuong = BenhNhanView.add();
                    benhNhanThuongSevice.add(benhNhanThuong);
                    break;
                case 2:
                   BenhNhanVip benhNhanVip1= BenhNhanVipView.add();
                   benhNhanVip.add(benhNhanVip1);
                    break;

                case 3:
                    System.out.println("thoat chuong trinh");
                    flag = false;
                    break;
                default:
                    System.out.println("nhap lai so tu 1 den 3");
            }

        } while (flag);
    }

    public static void delete() {
        boolean flag = true;
        do {
            int number;
            System.out.println("chọn bệnh nhân bạn muốn xoa");
            System.out.println(
                    "\n 1.xoa bênh nhân thường" +
                            "\n 2. xoa bệnh nhân vip" +
                            "\n 3. thoát");
            number = ExceptionMenu.exception(scanner, "chức năng bạn chọn là:");
            switch (number) {
                case 1:
                    String ma = BenhNhanView.delete();
                    boolean found = benhNhanThuongSevice.delete(ma);
                    if (found) {
                        System.out.println("xoa thanh cong");
                    } else {
                        System.out.println("ma benh an ton tai");
                    }
                    break;
                case 2:
                    String maVip = BenhNhanVipView.delete();
                    boolean foundVip = benhNhanThuongSevice.delete(maVip);
                    if (foundVip) {
                        System.out.println("xoa thanh cong");
                    } else {
                        System.out.println("ma benh an ton tai");
                    }
                    break;
                case 3:
                    System.out.println("thoat chuong trinh");
                    flag = false;
                    break;
                default:
                    System.out.println("nhap lai so tu 1 den 3");
            }
        } while (flag);

    }
}
