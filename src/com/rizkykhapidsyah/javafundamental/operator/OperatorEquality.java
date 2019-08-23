package com.rizkykhapidsyah.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int Value1 = 5;
        int Value2 = 4;
        boolean Hasil;

        System.out.println("Sama Dengan..");
        Hasil = Value1 == Value2;
        System.out.println("Hasil 'Value1 == Value2' adalah " + Hasil + "\n");

        System.out.println("Tidak Sama Dengan..");
        Hasil = Value1 != Value2;
        System.out.println("Hasil 'Value1 != Value2' adalah " + Hasil + "\n");

        System.out.println("Lebih Besar Dari..");
        Hasil = Value1 > Value2;
        System.out.println("Hasil 'Value1 > Value2' adalah " + Hasil + "\n");

        System.out.println("Sama atau Lebih Besar dari..");
        Hasil = Value1 >= Value2;
        System.out.println("Hasil 'Value1 >= Value2' adalah " + Hasil + "\n");

        System.out.println("Kurang Dari..");
        Hasil = Value1 < Value2;
        System.out.println("Hasil 'Value1 < Value2' adalah " + Hasil + "\n");

        System.out.println("Sama atau Kurang Dari dengan..");
        Hasil = Value1 <= Value2;
        System.out.println("Hasil 'Value1 <= Value2' adalah " + Hasil + "\n");
    }
}
