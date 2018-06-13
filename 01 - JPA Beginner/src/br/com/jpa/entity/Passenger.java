package br.com.jpa.entity;

import java.util.Calendar;
import java.util.Date;

public class Passenger {

	private int passengerCod;
	private String passengerName;
	private Calendar birth;
	private Gender passengerGender;
	
	public int getPassengerCod() {
		return passengerCod;
	}
	public void setPassengerCod(int passengerCod) {
		this.passengerCod = passengerCod;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	public Gender getPassengerGender() {
		return passengerGender;
	}
	public void setPassengerGender(Gender passengerGender) {
		this.passengerGender = passengerGender;
	}

	
}
