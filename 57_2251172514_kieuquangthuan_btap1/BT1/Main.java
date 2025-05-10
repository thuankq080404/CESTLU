package GNhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        System.out.flush();
        int soNV = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < soNV; i++) {
            System.out.println("\nNhân viên #" + (i + 1));

            System.out.print("Loại nhân viên (1-Toàn thời gian, 2-Bán thời gian): ");
            System.out.flush();
            String loai = scanner.nextLine();

            System.out.print("Tên nhân viên: ");
            System.out.flush();
            String ten = scanner.nextLine();

            System.out.print("Số giờ làm việc: ");
            System.out.flush();
            float soGio = Float.parseFloat(scanner.nextLine());

            if (loai.equals("1")) {
                danhSachNhanVien.add(new NhanVienToanThoiGian(ten, soGio));
            } else {
                danhSachNhanVien.add(new NhanVienBanThoiGian(ten, soGio));
            }
        }

        // In bảng lương
        System.out.println("\n========== BẢNG LƯƠNG NHÂN VIÊN ==========");
        System.out.printf("%-25s %-15s %-15s\n", "Tên", "Số giờ làm", "Lương (VND)");

        for (NhanVien nv : danhSachNhanVien) {
            System.out.printf("%-25s %-15.2f %-15.0f\n", nv.getTen(), nv.getSoGioLam(), nv.tinhLuong());
        }
    }
}
