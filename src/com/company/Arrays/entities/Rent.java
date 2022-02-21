package com.company.Arrays.entities;

public class Rent {

    private String nameStudent;
    private String emailStudent;
    private int roomId;
    private int rentID;

    public Rent(String nameStudent, String emailStudent, int roomId, int rentID) {
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
        this.roomId = roomId;
        this.rentID = rentID;
    }

    public void rentOneRoom(){

    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRentID() {
        return rentID;
    }

    public void setRentID(int rentID) {
        this.rentID = rentID;
    }
}
