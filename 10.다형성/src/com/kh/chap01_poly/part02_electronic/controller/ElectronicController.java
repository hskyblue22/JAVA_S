package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Notebook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicController {

	private Desktop desk;
	private Notebook note;
	private Tablet tab;
	
	
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(Notebook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	public Notebook selectNotebook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	
	
}
