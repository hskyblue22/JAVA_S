package com.sy.chap03_search.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.sy.chap03_search.practice.q7.PhyscData;

public class Q7_PhysExamSearch {

		//PhyscData 클래스 정의
		static class PhyscData {
			private String name;			
			private int height;			
			private double vision;			

			public PhyscData(String name, int height, double vision) {
				this.name = name;  
				this.height = height;  
				this.vision = vision;
			}

			public String toString() {
				return name + " " + height + " " + vision;
			}

			//comparator<PhyscData> 자료형 객체 생성
			public static final Comparator<PhyscData> VISION_DESC = new VisionDescComparator();

			//comparator 클래스 생성(시력 내림차순)
			//comparator 인터페이스 상속
			private static class VisionDescComparator implements Comparator<PhyscData> {
				@Override
				public int compare(PhyscData p1, PhyscData p2) {
					if(p1.vision-p2.vision > 0)
						return -1; 
					else if(p1.vision - p2.vision < 0)
						return 1;
					else
						return 0;
				}
			}
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			//객체(PhysData)배열 생성
			PhyscData[] x = { // 배열의 요소는 시력순이지 않으면 안됩니다.
					new PhyscData("이나령", 162, 1.2), new PhyscData("유지훈", 168, 2.0), new PhyscData("전서현", 173, 1.5),
					new PhyscData("김한결", 169, 0.5), new PhyscData("이호연", 174, 0.9), new PhyscData("홍준기", 171, 0.4),
					new PhyscData("이수민", 175, 0.3) };
			
			System.out.print("찾는 시력 수치：");
			double vision = sc.nextDouble();
			
			Arrays.sort(x, PhyscData.VISION_DESC);
			
			//binarySearch 메소드 오버라이딩
			//static <T> int binarySearch(T[] a, T key, Comparator<?superT> c )
			int idx = Arrays.binarySearch(x, new PhyscData("", 0, vision),	PhyscData.VISION_DESC);

			if (idx < 0)
				System.out.println("요소가 없습니다.");
			else {
				System.out.println("x[" + idx + "]에 있습니다.");
				System.out.println("찾은 데이터：" + x[idx]);
			}
		}

}
