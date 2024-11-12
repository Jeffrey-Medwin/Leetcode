package com.leetcode.twosum;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		double start; 
		double end;
		Solution solution = new Solution();
		SimpleDateFormat dateFormat = new SimpleDateFormat("ss.SSS");
		start = Double.parseDouble(dateFormat.format(new Date()));
		
		int[] list = new int[] {};
		int target = -9;

		int[] result = solution.twoSum(list , target);
		
		for(int i : result) {
			System.out.print(i + " ");
		}
		
		end = Double.parseDouble(dateFormat.format(new Date()));
		
		System.out.println("\n" + (end - start));
	}
}
