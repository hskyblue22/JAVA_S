package com.sy.example.object.static1.controller;

public class StaticSample {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void toUpper() {
		value = value.toUpperCase();
	}
	
	public void setChar(int index, char c) {
		String str = "";
		for(int i=0; i<value.length(); i++) {
			if(i == index) {
				str += c;
				continue;
			}
			str += value.charAt(i);  //char -> string
		}
		value = str;
	}
	//아래 방법도 가능
	//str += Character.toString(c);
	
	public int valueLength() {
		return value.length();
	}
	
	public String valueConcat(String str) {
		return value.concat(str);
	}
}
