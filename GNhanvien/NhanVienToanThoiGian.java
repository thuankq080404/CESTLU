package GNhanvien;

public class NhanVienToanThoiGian extends NhanVien {
    public NhanVienToanThoiGian(String ten, float soGioLam) {
        super(ten, soGioLam);
    }

    @Override
    public float tinhLuong() {
        return soGioLam * 50000;
    }
}