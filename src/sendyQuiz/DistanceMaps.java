package sendyQuiz;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//WebTarget target = client.target("https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins=Nairobi&destinations=Kisumu&key=AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso");
//System.out.println(target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class));
public class DistanceMaps {
	protected String distanceMatrixHostUrl = "https://maps.googleapis.com/maps/api/distancematrix/";
	protected String units = "metric";
	protected String origins;
	protected String destinations;
	protected String mode = "json";
	private String APIKEY = "AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso";
	
	public DistanceMaps(String[][] ordersDetails){

		for(int j = 0; j< ordersDetails.length; j++){
			System.out.println(ordersDetails[j][2]);
		}
	}
	
	
	
	public static double locationsDistanceDifference(String _origin, String _location){
		return 0;
	}

}
