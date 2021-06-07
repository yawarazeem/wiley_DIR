package com.yawar.employee;
import java.util.*; 
public class MainEmployee {
	public static void main(String[]args) {
//		Collection<Employee> employees=new Collection<Employee>();
		Employee  emp = new Employee();
        Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number of employees ");
		int number = sc.nextInt();
		Operations obj = new Operations(number);
	   try {	
		
	
		for(int index=0;index<number;index++) {
			System.out.println("Enter Employee name : ");
			String name=sc.next();
			int isSame = obj.authentication(name, index);
//			System.out.println(isSame);
			
			if(isSame==1) {
				throw new Exception("Employee already exists!");
			}
			System.out.println("Enter Age");
			int age =sc.nextInt();
			
			
			if(age<18 || age> 60 ) {
				throw new Exception("Age not in range!");
				
			}
			Employee st=new Employee(index, name, age);
			
			obj.addEmp(st);
		}
	}
		
		catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
			System.exit(0);
			
		}
	
    
	for(int index=0;index<number;index++) {
			Employee st=   obj.getEmps(index);
			System.out.println(st);
		}
	
		
	}

	
	
	

}
