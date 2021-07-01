package com.sy.example.object.nonstatic2.controller;

import java.util.Arrays;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		int[] arr = new int[length];

		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		return arr;
	}
	
	public void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	public void sortDescending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<i; k++) {
				if(arr[k] <= arr[i]) {
					swap(arr, i, k);
				}
			}
		}
		display(arr);
	}
	
	public void sortAscending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<i; k++) {
				if(arr[k] >= arr[i]) {
					swap(arr, i, k);
				}
			}
		}
		display(arr);
	}
	
	public int countChar(String str, char c) {
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			char schar = str.charAt(i);
			
			if(schar == c) {
				count++;
			}
		}
		return count;
	}
	
	public int totalValue(int num1, int num2) {
		int min = Math.min(num2, num1);
		int max = Math.max(num2, num1);
		
		int sum =0;
		for(int i= min+1; i <max; i++ ) {
			sum += i;
		}
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		return str.charAt(index);
		
	}
	
	public String pConcat(String str1, String str2) {
		return str1.concat(str2);
	}
}
