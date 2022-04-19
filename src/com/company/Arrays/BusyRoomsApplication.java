package com.company.Arrays;

import com.company.Arrays.entities.Rent;

import java.util.Locale;

public class BusyRoomsApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int roomsQuantity =10;
        Rent[] rent = new Rent[roomsQuantity];

        for (int i = 0; i < roomsQuantity; i++) {
            rent[1] = new Rent("Matheus", "xpto@g.com", 5, 1);
            rent[8] = new Rent("Cleber", "xpto@g.com", 8, 2);
            rent[3] = new Rent("Maria", "xpto@g.com", 3, 1);
        }

        for (int i = 0; i < rent.length; i++) {
            if (rent[i] != null) {
                System.out.println("Room ID: " + rent[i].getRentID() +
                    " Name: " + rent[i].getNameStudent() +
                    " Email: " + rent[i].getEmailStudent() +
                    " Room: " + rent[i].getRoomId());
            }
        }
    }
}
