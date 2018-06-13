package br.com.jpa.entity;

import java.util.Calendar;

public class Race {

	private int RaceCod;
	private String RaceOrigin;
	private String RaceDestiny;
	private Calendar RaceDate;
	private Float RaceValue;
	
	public int getRaceCod() {
		return RaceCod;
	}
	public void setRaceCod(int raceCod) {
		RaceCod = raceCod;
	}
	public String getRaceOrigin() {
		return RaceOrigin;
	}
	public void setRaceOrigin(String raceOrigin) {
		RaceOrigin = raceOrigin;
	}
	public String getRaceDestiny() {
		return RaceDestiny;
	}
	public void setRaceDestiny(String raceDestiny) {
		RaceDestiny = raceDestiny;
	}
	public Calendar getRaceDate() {
		return RaceDate;
	}
	public void setRaceDate(Calendar raceDate) {
		RaceDate = raceDate;
	}
	public Float getRaceValue() {
		return RaceValue;
	}
	public void setRaceValue(Float raceValue) {
		RaceValue = raceValue;
	}
	
	
	
}
