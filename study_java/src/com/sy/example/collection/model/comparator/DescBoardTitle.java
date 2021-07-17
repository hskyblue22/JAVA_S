package com.sy.example.collection.model.comparator;

import java.util.Comparator;

import com.sy.example.collection.model.vo.Board;

public class DescBoardTitle implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		
		if(o1.getBoardTitle().compareTo(o2.getBoardTitle()) > 0) {  //f , h경우 "음수"
			return -1;
		}
		return 1;  //양수 반환 -> 내림차순
	}
	
}
