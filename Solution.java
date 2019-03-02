package com.shellsort;

public class Solution {

	public static void shellSort(int[] arr) {
		//int gap = Math.floorDiv(arr.length, 2);
		int n = arr.length;
		int h = 1;
		while(h <= n/3){
			h = h*3 + 1;
		}
		//while (gap != 0) {
		while(h != 0){
			for (int i = 0; i < n; i++) {
				int cur_index = i;
				while (true) {
					//int j = gap + cur_index;
					int j = h + cur_index;
					if (j >= n)
						break;
					if (arr[i] > arr[j]) {
						arr[i] = arr[i] ^ arr[j];
						arr[j] = arr[i] ^ arr[j];
						arr[i] = arr[i] ^ arr[j];
					}
					cur_index = j;
				}
			}
			//gap /= 2;
			h = (h - 1)/3;
		}

	}

	public static void main(String[] args) {
		int[] a = {(int) (Math.random()*99), (int) (Math.random()*99), (int) (Math.random()*99), (int) (Math.random()*99), (int) (Math.random()*99)};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		shellSort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
