package com.kh.chapr01_list.part02_list.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chapr01_list.part02_list.model.vo.Music;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//제네릭스<> 사용이유 
		//1.명시된 타입의 객체만 저장하도록 제한을 두기위해
		//2. 컬렉션에 저장된 객체를 꺼내서 사용할 때 형변환하는 절차를 없애기 위해서
		
		//E -> Element : 리스트에 담길 요소(객체)
		//클래스만 가능한가?
		ArrayList<Music> alist = new ArrayList<Music>(3);  //크기제약이 없다! -> 장점
		
		//1.add(E e) : 리스트의 끝에 인스턴스 데이터를 추가하는 메소드(내부적으로 사이즈 검사한 후 수용가능한 범위이면 추가되고 넘어가면 알아서 사이즈를 늘려주고 추가함)
		alist.add(new Music("Good bye","박효신"));
		alist.add(new Music("내손을잡아","아이유"));
		alist.add(new Music("Butter","방탄"));
		//list.add("끝"); -> 제네릭스 <>사용으로 여기서는 명시된 객체만!!
		
		System.out.println(alist);
//		System.out.println(list.toString()); --> 오버라이딩해서 결과 같다.
	
		//2.add(int index, E e) : 인덱스를 지정하여 해당 인덱스에 인스턴스 추가하는 메소드
		alist.add(1, new Music("체념","정상동기"));  //크기제약이 없이 추가 가능
		System.out.println(alist);
		
		//3.set(int index, E e) : 해당인덱스의 값을 E로 변경
		alist.set(0, new Music("상상더하기","MSG"));
		System.out.println(alist);
		
		
		//4.size() : 리스트안에 몇 개의 데이터가 있는지
		System.out.println(alist.size());
		
		//5.remove(int index) : 해당 인덱스의 인스턴스 삭제(알아서 크기 줄여주고 땡겨줌)
//		list.remove(1);
		//동등객체 : 주소값 같다. 
		//동일객체 : 값은 같지만 주소값은 다르다. -> equals와 hashcode를 재정의해서 동일객체로 만들어줘야 함
		//String에서는 재정의되어있어서 할 필요가 없었다.
		alist.remove(new Music("체념","정상동기")); //-> 삭제안됨 -> hashcode,equals 오버라이딩해줘야 함
		System.out.println("삭제 후 :" +alist);
		
		
		//6.get(int index) : 해당 인덱스의 인스턴스 가져오기
		System.out.println(alist.get(0));  //list의 0번째 데이터 반환(자료형 : Music)
		System.out.println(alist.get(0).getTitle());
		
		
		//7.subList(int index1, int index2) : 추출해서 새로운 List로 반환 - index1: inclusive / index2: exclusive
		List sub = alist.subList(0, 2);
		
		System.out.println("sub : " + sub);
		
		
		//8.addAll (Collection c) : 컬렉션을 통채로 뒤에 추가하는 메소드
		alist.addAll(sub);
		System.out.println(alist);
		System.out.println(alist.size());
	}
	
	

}
