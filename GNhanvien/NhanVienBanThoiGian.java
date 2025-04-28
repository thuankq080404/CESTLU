package GNhanvien;

public class NhanVienBanThoiGian extends NhanVien {
    public NhanVienBanThoiGian(String ten, float soGioLam) {
        super(ten, soGioLam);
    }

    @Override
    public float tinhLuong() {
        return soGioLam * 30000;
    }
}