package com.spring.filter.test.model;

public class Address {

    private String street;

    private String aptNo;

    private String zipCode;

    private String city;

    public Address() {
        super();
    }

    public Address(String street, String aptNo, String zipCode, String city) {
        super();
        this.street = street;
        this.aptNo = aptNo;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAptNo() {
        return aptNo;
    }

    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", aptNo=" + aptNo + ", zipCode=" + zipCode
                + ", city=" + city + "]";
    }

}
