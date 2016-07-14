package sendyQuiz;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

//WebTarget target = client.target("https://maps.googleapis.com/maps/api/distancematrix/json?units=metric&origins=Nairobi&destinations=Kisumu&key=AIzaSyAH66vk6sJooQ9au-PmAu5LIrO3X5BNMso");
//System.out.println(target.request(MediaType.APPLICATION_JSON_TYPE).get(String.class));
public class DistanceMaps {
	public DistanceMaps(){
		System.out.println("Samson");
	}
	public static double locationsDistanceDifference(String _origin, String _location){
		return 0;
	}

}
