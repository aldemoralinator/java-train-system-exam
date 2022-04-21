package javanotes;

public class TravelDetail {

	private int hopCount;
	private Station originalStation;
	private Station endupStation;
	private int travelFee;
	
	public TravelDetail(int hopCount, Station originalStation, Station endupStation, int travelFee, boolean isNorthBound) {
		this.hopCount = hopCount;
		this.originalStation = originalStation;
		this.endupStation = endupStation;
		this.travelFee = isNorthBound ? originalStation.getNorthBoundFair() : originalStation.getSouthBoundFair();
	}
}
