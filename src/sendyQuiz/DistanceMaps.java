package sendyQuiz;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//WebTarget target = client.target("https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins=Nairobi&destinations=Kisumu&key=AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso");
//System.out.println(target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class));
public class DistanceMaps {
	protected static String distanceMatrixHostUrl = "https://maps.googleapis.com/maps/api/distancematrix/";
	protected static String fullUrl;
	protected static String units = "metric";
	protected static String mode = "json";	
	
	private  static String APIKEY = "AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso";
	
	
	public DistanceMaps(String[][] ordersDetails){

		for(int i = 0; i<ordersDetails.length; i++){
			
		}
	}
	
	
	
	public static String locationsDistanceDifference(String _origins, String _destinations){
		Client client = ClientBuilder.newClient();		
		fullUrl = distanceMatrixHostUrl+mode+"?units="+units+"origins="+_origins+"&destinations="+_destinations+"&key="+APIKEY;
		WebTarget target = client.target(fullUrl);
		return target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class);
	}

}
