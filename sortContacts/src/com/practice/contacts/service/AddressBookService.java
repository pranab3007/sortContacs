package com.practice.contacts.service;

import java.util.List;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.practice.contacts.pojo.Contact;

public class AddressBookService{

    public Contact getContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstName :: ");
        String firstName = scanner.nextLine();
        System.out.println("LastName :: ");
        String lastName = scanner.nextLine();
        System.out.println("Address :: ");
        String address = scanner.nextLine();
        System.out.println("PhoneNo :: ");
        String phonoNo = scanner.nextLine();


        return new Contact(firstName,lastName,address,phonoNo);
    }

    public void sortContacts(List<Contact> contactList) {
        System.out.println(contactList.stream().sorted(Comparator.comparing(Contact::getFirstName)).collect(Collectors.toList()));
    }
}
