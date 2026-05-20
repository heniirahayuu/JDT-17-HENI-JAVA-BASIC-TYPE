package com.indivaragroup.movie.logic;// PlayListEveryYear.java
import com.indivaragroup.movie.dto.PlayListDTO;

import java.util.ArrayList;
import java.util.Calendar;

public class PlaylistOfTheYear {

    public void getFavoritePlayList() {

        ArrayList<PlayListDTO> listCode = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            PlayListDTO playListDTO = new PlayListDTO();
            playListDTO.setReleaseCode("REL-" + i);

            Calendar cal = Calendar.getInstance();
            cal.set(2024 + (i % 5), 0, 1); // Januari 1
            playListDTO.setReleaseDate(cal.getTime());

            listCode.add(playListDTO);
        }

        ArrayList<PlayListDTO> listReleaseCode = new ArrayList<>();

        for (PlayListDTO dto : listCode) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dto.getReleaseDate());

            int year = cal.get(Calendar.YEAR);

            if (year < 2026) {
                listReleaseCode.add(dto);
            }
        }

        System.out.println("INI LIST CODE FAVORITE GUE ----");
        for (PlayListDTO dto : listReleaseCode) {
            System.out.println(dto.getReleaseCode() + " - " + dto.getReleaseDate());
        }
    }
}