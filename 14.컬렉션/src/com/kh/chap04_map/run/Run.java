package com.kh.chap04_map.run;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04_map.model.vo.Student;

public class Run {
	
	private HashMap<String,Student> stdMap = new HashMap<>();
	
	/*
	 * Map :
	 * 데이터를 저장할때 각각의 자료를 구분지을수 있는 고유의 값을 정하여 해당값으로 접근할수 있는 실제 객체를 묶어 함꼐 관리하는 자료 구조 클래스.
	 * 해당객체를 저장할때 key(고유의값 ) 은 set 의 특성으로 value(실제객체)는 List 의 특성으로 관리한다. 
	 * 종류는 크게 HashMap, HashTable(예전버전 -HashMap과 동일 스레드세이프가있다 ), TreeMap, Properties 등이 있다. 
	 * 
	 * - map은 key와 value로 구분되어 있고 이걸 로그인 할 때 ID와 PWD처럼 생각하면 편하다.
	 *   (ID는 중복 불가능, 즉 Set과 관련이 있음을 알 수 있다.)
	 *   
	 * - key와 value를 묶어서 Entry라고 한다.
	 * 
	 * - key값은 보통 String으로 하는데, 이유는 int를 쓰면 ArrayList와 차이가 없기 때문이다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Run m = new Run();
		m.test1();
	}

	private void test1() {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		map.put(1, "a");
		map.put(3, "4");
		map.put(22, "6");
		map.put(4, "22");
		
		System.out.println(map);  //순서보장안됨
		
		stdMap.put("커피", new Student(1,"최선호"));
		stdMap.put("도넛", new Student(2,"권민지"));
		stdMap.put("라면", new Student(3,"박서형"));
		
		System.out.println("덮어쓰기 전 :"+stdMap);
		
		//key는 중복되지 않는 set
		//뒤에 추가되는 값이 기존의 값을 덮어쓴다.
		stdMap.put("커피", new Student(1,"홍영은"));
		System.out.println("같은 키값으로 덮어쓰기 후 :"+stdMap);
		
		//value는 중복이 되도 상관없다.
		stdMap.put("젤리", new Student(1,"홍영은"));
		System.out.println("같은 value으로 덮어쓰기 후 :"+stdMap);
		
		//value 뽑기
		Student s= stdMap.get("커피");
		System.out.println("커피로 검색한 학생 : "+ s);
		
		
		Student removed = stdMap.remove("커피");
		System.out.println("삭제된 학생 "+removed);
		
		
		
		//1.keySet
		//value 을 알고자할때 Set인 키들을 뽑아와서 Set형에 담아서 출력
		//key값을 set<String>으로 만들어서 iterator로 뽑는다.
		
		
		System.out.println("=============key===============");
		
		Set<String> kset = stdMap.keySet();  //stdMap에 있는 key들만 keySet컬렉션에 담았다. set으로 반환 
		
		Iterator<String> iter = kset.iterator();  //keySet에 있는 key값들을 Iterator반복자에 담는 과정
		
		while(iter.hasNext()) {
			String key = iter.next();  //있으면 키를 담고
			Student val = stdMap.get(key); //키로 값을 얻어온다.
			
			
			System.out.println(key + "    " + val);
		}
		
		
		//2.values메소드 사용(값만 뽑기)
		System.out.println("=============collection===============");
		Collection values = stdMap.values();
		
		Iterator iter1 = values.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		
		//3.EntrySet
		//key와 value를 같이 얻어오고자 할때 Map의 내부인터페이스 안 Entry타입을 이용
		//key와  value를 묶어서 Entry
		//entrySet : Map.Entry의 모음
		
		System.out.println("=============Entry===============");

		Set<Entry<String, Student>> eSet1 = stdMap.entrySet();  //stdMap에 있는 키와 밸류값 세트로 eSet컬렉션에 담는 과정(키와밸류 세트의 집합)
		
		Iterator<Entry<String, Student>> it1 = eSet1.iterator();  //eSet에 있는 키와 밸류값 세트로 Iterator에 담는 과정
		
		while(it1.hasNext()) {
			Entry<String,Student> entry = it1.next();  //(Entry)안해도 되지 않나?
			System.out.println(entry.getKey() + " = "+entry.getValue());
		}
		
		
	}

}
