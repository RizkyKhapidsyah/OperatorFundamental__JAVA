package com.rizkykhapidsyah.javafundamental.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        int Value1 = 4;
        int Value2 = 5;

        System.out.println("Conditional: AND");
        boolean Hasil = Value1 == 3 && Value2 == 5;
        boolean Hasil2 = Value1 != 3 && Value2 == 5;
        System.out.println("Hasil Operator AND pada syarat Value1 == 3 dan Value2 == 5 adalah " + Hasil);
        System.out.println("Hasil Operator AND pada syarat Value1 != 3 dan Value2 == 5 adalah " + Hasil2 + "\n");

        System.out.println("Conditional: OR");
        Hasil = Value1 == 3 || Value2 == 5;
        Hasil2 = Value1 != 3 || Value2 == 5;
        System.out.println("Hasil Operator AND pada syarat Value1 == 3 dan Value2 == 5 adalah " + Hasil);
        System.out.println("Hasil Operator AND pada syarat Value1 != 3 dan Value2 == 5 adalah " + Hasil2 + "\n");
    }
}
