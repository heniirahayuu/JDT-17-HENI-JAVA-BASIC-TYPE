package com.indivaragroup.scoring.student;

public class ScoringStudent {
    public void hitung(){

        String[] listNames = {"Ayu", "Bro", "Cica"};
        int[] gradeList = {100,90,70};

        for (int i = 0; i < listNames.length; i++) {
            System.out.print(listNames[i] + " dengan nilai: " + gradeList[i] + " ");

            if (gradeList[i] == 100) {
                System.out.println("dia jago banget");
            } else if (gradeList[i] == 90) {
                System.out.println("dia belum jago banget");
            } else if (gradeList[i] == 70) {
                System.out.println("dia biasa aja");
            } else {
                System.out.println("dia harus belajar lagi");
            }
        }
    }
}
