package com.yawar.main;


import java.util.Scanner;

import com.yawar.info.Eggs;

public class Main {
	public static void main(String[]args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of Eggs:");
	int N = sc.nextInt();
	Eggs egg = new Eggs(N);
	egg.setNumber(N);
	egg.display();
	}

}