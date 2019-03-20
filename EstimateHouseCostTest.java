/**
 * This is JUnit tester for EstimateHouseCost class
 */
package HouseConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Raasi
 *
 */
public class EstimateHouseCostTest {

	/**
	 * Test method for {@link HouseConstructionCost.EstimateHouseCost#costEstimation()}.
	 */
	@Test
	public void testCostEstimation() {
		EstimateHouseCost ehc=new EstimateHouseCost();
		assertEquals(1250000,ehc.costEstimation("fully_automated",500));
		assertEquals(1200000,ehc.costEstimation("standard", 1000));
		assertEquals(1050000,ehc.costEstimation("above_standard", 700));
		assertEquals(1440000,ehc.costEstimation("high_standard", 800));

	}

}
