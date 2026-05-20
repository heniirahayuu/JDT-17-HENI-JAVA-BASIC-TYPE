package com.indivaragroup.calculation.registration.identity;

public class CalculationRegistrationIdentity {
    public void calculate() {
        int uang = 10000;
        int bayar = 5000;

//        if (uang == 10000) {
//            System.out.println("Saya harus buat KTP");
//            uang = uang - bayar;
//            System.out.println("Setelah buat ktp uang saya sisa =" + uang);
//        } else {
//            System.out.println("Saya tidak harus buat KTP");
//        }

        switch (uang){
            case 10000:
                System.out.println("Saya harus buat KTP");
                uang = uang - bayar;
                System.out.println("sisa uang saya :"+ uang);
                break;
            default:
        }

        //challenge kedua
        //1. saya punya anak murid ada 17 orang
        //2. dan saya harus memberikan nilai untuk menilai kemampuan mereka
        //3. hasil nilai tersebut harus saya olah berdasarkan nilai apabila
        //nilai 100 - dia jago banget
        //nilai 90 - dia belum jago banget
        //nilai 70 dia biasa aja
        //nilai dibawah harus belajar lagi

        // kalau udh keluar hasil print namanya// dinamis atau bisa diinput

    }
}
