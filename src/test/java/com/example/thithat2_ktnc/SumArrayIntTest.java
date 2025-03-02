package com.example.thithat2_ktnc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayIntTest {
    SumArrayInt test = new SumArrayInt();


    @Test
    public void testMang(){
        int[] mang = {1, 2, 3, 4, 5};
        int expected = 15;
        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangDu(){
        int[] mang = {1, 2, 3, 4, 5};
        int expected = 482;
        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangRong(){
        int[] mang = {};
        int expected = 0;
        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangChuaSoChan(){
        int[] mang = {1, 3, 5, 7, 9};
        int expected = 0;
        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangChuaSoBoQuaChiaHetCho8(){
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        int expected = 0;
        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangNhoHon1EX(){
        int[] mang = {1, 2, 3};
        int expected = 0;
//        assertEquals(expected, test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
        assertThrows(IllegalAccessError.class, () -> test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(new int[]{51}));
    }

    @Test
    public void testMangLonHon50EX(){
        int[] mang = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
        int expected = 0;
        assertThrows(IllegalArgumentException.class, () -> test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }

    @Test
    public void testMangNull(){
        int[] mang = null;
        int expected = 0;
        assertThrows(IllegalArgumentException.class, () -> test.tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(mang));
    }
}