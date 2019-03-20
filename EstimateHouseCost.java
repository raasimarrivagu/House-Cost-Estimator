/**
 * This program is used to find the estimated
 * cost of the house based on type given by the 
 * client
 */
package HouseConstructionCost;

/**
 * @author Raasi
 *
 */
public class EstimateHouseCost {
	
	/**
	 * gives the estimated cost of the house
	 * @param type
	 * @param area
	 * @return
	 */
	int costEstimation(String type,int area) {
		switch(type) {
		case "standard":
			return area*1200;
		case "above_standard":
			return area*1500;
		case "high_standard":
			return area*1800;
		case "fully_automated":
			return area*2500;
		default:
			return -1;
		}
	}
}
