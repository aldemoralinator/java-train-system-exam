package javanotes;

import java.util.HashSet;
import java.util.Set;

public class User {

	private int id;
	private HashSet<TravelDetail> travelHistory = new HashSet<>();
	private boolean isNorthBound;
	private Station currentStation;
	private int hopCount = 0;
	private int totalTravelFee = 0;
	
	public User(int id, boolean isNorthBound, Station currentStation) { 
		this.id = id;
		this.isNorthBound = isNorthBound;
		this.currentStation = currentStation;
	}
	
	public void travel() throws Exception {
		System.out.println("user_id: " + this.id + " | travel_fee: " + this.totalTravelFee + " | station_id: " + this.currentStation.getStationNumber());
		
		this.hopCount++;
		Station nextStation = TrainSystem.getStations().get(this.getNextStationNumber());
		int travelFee = this.isNorthBound ? this.currentStation.getNorthBoundFair() : this.currentStation.getSouthBoundFair();
		this.totalTravelFee = this.totalTravelFee + travelFee; 
		TravelDetail newTravelDetail = new TravelDetail(hopCount, this.currentStation, nextStation, travelFee, this.isNorthBound);
		this.currentStation = nextStation;
		this.travelHistory.add(newTravelDetail);
	}
	
	private int getNextStationNumber() throws Exception {
		int currentStationNumber = this.currentStation.getStationNumber();
		int maxStationSize = TrainSystem.getStations().size();
		int nextStationNumber = 0;
		if (this.isNorthBound) {
			if (currentStationNumber + 1 <= maxStationSize) {
				nextStationNumber = currentStationNumber + 1;
			} else {
				throw new Exception("Northest station reached");
			}
		} else {
			if (currentStationNumber - 1 >= 0 ) {
				nextStationNumber = currentStationNumber - 1;
			} else {
				throw new Exception("Southest station reached");
			}
		}
		return nextStationNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public HashSet<TravelDetail> getTravelHistory() {
		return travelHistory;
	}

	public void setTravelHistory(HashSet<TravelDetail> travelHistory) {
		this.travelHistory = travelHistory;
	}

	public boolean isNorthBound() {
		return isNorthBound;
	}

	public void setNorthBound(boolean isNorthBound) {
		this.isNorthBound = isNorthBound;
	}

	public Station getCurrentStation() {
		return currentStation;
	}

	public void setCurrentStation(Station currentStation) {
		this.currentStation = currentStation;
	}

	public int getHopCount() {
		return hopCount;
	}

	public void setHopCount(int hopCount) {
		this.hopCount = hopCount;
	}

	public int getTotalTravelFee() {
		return totalTravelFee;
	}

	public void setTotalTravelFee(int totalTravelFee) {
		this.totalTravelFee = totalTravelFee;
	}
	
	
}
