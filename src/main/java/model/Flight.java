package model;

import java.time.LocalDate;

public class Flight {
	private long flightNumber;
	private String flightType;
	private String flightSource;
	private String fightDestination;
	private String layOffPoints;
	private LocalDate flyDate;
	private double flightCharge;
	
	public Flight()
	{
		
	}
	
	public Flight(long flightNumber, String flightType, String flightSource, String fightDestination,
			String layOffPoints, LocalDate flyDate, double flightCharge) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.flightSource = flightSource;
		this.fightDestination = fightDestination;
		this.layOffPoints = layOffPoints;
		this.flyDate = flyDate;
		this.flightCharge = flightCharge;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightType=" + flightType + ", flightSource=" + flightSource
				+ ", fightDestination=" + fightDestination + ", layOffPoints=" + layOffPoints + ", flyDate=" + flyDate
				+ ", flightCharge=" + flightCharge + "]";
	}

	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFightDestination() {
		return fightDestination;
	}
	public void setFightDestination(String fightDestination) {
		this.fightDestination = fightDestination;
	}
	public String getLayOffPoints() {
		return layOffPoints;
	}
	public void setLayOffPoints(String layOffPoints) {
		this.layOffPoints = layOffPoints;
	}
	public LocalDate getFlyDate() {
		return flyDate;
	}
	public void setFlyDate(LocalDate flyDate) {
		this.flyDate = flyDate;
	}
	public double getFlightCharge() {
		return flightCharge;
	}
	public void setFlightCharge(double flightCharge) {
		this.flightCharge = flightCharge;
	}
	
	
	
	

}
