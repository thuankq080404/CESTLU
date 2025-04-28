package GNhanvien;

public abstract class NhanVien {
    protected String ten;
    protected float soGioLam;

    public NhanVien(String ten, float soGioLam) {
        this.ten = ten;
        this.soGioLam = soGioLam;
    }

    public abstract float tinhLuong();

    public String getTen() {
        return ten;
    }

    public float getSoGioLam() {
        return soGioLam;
    }
}