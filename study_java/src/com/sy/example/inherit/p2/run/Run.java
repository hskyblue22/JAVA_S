package com.sy.example.inherit.p2.run;

import com.sy.example.inherit.p2.model.vo.Circle;
import com.sy.example.inherit.p2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle[] cir = new Circle[2];
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		Rectangle[] rec = new Rectangle[2];
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== Circle =====");
		for(Circle c : cir) {
			c.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Rectangle r : rec) {
			r.draw();
		}
	}

}
