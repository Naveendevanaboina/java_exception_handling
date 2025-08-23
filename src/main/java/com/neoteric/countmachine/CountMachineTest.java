package com.neoteric.countmachine;

public class CountMachineTest {
    public static void main(String[] args) {
        CountMachineService countMachineService = new CountMachineService();
        int numberofNotes=10;
        int denominations=100;
        int totalAmount= countMachineService.countAmount(numberofNotes,denominations);

        System.out.println("  number  "   +  numberofNotes + "total" + denominations+ totalAmount);

    }
}
