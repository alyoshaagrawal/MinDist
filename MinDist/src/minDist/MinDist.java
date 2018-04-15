package minDist;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Alyosha Agrawala
 * 
 * Solution to Problem - Minimum Distances
 *
 */
public class MinDist {
	public static int findMinDist(int arr[]) {
       int N = arr.length;
        
        final Map<Integer, Integer> numDist = new HashMap<>();
        
        int minDist = N;
        for(int i=0; i < N; i++){
            final int number = arr[i];;
            int dist = i;
            
            // if number is found in map, we have found the match. 
            // We calculate the difference and compare it with minDist
            if(numDist.containsKey(number)) {
            	dist = Math.abs(i - numDist.get(number));
            	if(dist < minDist) {
            		minDist = dist;
            	}
            }
            numDist.put(number, dist);
        }
        
        //If minDist is not updated, it means no pairs were found so we return -1, else minDistance
        return ((minDist == N) ? -1 : minDist);
	}
}