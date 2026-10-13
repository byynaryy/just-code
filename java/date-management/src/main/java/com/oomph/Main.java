package com.oomph;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Get today's date
        LocalDate today = LocalDate.now();

        // Create a specific date
        LocalDate specificDate = LocalDate.of(2026, 10, 13);

        // Add or subtract days
        LocalDate tomorrow = today.plusDays(1);
        LocalDate lastWeek = today.minusWeeks(1);
    }
}