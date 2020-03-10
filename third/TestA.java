package com.capgemini.third;

public class TestA {
	public static void main(String[] args) {
		double[] number = { 10.2, 20.8, 82.6, 40.0, 55.2 };
		printArrayData(number);
		double[] nums = GetArrayData();
		printArrayData(nums);
	}

	static void printArrayData(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("*******************");
	}

	static double[] GetArrayData() {
		double[] values = { 10, 20, 30, 40 };
		return values;
	}
}
