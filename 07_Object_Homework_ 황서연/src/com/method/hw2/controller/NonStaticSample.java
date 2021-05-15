package com.method.hw2.controller;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) {
		
		int[] arr = new int[length];
		
		for(int i=0 ; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		return arr;
	}
	
	public void display(int[] arr) {
		for(int i=0 ; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	
	}
	
	public void sortDescending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<i; k++) {
				if(arr[i] > arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		display(arr);
	}

	public void sortAscending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<i; k++) {
				if(arr[i] < arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		display(arr);
	}
	
	public int countChar(String str, char c) {
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(c == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	
	public int totalValue(int num1, int num2) {
		
		int sum = 0;
		for(int i=Math.min(num1, num2)+1; i<Math.max(num1, num2); i++) {
			sum += i;
		}
		return sum;
	}
	
	public char pCharAt(String str, int index) {
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		return str1 + str2;
	}
	
	
}
