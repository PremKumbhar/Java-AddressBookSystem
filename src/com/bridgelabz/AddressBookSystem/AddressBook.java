package com.bridgelabz.AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
Scanner sc = new Scanner(System.in);

ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

public void addContact() {
	Contacts contact = new Contacts();
	System.out.println("HashCode of contact object : " +contact.hashCode());
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
	contactsArrayList.add(contact);
}
		
public void  displayContacts() {
	for(int i = 0; i < contactsArrayList.size(); i++) {
		Contacts contacts = contactsArrayList.get(i);
		System.out.println(contacts.toString());
	}
	
}

public void editContacts() {
	System.out.println("Enter the first name you want to edit :");
	String firstName = sc.next();
	boolean isAvailable = false;
	
	for(Contacts contacts : contactsArrayList) {	
	//for(int i = 0; i < contactsArrayList.size(); i++) {
		//Contacts contacts = contactsArrayList.get(i);
		if(contacts.getFirstName().equals(firstName)) {
			isAvailable = true;
			System.out.println("Enter the First Name : ");
			contacts.setFirstName(sc.next());
			System.out.println("Enter the Last Name : ");
			contacts.setLastName(sc.next());
			System.out.println("Enter the Address : ");
			contacts.setAddress(sc.next());
			System.out.println("Enter the City : ");
			contacts.setCity(sc.next());
			System.out.println("Enter the State : ");
			contacts.setState(sc.next());
			System.out.println("Enter the ZipCode : ");
			contacts.setZipCode(sc.next());
			System.out.println("Enter the Mobile no : ");
			contacts.setMobileNo(sc.next());
			System.out.println("Enter the Email Id : ");
			contacts.setEmail(sc.next());
		}
	}
	if(isAvailable == false) {
		System.out.println("Contact is not available");
	}
}



}
