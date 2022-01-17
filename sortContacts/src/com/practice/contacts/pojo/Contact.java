package com.practice.contacts.pojo;

public class Contact {
    private String firstName;
    private String lastName;
    private String address;
    private String city;


    public Contact() {
    }

    public Contact(String firstName, String lastName, String address, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public boolean equals(Object o) {
        if(o == this) {
            return true;
        }
        if(!(o instanceof Contact)){
            return false;
        }
        Contact contact = (Contact) o;
        if(this.firstName.equalsIgnoreCase(contact.getFirstName()) &&
                this.lastName.equalsIgnoreCase(contact.getLastName())) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +'}';
    }
}
