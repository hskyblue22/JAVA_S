package com.sy.example.io.run;

import java.util.Calendar;

import com.sy.example.io.controller.BookManager;
import com.sy.example.io.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookManager bm = new BookManager();
		bm.fileSave();
		bm.fileRead();

	}

}
