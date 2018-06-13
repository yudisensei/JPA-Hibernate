package br.com.jpa.entity;

import java.util.Calendar;

public class Driver {

	private int wallet;
	private String driverName;
	private Calendar driverBirth;
	private byte[] photoWallet;
	private Gender DriverGender;
	
	public int getWallet() {
		return wallet;
	}
	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Calendar getDriverBirth() {
		return driverBirth;
	}
	public void setDriverBirth(Calendar driverBirth) {
		this.driverBirth = driverBirth;
	}
	public byte[] getPhotoWallet() {
		return photoWallet;
	}
	public void setPhotoWallet(byte[] photoWallet) {
		this.photoWallet = photoWallet;
	}
	public Gender getGender() {
		return DriverGender;
	}
	public void setGender(Gender gender) {
		this.DriverGender = gender;
	}
	
	
	
}
