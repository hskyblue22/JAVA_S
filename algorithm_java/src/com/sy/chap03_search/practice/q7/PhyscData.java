package com.sy.chap03_search.practice.q7;

import java.util.Arrays;
import java.util.Scanner;


public class PhyscData {

	private String name;			
	private int height;			
	private double vision;			

	public PhyscData(String name, int height, double vision) {
		this.name = name;  
		this.height = height;  
		this.vision = vision;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public double getVision() {
		return vision;
	}


	public void setVision(double vision) {
		this.vision = vision;
	}


	public String toString() {
		return name + " " + height + " " + vision;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * x 배열이 시력으로 정렬이 되어있지 않으면 0.9 를 검색했을 때 없는 요소라고 찾지 못한다.
		 * */
		PhyscData[] x = {    
				new PhyscData("이나령", 162, 1.2), new PhyscData("유지훈", 168, 2.0), new PhyscData("전서현", 173, 1.5),
				new PhyscData("김한결", 169, 0.5), new PhyscData("이호연", 174, 0.9), new PhyscData("홍준기", 171, 0.4),
				new PhyscData("이수민", 175, 0.3) };
		
		System.out.print("(renew)찾는 시력 수치：");
		double vision = sc.nextDouble();
		
		/*
		 *시력 순으로 내림차순 정렬 : Arrays.sort(T[] a,Comparator<? super T> c)
		  적용 전 : 1.2, 2.0, 1.5, 0.5, 0.9, 0.4, 0.3 
		  적용 후 : 2.0, 1.5, 1.2, 0.9, 0.5, 0.4, 0.3 
		 * */
		Arrays.sort(x, new VisionDesc());

		//binarySearch 메소드 오버라이딩
		//static <T> int binarySearch(T[] a, T key, Comparator<?superT> c )
		int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision),	new VisionDesc());

		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터：" + x[idx]);
		}

	}
}
