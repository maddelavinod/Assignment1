package com.capgemini.third;

public class ItemsTest {
	public static void main(String[] args) {

		Items1[] item = new Items1[3];
		Items1 i1 = new Items1(20, "soap");
		Items1 i2 = new Items1(30, "brush");
		Items1 i3 = new Items1(40, "paste");
		{

			item[0] = i1;
			item[1] = i2;
			item[2] = i3;
			printarray(item);
			Items1[] ite=getarray();
			printarray(ite);

		}
	}

	static void printarray(Items1[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("price--" + a[i].price);
			System.out.println("item--" + a[i].item);
			
		}

	}
	static Items1[] getarray(){
		Items1[] item = new Items1[3];
		Items1 i1 = new Items1(20, "milk");
		Items1 i2 = new Items1(30, "curd");
		Items1 i3 = new Items1(40, "butter");
		{

			item[0] = i1;
			item[1] = i2;
			item[2] = i3;
			return item;

		}
		
	}
}
