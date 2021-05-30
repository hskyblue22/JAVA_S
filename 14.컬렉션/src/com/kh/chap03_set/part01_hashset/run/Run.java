package com.kh.chap03_set.part01_hashset.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Run {
	/*
	 * 1. Hash (hash알고리즘 도입) :
	 * 		데이터의 검색 성능 향상을 위해서 사용
	 * 		(hashCode와 equals를 모두 오버라이딩 해야한다.)
	 * 
	 * 2. Set
	 * 		- 순서유지 안됨, 중복 저장이 되지 않는다.(수학에서의 집합 개념)
	 * 		- 종류로는 HashSet, LinkedHashSet, TreeSet이 있다.
	 *      
	 * 3. HashSet
	 * 		- 순서가 존재하지 않는다.
	 * 		- hashCode()와 equals()가 오버라이딩 되어 있어야 한다.
	 * 
	 * 4. LinkedHashSet
	 * 		- 넣는 순서가 유지 된다.
	 * 		(hashCode와 equals를 모두 오버라이딩 해야한다.)
	 * 
	 * 5. TreeSet
	 * 		- 정렬기준대로 순서가 정해짐(기본 오름차순)
	 * 		- hashCode()와 equals()를 오버라이딩 할 필요 없이 알아서 중복저장 되지 않는다.
	 * 		- 세팅은 해 주어야 됨(Comparable이나 Comparator 구현 클래스)
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HashSet<String> hs = new HashSet();
//		Set hs = new HashSet();  //다형성: 부모로도 받을 수 있다.
		Collection hs = new HashSet();  //다형성: 부모로도 받을 수 있다.
	
		
		hs.add("반갑습니다");
		hs.add(new String("반갑습니다"));
		hs.add(new String("여러분"));
		hs.add(new String("안녕하세요"));
		hs.add(new String("여러분"));
		hs.add("1");
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.contains("여러분"));
		
//		hs.clear();
		System.out.println(hs.isEmpty());
		
		//java.util import
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
