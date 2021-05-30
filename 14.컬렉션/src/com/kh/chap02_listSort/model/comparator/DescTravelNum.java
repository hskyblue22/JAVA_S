package com.kh.chap02_listSort.model.comparator;

import java.util.Comparator;

import com.kh.chap02_listSort.model.vo.Travel;

public class DescTravelNum implements Comparator<Travel>{

	@Override
	public int compare(Travel o1, Travel o2) {
		// TODO Auto-generated method stub
		return -(o1.gettNum() - o2.gettNum());
	}

}
