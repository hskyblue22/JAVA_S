package com.sy.chap03_search.practice.q7;

import java.util.Comparator;

public class VisionDesc implements Comparator<PhyscData> {

	@Override
	public int compare(PhyscData o1, PhyscData o2) {
		
		if(o1.getVision()-o2.getVision() > 0)
			return -1; 
		else if(o1.getVision() - o2.getVision() < 0)
			return 1;
		else
			return 0;
	}

	

}
