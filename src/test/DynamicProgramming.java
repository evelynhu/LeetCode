package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dynamicProgramming.ClimbingStairs;
import dynamicProgramming.HouseRobber;

public class DynamicProgramming {
	@Test
	public void testClimbingStairs() {
		assertEquals(55, ClimbingStairs.climbStairs(9));
		assertEquals(89, ClimbingStairs.climbStairs(10));
	}
	@Test
	public void testHouseRobber() {
		int[] houses = {4,3,1,3,2};
		assertEquals(7, HouseRobber.rob(houses));
		int[] houses1 = {0};
		assertEquals(0, HouseRobber.rob(houses1));
	}
}
