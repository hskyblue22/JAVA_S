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
			dist[(int)(dat[i].vision*10)]++;
		}
	}
	
	//Q10. 시력분포를 사람수만큼 "*"를 반복하여 나타내라
	static void printVision(int[] vdist) {
		for(int i=0; i<vdist.length; i++) {
			System.out.printf("%.1f ~ : ",i/10.0);
			for(int k=0; k<vdist[i]; k++) {
				System.out.printf("*");
			}
			System.out.println();
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
		
		System.out.println("◆ 신체검사 리스트 ◆");
		System.out.println("이름     키    시력  ");
		System.out.println("------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-5s %-4d %4.1f\n",x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %.1fcm\n", aveHeight(x));
		
		System.out.println("시력 분포");
		
		int[] vdist = new int[VMAX];
		distVision(x,vdist);
		for(int i=0; i<vdist.length; i++) {
			System.out.printf("%.1f ~ : %d명\n",i/10.0,vdist[i]);  //(i/10) 안됨! -> 0.0으로만 나옴
		}
		
		printVision(vdist);
		

	}
}
