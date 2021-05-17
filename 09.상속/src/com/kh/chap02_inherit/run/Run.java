package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리",12.5,"sedan",4);
		Airplane a = new Airplane("비행기",0.021,"제트기",16,5);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		
		System.out.println(c.information());
		System.out.println(a.information());
		System.out.println(s.information());
		
		//재정의
		c.howToMove();
		a.howToMove();
		s.howToMove();

	}

}
