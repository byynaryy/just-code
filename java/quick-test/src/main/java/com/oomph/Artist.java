package com.oomph;

public class Artist {
    private String firstName;
    private String secondName;

    public Artist(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return firstName +" "+ secondName;
    }
}
