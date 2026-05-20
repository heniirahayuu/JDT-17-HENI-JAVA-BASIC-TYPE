package com.indivaragroup.movie.dto;

import java.util.Date;

public class PlayListDTO {
    private String releaseCode;
    private Date releaseDate;

    public PlayListDTO() {
    }

    public PlayListDTO(String releaseCode, Date releaseDate) {
        this.releaseCode = releaseCode;
        this.releaseDate = releaseDate;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "PlayListDTO{" +
                "releaseCode='" + releaseCode + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}