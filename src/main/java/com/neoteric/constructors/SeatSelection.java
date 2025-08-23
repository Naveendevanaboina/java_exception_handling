package com.neoteric.constructors;

public class SeatSelection {

    private String seatNumber;

    private String seatType;

    private boolean isAisleseat;


    public SeatSelection(String seatNumber, String seatType, boolean isAisleseat) {
        this.seatNumber = seatNumber;
        this.seatType = seatType;
        this.isAisleseat = isAisleseat;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean getIsAisleseat() {
        return isAisleseat;
    }

    public void setIsAisleseat(boolean isAisleseat) {
        this.isAisleseat = isAisleseat;
    }
}
