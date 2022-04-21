package javanotes;

public class Station {

	private int stationNumber;
	private String name;
	private Integer northBoundFair;
	private Integer southBoundFair;
	
	public Station(int stationNumber, String name, Integer northBoundFair, Integer southBoundFair) {
		this.stationNumber = stationNumber;
		this.name = name;
		this.northBoundFair = northBoundFair;
		this.southBoundFair = southBoundFair;
	}

	public int getStationNumber() {
		return stationNumber;
	}

	public void setStationNumber(int stationNumber) {
		this.stationNumber = stationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNorthBoundFair() {
		return northBoundFair;
	}

	public void setNorthBoundFair(Integer northBoundFair) {
		this.northBoundFair = northBoundFair;
	}

	public Integer getSouthBoundFair() {
		return southBoundFair;
	}

	public void setSouthBoundFair(Integer southBoundFair) {
		this.southBoundFair = southBoundFair;
	}	
	
}
