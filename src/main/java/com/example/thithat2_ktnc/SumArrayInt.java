package com.example.thithat2_ktnc;

public class SumArrayInt {
    public static int tinhTongSoChanTu1_50VaBoQuaChiaHetCho8(int[] arr) {

        if (arr.length<1 && arr.length>50){
            throw new IllegalArgumentException("Mảng dài từ 1 đến 50");
        } else if (arr == null) {
            throw new IllegalArgumentException("null");
        }

        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 8 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
