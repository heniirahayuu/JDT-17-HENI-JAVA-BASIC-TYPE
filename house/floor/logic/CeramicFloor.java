package com.indivaragroup.house.floor.logic;

import com.indivaragroup.house.floor.dto.CeramicDTO;

public class CeramicFloor {

    public void checkCeramic() {
        CeramicDTO ceramic = new CeramicDTO();

        ceramic.setName("BATU");

        if (ceramic.getName().equals("Marmer")) {
            System.out.println("Ini marmer: true");
        } else {
            System.out.println("Ini marmer: false");
        }
    }
}