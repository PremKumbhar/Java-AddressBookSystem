package com.bridgelabz.AddressBookSystem;

import java.util.Scanner;

public class AddressBook {
Scanner sc = new Scanner(System.in);

Contacts contact = new Contacts();

public void addContact() {
	System.out.println("Enter the First Name : ");
	contact.setFirstName(sc.next());
	System.out.println("Enter the Last Name : ");
	contact.setLastName(sc.next());
	System.out.println("Enter the Address : ");
	contact.setAddress(sc.next());
	System.out.println("Enter the City : ");
	contact.setCity(sc.next());
	System.out.println("Enter the State : ");
	contact.setState(sc.next());
	System.out.println("Enter the ZipCode : ");
	contact.setZipCode(sc.next());
	System.out.println("Enter the Mobile no : ");
	contact.setMobileNo(sc.next());
	System.out.println("Enter the Email Id : ");
	contact.setEmail(sc.next());
}
public void  displayContacts() {
	System.out.println(contact.toString());
}
}
