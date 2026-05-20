package com.indivaragroup;

import com.indivaragroup.activitys.logic.ActivityToDo;
import com.indivaragroup.calculation.registration.identity.CalculationRegistrationIdentity;
import com.indivaragroup.convertion.number.ConvertionNumber;
import com.indivaragroup.house.floor.logic.CeramicFloor;
import com.indivaragroup.movie.logic.PlaylistOfTheYear;
import com.indivaragroup.scoring.student.ScoringStudent;
import com.indivaragroup.type.data.TypeData;
import com.indivaragroup.type.data.array.TypeDataArray;
import com.indivaragroup.type.data.primitive.TypeDataNonPrimitive;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello JDT-17";
        System.out.println("Ini string untuk hello world = " + helloWorld);

        int helloInteger = 200;
        System.out.println("Ini integer untuk hello integer = " + helloInteger);

        double helloDouble = 25.5;
        System.out.println("Ini double untuk hello double = " + helloDouble);

        boolean helloBoolean = true;
        System.out.println("Ini boolean untuk hello boolean = " + helloBoolean);

        char helloChar = 'A';
        System.out.println("Ini char untuk hello char = " + helloChar);

        System.out.println();

        CeramicFloor ceramic = new CeramicFloor();
        ceramic.checkCeramic();

        System.out.println();

        ScoringStudent scoring = new ScoringStudent();
        scoring .hitung();

        System.out.println();

        CalculationRegistrationIdentity calculator = new CalculationRegistrationIdentity();
        calculator.calculate();

        System.out.println();

        ConvertionNumber convertion = new ConvertionNumber();
        convertion.getconvertion();

        System.out.println();

        TypeData type = new TypeData();
        type.getdata();

        System.out.println();

        TypeDataNonPrimitive nonPrimitive = new TypeDataNonPrimitive();
        nonPrimitive.getTypeDataNonPro¥imitive();

        System.out.println();

        TypeDataArray dataArray = new TypeDataArray();
        dataArray.getTypeDataArray();

        System.out.println();
        PlaylistOfTheYear playlist = new PlaylistOfTheYear();
        playlist.getFavoritePlayList();

        System.out.println();
    }
}
