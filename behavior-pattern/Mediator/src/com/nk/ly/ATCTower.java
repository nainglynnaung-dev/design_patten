package com.nk.ly;
import java.util.ArrayList;
import java.util.List;

public class ATCTower implements ATCMediator {
    private List<Flight> flights = new ArrayList<>();

    @Override
    public void registerFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void sendMessage(String message, Flight originator) {
        for (Flight f : flights) {
            // Don't send the message back to the sender
            if (f != originator) {
                f.receive(message);
            }
        }
    }
}