package com.sy.chap02_DataStructure.practice;

import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX = 21;
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscData[] dat){
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		}
		return sum/dat.length;
	}
	
	static void distVision(PhyscData[] dat, int[] dist){
		int i = 0;
		
		dist[i] = 0;  //시력 정보 담을 배열
		for(i=0; i<dat.length; i++) {
			
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("박현규", 162, 0.3)	,
			new PhyscData("함진아", 173, 0.7)	,
			new PhyscData("최윤미", 175, 2.0)	,
			new PhyscData("홍연의", 171, 1.5)	,
			new PhyscData("이수진", 168, 0.4)	,
			new PhyscData("김영준", 174, 1.2)	,
			new PhyscData("박용규", 169, 0.8)	,
		};
	}
}