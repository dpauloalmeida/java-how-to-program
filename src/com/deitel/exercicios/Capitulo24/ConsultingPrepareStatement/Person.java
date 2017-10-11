package com.deitel.exercicios.Capitulo24.ConsultingPrepareStatement;

public class Person {

    private int addressID;
    private String name;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(int addressID, String name, String email, String phoneNumber) {
        setAddressID(addressID);
        setName(name);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAddressID() {
        return addressID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
