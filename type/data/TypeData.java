package com.indivaragroup.type.data;

public class TypeData {
    public void getdata(){
        char huruf = 'A';
        char angka = '7';
        char simbol = '#';
        char spasi = ' ';

        System.out.println("Huruf : " + huruf);
        System.out.println("Angka : " + angka);
        System.out.println("Simbol : " + simbol);
        System.out.println("Spasi : " + spasi);

        char newline = '\n';
        char tab = '\t';
        char quote = '\'';

        System.out.println("Escape Sequence : ");
        System.out.println("Baris 1 " + newline + "Baris 2");
        System.out.println("Kolom1 " + tab + "kolom2");
        System.out.println("Tanda Kutip :" + quote);
    }
}
