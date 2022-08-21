package com.bridgelabz.AddressBookSystem;

public class Contacts 
{
private String firstName;
private String lastName;
private String address;
private String city;
private String state;
private String zipCode;
private String mobileNo;
private String email;
/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}
/**
 * @return the address
 */
public String getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(String address) {
	this.address = address;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zipCode
 */
public String getZipCode() {
	return zipCode;
}
/**
 * @param zipCode the zipCode to set
 */
public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}
/**
 * @return the mobileNo
 */
public String getMobileNo() {
	return mobileNo;
}
/**
 * @param mobileNo the mobileNo to set
 */
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() 
{
	return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
			+ ", state=" + state + ", zipCode=" + zipCode + ", mobileNo=" + mobileNo + ", email=" + email + "]";
}
}
