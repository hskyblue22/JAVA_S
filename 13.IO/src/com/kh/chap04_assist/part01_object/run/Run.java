package com.kh.chap04_assist.part01_object.run;

import com.kh.chap04_assist.part01_object.model.dao.ObjectsDao;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ObjectDao ob = new ObjectDao();
//		ob.fileSava();
//		ob.fildOpen();
		
		ObjectsDao ob = new ObjectsDao();
		ob.fileSave();
		ob.fileOpen();
	}

}
