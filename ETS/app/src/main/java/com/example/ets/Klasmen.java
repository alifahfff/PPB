package com.example.ets;

public class Klasmen {

    private String textTeam;
    private String textPoin;

    public Klasmen(String textTeam, String textDate){
        this.textTeam = textTeam;
        this.textPoin = textDate;
    }

    public String getTextTeam() {
        return textTeam;
    }

    public void setTextTeam(String textTeam) {
        this.textTeam = textTeam;
    }

    public String getTextPoin() {
        return textPoin;
    }

    public void setTextPoin(String textPoin) {
        this.textPoin = textPoin;
    }
}
