package com.example.thithat2_ktnc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {

    NhanVienService service = new NhanVienService();

    @Test
    public void testUpdateTenNhanVien() {
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        service.updateNhanVien(nv, "NV001", "Jane Doe", 25, 500000, 5, "Phong 1");
        assertEquals("Jane Doe", nv.getTen());
    }

    @Test
    public void testUpdateTuoiNhanVien() {
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        service.updateNhanVien(nv, "NV001", "John Doe", 30, 500000, 5, "Phong 1");
        assertEquals(30, nv.getTuoi());
    }

    @Test
    public void testUpdateLuongNhanVien() {
            NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
            service.updateNhanVien(nv, "NV001", "John Doe", 25, 600000, 5, "Phong 1");
            assertEquals(600000, nv.getLuong());

    }

    @Test
    public void testUpdateLuongNhanVien150() {
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        service.updateNhanVien(nv, "NV001", "John Doe", 25, 150, 5, "Phong 1");
        assertEquals(150, nv.getLuong());

    }

    @Test
    public void testUpdateSoNamLamNhanVien() {
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        service.updateNhanVien(nv, "NV001", "John Doe", 25, 500000, 6, "Phong 1");
        assertEquals(6, nv.getSoNamLamViec());
    }

    @Test
    public void testUpdatePhongBanNhanVien() {
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        service.updateNhanVien(nv, "NV001", "John Doe", 25, 500000, 5, "Phong 2");
        assertEquals("Phong 2", nv.getPhongBan());
    }

    @Test
    public void testTuoiLonHon70(){
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        assertThrows(IllegalArgumentException.class, ()-> service.updateNhanVien(nv, "NV001", "John Doe", 75, 500000, 5, "Phong 1"));
    }

    @Test
    public void testLuongToiThieu(){
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        assertThrows(IllegalArgumentException.class, ()-> service.updateNhanVien(nv, "NV001", "John Doe", 25, 0, 5, "Phong 1"));
    }

    @Test
    public void testSoNamLamToiThieu(){
        NhanVien nv = new NhanVien("NV001", "John Doe", 25, 500000, 5, "Phong 1");
        assertThrows(IllegalArgumentException.class, ()-> service.updateNhanVien(nv, "NV001", "John Doe", 25, 500000, 0, "Phong 1"));
    }

}