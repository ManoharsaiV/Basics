package com.reversetheinteger;

import java.util.Scanner;

public class ReversedIntegerH {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		int s = 0;
		while (num != 0) {

			int r = num % 10;
			s = s * 10 + r;
			num = num / 10;
		}
		scan.close();
		System.out.println(s);

	}

}
