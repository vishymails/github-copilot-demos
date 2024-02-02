package org.example;

// Reservation class with properties room, guestName, guestPhoneNumber, numberOfGuests and checkInDate, checkOutDate
public class Reservation {
    private Room room;
    private String guestName;
    private String guestPhoneNumber;
    private int numberOfGuests;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(Room room, String guestName, String guestPhoneNumber, int numberOfGuests, String checkInDate, String checkOutDate) {
        this.room = room;
        this.guestName = guestName;
        this.guestPhoneNumber = guestPhoneNumber;
        this.numberOfGuests = numberOfGuests;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Room getRoom() {
        return room;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getGuestPhoneNumber() {
        return guestPhoneNumber;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setGuestPhoneNumber(String guestPhoneNumber) {
        this.guestPhoneNumber = guestPhoneNumber;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString(){
        return "Room: " + room + ", guest name: " + guestName + ", guest phone number: " + guestPhoneNumber + ", number of guests: " + numberOfGuests + ", check in date: " + checkInDate + ", check out date: " + checkOutDate;
    }
}
