package com.neoteric.constructors;

import java.util.List;

public class Ticket {
    private String pnr;
    private String name;
    private String serviceNumber;
    private List<SeatSelection> seatSelections;

    public Ticket(String pnr, String name, String serviceNumber, List<SeatSelection> seatSelections) {
        this.pnr = pnr;
        this.name = name;
        this.serviceNumber = serviceNumber;
        this.seatSelections = seatSelections;

    }

    public String getPnr() {
        return pnr;
    }

    public String getName() {
        return name;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public List<SeatSelection> getSeatSelections() {
        return seatSelections;
    }

    public Ticket(String name, String serviceNumber, List<SeatSelection> seatSelections) {
        this(null, name, serviceNumber, seatSelections);
    }
}
