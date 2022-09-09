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
	// editing the existing contact using their First Name
			System.out.println("Enter the First Name of Contact to Edit");
			String firstName = sc.next();
			boolean isAvailable = false ;
			for(Contacts contact : contactsArrayList) {
				if(contact.getFirstName().equals(firstName)) {
					isAvailable = true ;
					System.out.println("What you want to edit for the contact");
					System.out.println("1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Mobile Number\n8.Email id");
					int choice = sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("Enter the First Name :");
						contact.setFirstName(sc.next());
						break;
					case 2:
						System.out.println("Enter the Last Name :");
						contact.setLastName(sc.next());
						break;
					case 3:
						System.out.println("Enter the Address :");
						contact.setAddress(sc.next());
						break;
					case 4:
						System.out.println("Enter the City :");
						contact.setCity(sc.next());
						break;
					case 5:
						System.out.println("Enter the State :");
						contact.setState(sc.next());
						break;
					case 6:
						System.out.println("Enter the Zip code :");
						contact.setZipCode(sc.next());
						break;
					case 7:
						System.out.println("Enter the Mobile Number :");
						contact.setMobileNo(sc.next());
						break;
					case 8:
						System.out.println("Enter the Email id :");
						contact.setEmail(sc.next());
						break;
					}
					System.out.println("Updated Sucessfully ...");
				}
			}
			if(isAvailable == false){
				System.out.println("Contact is not Available \nTry again");
			}
}
public void deleteContacts() {
	System.out.println("Enter the first name you want to delete :");
	String firstName = sc.next();
	boolean isAvailable = false;
	for(Contacts contacts : contactsArrayList) {
		if(contacts.getFirstName().equals(firstName)) {
			isAvailable = true;
			contactsArrayList.remove(contacts);
			System.out.println("Contact Deleted Successfully...!");
			break;
		}
	}
	if(isAvailable == false) {
		System.out.println("Contact not available");
	}
}
}
