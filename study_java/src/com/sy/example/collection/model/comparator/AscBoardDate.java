package com.sy.example.collection.model.comparator;

import java.util.Comparator;

import com.sy.example.collection.model.vo.Board;

public class AscBoardDate implements Comparator<Board>{

	@Override
	public int compare(Board o1, Board o2) {
		// TODO Auto-generated method stub
		return o1.getBoardDate().compareTo(o2.getBoardDate());
	}

}
