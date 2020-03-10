package com.capgemini.third;

public class Testc {
	public static void main(String[] args) {
		String[] items = { "soap", "brush", "paste", "facewash" };
		printArrayData(items);
		String[] item= GetArrayData();
		printArrayData(item);
	}

	static void printArrayData(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);

		}
		System.out.println("******************************");
	}

	static String[] GetArrayData() {
		String[] value = { "milk", "curd", "butter" };
		return value;
	}

}
