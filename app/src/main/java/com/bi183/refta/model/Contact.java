package com.bi183.refta.model;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("ID")
    private int id;
    @SerializedName("Nama")
    private String firstName;
    @SerializedName("Tipe_barang")
    private String lastName;
    @SerializedName("Harga_modal")
    private String phoneNumber;
    @SerializedName("Harga_jual")
    private String email;
    @SerializedName("Photo")
    private String photo;
    @SerializedName("Stok")
    private String gender;

    public Contact(int id, String firstName, String lastName, String phoneNumber, String email, String photo, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.photo = photo;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoto() {
        return photo;
    }

    public String getGender() {
        return gender;
    }
}