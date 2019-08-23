package com.rizkykhapidsyah.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int NilaiAwal = 5;
        int Hasil = +NilaiAwal;
        System.out.println("Hasil +5 = " + Hasil + "\n");

        System.out.println("Operator Unary Minus");
        int NilaiAwal2 = 5;
        NilaiAwal2 = -NilaiAwal2;
        System.out.println("Hasil -5 = " + NilaiAwal2 + "\n");

        System.out.println("Operator Peningkatan Nilai Sebesar 1 Point");
        int NilaiAwal3 = 5;
        NilaiAwal3++;
        System.out.println("Hasil 5++ = " + NilaiAwal3 + "\n");

        System.out.println("Operator Pengurangan Nilai Sebesar 1 Point\"");
        int NilaiAwal4 = 5;
        NilaiAwal4--;
        System.out.println("Hasil 5-- = " + NilaiAwal4 + "\n");

        System.out.println("Operator Komplemen Logika");
        boolean Sukses = false; //Nilai Sukses adalah false
        System.out.println("Hasil !false = " + !Sukses);
    }
}
