package com.kh.chap03_set.part02_treeset.run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap03_set.part02_treeset.model.dao.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add(new String("하하하"));
		ts.add(new String("나나나"));
		ts.add(new String("가가가"));
		ts.add(new String("다다다"));
		ts.add(new String("하하하"));
		
		System.out.println(ts);
		
		TreeSet<Student> ts2 = new TreeSet<>();
		ts2.add(new Student("서연",20,100));
		ts2.add(new Student("민지",22,90));
		ts2.add(new Student("로운",25,30));
		ts2.add(new Student("서연",20,100));
		
		System.out.println(ts2);  
		//오류난다 -> Student에 implements Comparable<Student> 추가
		//Student에 compareTo(Student o)재정의 - 이름으로 정렬
		
		/*TreeSet의 경우는 hashCode(),equals()를 가지고 중복판단을 하지않고 
		 * comparable()에 지시한 정렬필드가 같은 경우 동일객체로 판단
		 */
		
		
		
		//1.for each문으로 출력
		for(Student st : ts2) {
			System.out.println(st);
		}
		
		//2.ArrayList에 담아서 출력 <- ts2
		ArrayList<Student> a1 = new ArrayList<>(ts2);
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		
		//3.Iterator로 출력
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator it2 = ts2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it2.next());
		}
		
	}

}
