package com.example.thithat2_ktnc;

public class NhanVienService {
//    NhanVien nv = new NhanVien();

    public void updateNhanVien(NhanVien nv, String ma, String ten, int tuoi, float luong, int soNamLam, String phongBan){
            if(ma == null || ma.isEmpty() || ten == null || ten.isEmpty() || phongBan == null || phongBan.isEmpty()){
                throw new IllegalArgumentException("khong de trong ");
            }

            if(tuoi < 18 || tuoi > 65){
                throw new IllegalArgumentException(" tuoi phai tu 18-65 ");
            }

            if(luong < 100 || luong > 1000){
                throw new IllegalArgumentException("luong tu 100 den 1000");
            }

        nv.setMaNV(ma);
        nv.setTen(ten);
        nv.setTuoi(tuoi);
        nv.setLuong(luong);
        nv.setSoNamLamViec(soNamLam);
        nv.setPhongBan(phongBan);
        System.out.println("Cập nhật thành công!");
    }
}
