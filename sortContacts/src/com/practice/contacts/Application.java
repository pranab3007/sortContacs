package com.practice.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.practice.contacts.pojo.Contact;
import com.practice.contacts.service.AddressBookService;

public class Application {

	 AddressBookService AddressBookService = new AddressBookService();
	    List<Contact> list = new ArrayList<>();

	    public static void main(String[] args) {
	        Application application = new Application();
	        application.displayMenu();

	    }
	    private void displayMenu() {
	        System.out.println("Select");
	        System.out.println("1) Add new Contact");
	        System.out.println("2) Display sorted List");
	        Scanner scanner = new Scanner(System.in);
	        int choice = scanner.nextInt();

	        switch (choice) {
	            case 1:
	                Contact c = AddressBookService.getContact();
	                list.add(c);
	                displayMenu();
	                break;
	            case 2:
	                AddressBookService.sortContacts(list);
	                displayMenu();
	                break;
	            default:
	                break;
	        }
	    }
}
