package javanotes;

import java.util.HashMap;

public class TrainSystem {
	
	public TrainSystem() throws Exception {
		User newUser = new User(1, false, TrainSystem.getStations().get(3));
		newUser.travel();
		newUser.travel();
		newUser.travel();
		newUser.travel();
		newUser.travel();
		newUser.travel();
		newUser.travel();
		newUser.travel();
	}

	public static HashMap<Integer, Station> getStations() {
		HashMap<Integer, Station> stations = new HashMap<>();
		stations.put(1, new Station(1, "first", 10, null));
		stations.put(2, new Station(2, "second", 10, 10));
		stations.put(3, new Station(3, "third", 10, 10));
		stations.put(4, new Station(4, "fourth", 10, 10));
		stations.put(5, new Station(5, "fifth", null, 10));
		return stations;
	}
	
	
}
