import java.text.ParseException;
import java.util.Scanner;

public class MainTestDrive {
    public static void main(String[] args) throws ParseException {
        DSHH DSHH = new DSHH();
        Scanner nhap = new Scanner(System.in);
        int chon;
        DSHH.them("Do Ngot", 001, "kẹo mút", 1000, 1500, "01-01-2020");
        DSHH.them("Bot", 010, "bột năng", 12000, 1000, "10-01-2020");
        DSHH.them("Do Ngot", 011, "kẹo mentos", 4500, 1500, "15-01-2020");
        DSHH.them("Bot", 100, "Bột mì đa dụng", 15000, 1000, "15-06-2020");
        DSHH.them("Nuoc Ngot", 101, "CaCoLa", 7000, 1500, "01-03-2020");
        DSHH.them("Do Ngot", 110, "Bánh snack", 6500, 1800, "30-8-2020");
        DSHH.them("Bot", 002, "Bột chiên dòn", 20000, 1100, "01-03-2020");
        DSHH.them("Do Ngot", 020, "Bánh Oshi", 4500, 1500, "01-01-2020");
        DSHH.them("Bot", 200, "Bột gạo", 15000, 1600, "10-03-2021");
        DSHH.them("Nuoc Ngot", 202, "pepsi", 7500, 1300, "10-04-2020");
        DSHH.them("Do Ngot", 220, "kẹo sugust", 1500, 1200, "10-04-2021");
        DSHH.them("Bot", 022, "bột bánh xèo", 1500, 1300, "10-05-2020");
        DSHH.them("Do Ngot", 003, "Kẹo dẻo", 4500, 1300, "15-06-2021");
        DSHH.them("Nuoc Ngot", 030, "7 up", 7500, 1200, "10-06-2021");
        DSHH.them("Do Ngot", 033, "1sing gum", 2000, 1250, "05-05-2020");
        DSHH.them("Bot", 300, "Bột Chiên xù", 13000, 1300, "20-09-2021");
        DSHH.them("Nuoc Ngot", 303, "Mirinda", 7000, 1300, "20-12-2011");
        DSHH.them("Do Ngot", 330, "Kẹo Bông Gòn", 2500, 1400, "20-12-2020");
        DSHH.them("Bot", 004, "Bột mì số 8", 12000, 1000, "01-01-2020");
        DSHH.them("Nuoc Ngot", 040, "C2", 5500, 1500, "10-11-2021");
        do {
            System.out.println("===================MENU===================");
            System.out.println(">>1: Thêm hàng hoá mới vào đầu danh sách kho.");
            System.out.println(">>2: Thêm hàng hoá mới vào cuối danh sách kho.");
            System.out.println(">>3: Thêm hàng hoá mới vào trước một hàng hoá tìm được.");
            System.out.println(">>4: Xoá hàng hoá ở đầu danh sách.");
            System.out.println(">>5: Xoá hàng hoá ở cuối danh sách.");
            System.out.println(">>6: Xoá hàng hoá ở một vị trí bất kì.");
            System.out.println(">>7: Sửa thông tin của hàng hoá trong kho.");
            System.out.println(">>8: Tìm kiếm hàng hoá theo loại.");
            System.out.println(">>9: Tìm kiếm hàng hoá theo khoảng giá.");
            System.out.println(">>10: Tìm kiếm hàng hoá theo khoang thời gian nhập hàng.");
            System.out.println(">>11: Sắp xếp hàng hoá tăng dần theo giá.");
            System.out.println(">>12: Sắp xếp hàng hoá giảm dần theo giá.");
            System.out.println(">>13: Sắp xếp hàng hoá tăng dần theo ngày.");
            System.out.println(">>14: Sắp xếp hàng hoá giảm dần theo ngày.");
            System.out.println(">>15: Sắp xếp hàng hoá theo loại.");
            System.out.println(">>16: Sắp xếp hàng hoá theo loại và tăng dần theo ngày nhập.");
            System.out.println(">>17: Sắp xếp hàng hoá theo loại và giảm dần theo ngày nhập.");
            System.out.println(">>18: Sắp xếp hàng hoá theo loại và tăng dần theo giá.");
            System.out.println(">>19: Sắp xếp hàng hoá theo loại và giảm dần theo giá.");
            System.out.println(">>20: Thống kê tổng số lượng hàng hoá trong kho.");
            System.out.println(">>21: Thống kê tổng giá trị của hàng hoá trong kho.");
            System.out.println(">>22: Thống kê số lượng hàng hoá của từng loại hàng.");
            System.out.println(">>23: In danh sách hàng hoá trong kho.");
            System.out.println(">>24: Kết thúc.");
            System.out.println("==========================================");
            System.out.print("- Nhập vào sự lựa chọn(1 -> 24): ");
            chon = nhap.nextInt();
            switch (chon) {
                case 1:
                    DSHH.themDau();
                    break;
                case 2:
                    DSHH.themCuoi();
                    break;
                case 3:
                    DSHH.themTruoc();
                    break;
                case 4:
                    DSHH.xoaDau();
                    break;
                case 5:
                    DSHH.xoaCuoi();
                    break;
                case 6:
                    DSHH.xoa();
                    break;
                case 7:
                    DSHH.suaThongTin();
                    break;
                case 8:
                    DSHH.timKiemTheoLoai();
                    break;
                case 9:
                    DSHH.timKiemTheoGia();
                    break;
                case 10:
                    DSHH.timKiemtheoNgay();
                    break;
                case 11:
                    DSHH.tangDanTheoGia();
                    break;
                case 12:
                    DSHH.giamDanTheoGia();
                    break;
                case 13:
                    DSHH.tangTheoNgay();
                    break;
                case 14:
                    DSHH.giamTheoNgay();
                    break;
                case 15:
                    System.out.println("- Sắp xếp hàng hoá theo loại hàng: ");
                    DSHH.xepTheoLoai();
                    System.out.println("+ Sắp xếp thành công.");
                    break;
                case 16:
                    DSHH.loaiVaNgayTang();
                    break;
                case 17:
                    DSHH.loaiVaNgayGiam();
                    break;
                case 18:
                    DSHH.loaiVaGiaTang();
                    break;
                case 19:
                    DSHH.loaiVaGiaGiam();
                    break;
                case 20:
                    DSHH.tongSL();
                    break;
                case 21:
                    DSHH.tongGT();
                    break;
                case 22:
                    DSHH.soLuong();
                    break;
                case 23:
                    DSHH.in();
                    break;
                case 24:
                    System.out.println("- KẾT THÚC!!!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại!");
            }
            System.out.print("- Quay lại MENU chính(1:yes/0:no): ");
            chon = nhap.nextInt();
        } while (chon == 1);
        nhap.close();
    }

}
