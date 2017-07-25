package com.ekotwick;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Theater theater = new Theater("Olympian", 8, 12);
//        theater.getSeats();

        if(theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat taken");
        }

        if(theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat taken");
        }
        // this will print seats in reverse alphabetical order;
        List<Theater.Seat> reserveSeats = new ArrayList<>(theater.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);

        List<Theater.Seat> priceSteas = new ArrayList<>(theater.getSeats());
        priceSteas.add(theater.new Seat("B00", 13.00));
        priceSteas.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSteas, Theater.PRICE_ORDER);
        printList(priceSteas);
        // this will print seats in price order; notice the order of "B00" and "A00"——the "B00" will be printed before the "A00", which is because it will print in insertion order
    }

    public static void printList(List<Theater.Seat> list) {
        for(Theater.Seat seat : list) {
            System.out.print(" "  + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=========================");
    }
}
