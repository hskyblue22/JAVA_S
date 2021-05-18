package practice3.controller;

import java.util.Scanner;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		arr[0] = new Cat("츄츄", "스코티쉬폴드","크림집","갈색");
		arr[1] = new Dog("뭉이", "말티즈",4);
		arr[2] = new Cat("루루", "먼치킨","크림집","고등어색");
		arr[3] = new Cat("디디", "노르웨이숲","크림집","흰색");
		arr[4] = new Dog("츄", "시츄",3);
		
		for(Animal a : arr) {
			a.speak();
		}
		

	}

}
