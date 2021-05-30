package com.kh.chap02_listSort.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import com.kh.chap02_listSort.model.comparator.AscCountry;
import com.kh.chap02_listSort.model.comparator.AscTravelNum;
import com.kh.chap02_listSort.model.comparator.DescTravelNum;
import com.kh.chap02_listSort.model.vo.Travel;

public class Run {

	public static void main(String[] args) {
		// 1. Comparable(java.lang) : 클래스의 기본 정렬 기준을 설정
		// - vo 클래스에 지정하고 어떤 기준의 오름차순과 내림차순 중 한번에 하나만 지정가능
		// - Integer,Double,String 같은 기본 제공되는 클래스들은 이미 구현
		// - 반드시 compareTo 메소드를 오버라이딩 해야 함

		// 2. Comparator(java.util) : 원하는 정렬 기준대로 설정 (사용자 정의)
		// - 따로 Comparator를 구현하는 클래스들을 만들어 오름차순과 내림차순에 대해 각각
		// 클래스 설정해서 사용 가능 (기준만큼 클래스를 만들어야 됨, 각 클래스는 한 가지 기준)
		//	- 반드시 compare 메소드를 오버라이딩 해야함
		
		
		ArrayList<Travel> a1 = new ArrayList<Travel>(3);
		
		a1.add(new Travel(1, "아이슬란드","오로라"));
		a1.add(new Travel(3, "라오스","블루라군"));
		a1.add(new Travel(2, "보홀","스킨스쿠버"));
		a1.add(new Travel(5, "블라디보스톡","발레"));
		a1.add(new Travel(4, "크로아티아","성벽투어"));
		
		
		//1.Collections클래스 활용
		//1.1-Comparable 사용시
		//Collections.sort(a1);  
		/* 위대로 실행시키면 오류남
		 * ClassCastException
		 * Travel cannot be cast to java.util.Comparable
		 * Travel에 implements Comparable있어야 함
		 */
		
		//1.2-Comparator사용시
//		Collections.sort(a1, new AscCountry());
//		Collections.sort(a1, new AscTravelNum());
		Collections.sort(a1, new DescTravelNum()); 
		/* implements Comparator<Travel>
		 * 제네릭스 적어줘야 한다. 
		 * */
		
		
		//2.list.sort활용
		//-Comparable사용시
		//a1.sort(null);
		//-Comparator사용시
//		a1.sort(new DescTravelNum());  
		
		
		//컬렉션 출력하는 법
		//1.한번에 출력
//		System.out.println(a1);
//		
//		//2.for문을 통한 출력
//		for(int i=0; i<a1.size(); i++) {
//			System.out.println(a1.get(i));
//		}
		
		//3.for each
//		for(Travel c : a1) {
//			System.out.println(c);
//		}
		
		//4.반복자 Iterator
		Iterator<Travel> it = a1.iterator(); //a1에 있는 객체들을 Iterator에 담는 과정
		while(it.hasNext()) {  //꺼낼 요소가 있는지 확인
			System.out.println(it.next());  //현재요소를 꺼내서 출력
		}
		
		Iterator<Travel> it1 = new LinkedList(a1).descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());  //역순으로 출력
		}

	}

}
