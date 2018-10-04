package comp30022.server.RoutePlanning;

import com.google.cloud.firestore.GeoPoint;
import com.google.maps.model.LatLng;

import java.util.Arrays;

public class RouteHash {
    public static int hashOriginsDestinations(GeoPoint[] origins, GeoPoint[] destinations) {
        //Sort the array first for hashing
//        Arrays.sort(origins);
//        Arrays.sort(destinations);

        //Create Hashing
        int originsHashCode = Arrays.deepHashCode(origins);
        int desitnationsHashCode = Arrays.deepHashCode(destinations);

        //an additionaly layer of hashing as key value for result
        int odHashCode = Arrays.hashCode(new int[] {originsHashCode, desitnationsHashCode});

        return odHashCode;
    }
}
