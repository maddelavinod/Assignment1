package com.capgemini.third;

public class TestB {
	public static void main(String[] args) {
		long[] numbers = { 200, 500, 1000, 6000, 10000 };
		printArrayData(numbers);
		long[] nums = GetArrayData();
		printArrayData(nums);
	}

	static void printArrayData(long[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("*******************");
	}

	static long[] GetArrayData() {
		long[] value = { 300, 400, 800, 1100 };
		return value;
	}

}
