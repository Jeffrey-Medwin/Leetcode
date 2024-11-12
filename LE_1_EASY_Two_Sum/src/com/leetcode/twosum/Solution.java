package com.leetcode.twosum;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		if (length > 1) {
			for (int i = 0; i < length; i++) {
				int diff = target - nums[i];
				for (int j = i + 1; j < length; j++) {
					if (diff == nums[j]) {
						return new int[] { i, j };
					}
				}
			}
		}
		return new int[] {};
	}
}