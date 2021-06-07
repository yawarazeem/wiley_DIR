package com.yawar.animals;

public class Giraffe extends Animal {
	private String color;
	private int weight;
	private int age;
	private boolean veg;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	@Override
	public void isVegetarian() {
		// TODO Auto-generated method stub
		System.out.println("Vegetarian:"+veg);
	}

	@Override
	public void canClimb() {
		// TODO Auto-generated method stub
		System.out.println("I can not Climb!");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("My sound is Girrr!");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Color!"+color);
	}

	@Override
	public void weight() {
		// TODO Auto-generated method stub
		System.out.println("My weight is "+weight);
	}

	@Override
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("My age is"+age+"years!");
	
	
//	public String color = "orange";
//	public int weight = 1003;
//	public int age = 56;
//	Giraffe(){
//		System.out.println("Color of Giraffe is: "+ color);
//		System.out.println("Weight of Giraffe is: "+ weight);
//		System.out.println("Age of Giraffe is: "+ age);
//	}
//	public void isVeg() {
//		System.out.println("YES!");
//	}
//	public void canClimb() {
//		System.out.println("NO");
//	}
//	public void sound() {
//		System.out.println("GURRRRR");
	}

}
