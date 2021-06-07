package com.yawar.zoo;

import com.yawar.animals.*;

public class VandalurZoo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lions Details");
		Lion lion=new Lion();
		lion.setAge(35);
		lion.setColor("Yellow");
		lion.setVeg(false);
		lion.setWeight(200);
		lion.sound();
		lion.isVegetarian();
		lion.canClimb();
		lion.age();
		lion.weight();
		lion.color();
		System.out.println("-----------------------------------------------");
		
		System.out.println("Tiger Details");
		Tiger tiger=new Tiger();
		tiger.setAge(30);
		tiger.setColor("Organe-Black strips");
		tiger.setVeg(false);
		tiger.setWeight(250);
		tiger.sound();
		tiger.isVegetarian();
		tiger.canClimb();
		tiger.age();
		tiger.weight();
		tiger.color();
		
		System.out.println("-----------------------------------------------");
		
//		System.out.println("Elephant Details");
//		Elephant ele=new Elephant();
//		ele.setAge(25);
//		ele.setColor("Grey");
//		ele.setVeg(true);
//		ele.setWeight(800);
//		ele.sound();
//		ele.isVegetarian();
//		ele.canClimb();
//		ele.age();
//		ele.weight();
//		ele.color();
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Girafee Details");
		Giraffe gif=new Giraffe();
		gif.setAge(20);
		gif.setColor("Yellow with black dots");
		gif.setVeg(true);
		gif.setWeight(500);
		gif.sound();
		gif.isVegetarian();
		gif.canClimb();
		gif.age();
		gif.weight();
		gif.color();
		
		System.out.println("-----------------------------------------------");
		
		System.out.println("Monkey Details");
		Monkey monkey=new Monkey();
		monkey.setAge(10);
		monkey.setColor("Brown");
		monkey.setVeg(true);
		monkey.setWeight(40);
		monkey.sound();
		monkey.isVegetarian();
		monkey.canClimb();
		monkey.age();
		monkey.weight();
		monkey.color();
		
//	public static void main(String[]args) {
//		Deer deer = new Deer();
//		Elephant e = new Elephant();
//		Giraffe g = new Giraffe();
//		Lion l = new Lion();
//		Monkey m = new Monkey();
//		Tiger t = new Tiger();
////		deer.isVeg();
////		deer.sound();
////		deer.canClimb();
	}
	

	
	

}
