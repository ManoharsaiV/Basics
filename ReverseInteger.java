package com.reversetheinteger;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		num = scan.nextInt();
		scan.close();
		Integer i = new Integer(num);
		String s = i.toString();
		StringBuilder sb = new StringBuilder();
		sb.append(s).reverse();
		s = sb.toString();
		Integer newi = Integer.parseInt(s);
		int reversedNum = newi.intValue();
		System.out.println(reversedNum);

	}

}
