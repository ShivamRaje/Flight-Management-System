package service;

import java.util.List;

import model.Flight;

public interface FlightService {
	
	public Flight addFlight(Flight flight);
	public List<Flight> viewAllFlight();
	public int editFlight(long flightNumber,Flight newFlight);
	public int removeFlight(long flightNumber);
	public Flight getFlightByNumber(long flightNum);
	

}
