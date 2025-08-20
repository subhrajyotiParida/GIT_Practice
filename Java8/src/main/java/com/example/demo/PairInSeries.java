package com.example.demo;

import java.util.HashMap;

public class PairInSeries {
	public static void main(String[] args) {
		int[] array = { 2, 7, 11, 15 };
		int target = 9;
		findPairs(array, target);
	}

	public static void findPairs(int[] array, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int result = target - array[i];
			if (map.containsKey(result)) {
				System.out.println("Pair found: (" + array[i] + ", " + result + ")");
			}
			map.put(array[i], i);
		}
		//System.out.println(map);
	}
	
}
