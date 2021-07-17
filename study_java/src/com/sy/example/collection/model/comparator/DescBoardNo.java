package com.sy.example.collection.model.comparator;

import java.util.Comparator;
import com.sy.example.collection.model.vo.Board;

public class DescBoardNo implements Comparator<Board>{  //1.Comparator인터페이스 상속

//	public int compare(Object o1, Object o2) {  //2-0.제네릭스 없는 경우 -> 형변환 안해주려고 지정했음
//	// TODO Auto-generated method stub
//	return 0;
//} 
	
	@Override
	public int compare(Board o1, Board o2) {  //2-1.compare메소드 오버라이딩
		// TODO Auto-generated method stub
		return -(o1.getBoardNo()-o2.getBoardNo());  //o1<o2 -> -(음수) => 양수 => 내림차순
	}  
}
