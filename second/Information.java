package com.capgemini.assignmemt.second;

import java.util.*;

public class Information {
	public static void main(String[] args) {
		String name = null;
		byte age = 0;
		String address = null;
		long contactnumber = 0l;
		String email = null;
		String yesno;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.name\n2.age\n3.address\n4.contact\n5.email");
			System.out.println("enter your choice");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("enter your name");
				Scanner b = new Scanner(System.in);
				name = b.nextLine();
				System.out.println("your name is=" + name);

			case 2:
				System.out.println("enter your age");
				age = sc.nextByte();
				System.out.println("your age is=" + age);

			case 3:
				System.out.println("enter your address");
				Scanner c = new Scanner(System.in);
				address = c.nextLine();
				System.out.println("your address is=" + address);

			case 4:
				System.out.println("enter your contact number");
				contactnumber = sc.nextLong();
				System.out.println("your contact number is=" + contactnumber);

			case 5:
				System.out.println("enter your email");
				Scanner d = new Scanner(System.in);
				email = d.nextLine();
				System.out.println(" your mail is=" + email);
				break;
			default:
				System.out.println("in valid choice");

			}

			System.out.println(" do you want to change details enter yes else no");
			Scanner e = new Scanner(System.in);
			yesno = e.nextLine();
			System.out.println("enter your option" + yesno);
		} while (yesno.equals("yes"));
		System.out.println("your details");
		if (name != null) {
			System.out.println("your name is" + name);
		}
		if (age != 0) {
			System.out.println("your age is" + age);

		}
		if (address != null) {
			System.out.println("your address is " + address);
		}
		if (contactnumber != 0) {
			System.out.println("your phone number" + contactnumber);
		}
		if (email != null) {
			System.out.println("your email is" + email);
		}
	}

}
