package sendyQuiz;
//import java.util.HashMap;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//WebTarget target = client.target("https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins=Nairobi&destinations=Kisumu&key=AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso");
//System.out.println(target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class));
public class DistanceMaps {
	protected static String distanceMatrixHostUrl = "https://maps.googleapis.com/maps/api/directions/";
	protected static String fullUrl;
	protected static String units = "metric";
	protected static String mode = "json";
	public static String origin;
	public static String destination;
	public static String[] waypoints;
	private  static String APIKEY = "AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso";
	
	
	public DistanceMaps(String _origin, String _destination,String[] _waypoints){			
		this.origin = _origin;
		this.destination = _destination;
		this.waypoints = _waypoints;
		
		System.out.println(locationsDistanceDifference());
	}
	
	
	public static String locationsDistanceDifference(){
		Client client = ClientBuilder.newClient();		
		fullUrl = distanceMatrixHostUrl
						+mode+"?units="+units
						+"&origins="+origin
						+"&destination="+destination
						+"&waypoints=optimize:true|"+wrapWaypoints(waypoints)
						+"&key="+APIKEY;
		WebTarget target = client.target(fullUrl);
		return target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
	}
//	Convert Waypoints array into String
	public  static String wrapWaypoints(String[] _waypoints){
		String wrappedWaypoint = "";
		int count = 0;
		for(int i = 0; i < _waypoints.length; i++){
				wrappedWaypoint = _waypoints[count];
				wrappedWaypoint+="|"+waypoints[i];
		}
		return wrappedWaypoint;
		
	}

}
