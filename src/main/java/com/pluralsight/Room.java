package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn(){
        isOccupied=true;
        isDirty=true;
        System.out.println("Guest has checked in");

    }
    public void checkOut(){
        isOccupied=false;
        isDirty=true;
        System.out.println("Guest has checked out");

    }
    public void cleanRoom(){
        System.out.println("Room has been cleaned and is now available");
        isDirty=false;
    }
}