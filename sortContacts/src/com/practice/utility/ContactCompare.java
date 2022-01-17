package com.practice.utility;

import java.util.Comparator;

import com.practice.contacts.pojo.Contact;

public class ContactCompare implements Comparator<Contact> {
	public int compare(Contact m1, Contact m2) {
		return m1.getFirstName().compareTo(m2.getFirstName());
	}
}
