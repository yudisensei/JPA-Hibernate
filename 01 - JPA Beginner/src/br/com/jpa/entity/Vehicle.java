package br.com.jpa.entity;

public class Vehicle {

	private int cd_vehicle;
	private String VehicleName;
	private String Vehiclecolor;
	private int VehicleYear;

	public int getCd_vehicle() {
		return cd_vehicle;
	}
	public void setCd_vehicle(int cd_vehicle) {
		this.cd_vehicle = cd_vehicle;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	public String getVehiclecolor() {
		return Vehiclecolor;
	}
	public void setVehiclecolor(String vehiclecolor) {
		Vehiclecolor = vehiclecolor;
	}
	public int getVehicleYear() {
		return VehicleYear;
	}
	public void setVehicleYear(int vehicleYear) {
		VehicleYear = vehicleYear;
	}
	
}
