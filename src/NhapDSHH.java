import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NhapDSHH {
    String loai;
    int maHang;
    String tenHH;
    double giaNhap;
    int soLuongTonKho;
    Date ngayNhapKho;
    NhapDSHH next;
    static Scanner nhap = new Scanner(System.in);
    SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");

    // hàm tạo
    NhapDSHH() {

    }

    NhapDSHH(String l, int id, String name, double money, int sl, String nn) {
        loai = l;
        maHang = id;
        tenHH = name;
        giaNhap = money;
        soLuongTonKho = sl;
        try {
            ngayNhapKho = date.parse(nn);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // hàm nhập thông tin
    public void inThongTin() {
        System.out.println("=========================================");
        System.out.println("- Loại: " + loai);
        System.out.println("- Mã hàng: " + maHang);
        System.out.println("- Tên hàng hoá: " + tenHH);
        System.out.printf("- Giá bán: %.1f đồng \n", giaNhap);
        System.out.println("- Số lượng tồn kho: " + soLuongTonKho);
        System.out.println("- Ngày nhập: " + date.format(ngayNhapKho));
        System.out.println("==========================================");
    }

    public void nhapThongTin() throws ParseException {
        System.out.println("========================");
        System.out.print("+ Nhập loại hàng hoá: ");
        loai = nhap.nextLine();
        System.out.print("+ Nhập mã hàng hoá: ");
        maHang = nhap.nextInt();
        System.out.print("+ Nhập tên hàng hoá: ");
        nhap.nextLine();
        tenHH = nhap.nextLine();
        System.out.print("+ Nhập giá bán: ");
        giaNhap = nhap.nextDouble();
        System.out.print("+ Nhập số lượng: ");
        soLuongTonKho = nhap.nextInt();
        nhap.nextLine();
        System.out.print("+ Nhập ngày nhập hàng: ");
        ngayNhapKho = date.parse(nhap.nextLine());
        System.out.println("========================");
    }

}
    
}
