package com.yawar.cd;




import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



public class CDMain {

	public static void main(String[] args) {
		
		Set<CDClass> cd =new TreeSet<CDClass>();
			
		
		cd.add(new CDClass(101, "PERFECT", "ED SHERAAN"));
		cd.add(new CDClass(102, "South of the border", "Camela"));
		cd.add(new CDClass(103, "Future Nostalgia", "Dua Lipa"));
		cd.add(new CDClass(104, "7", "BTS"));
		cd.add(new CDClass(105, "Folklore", "Taylor Swift"));
		cd.add(new CDClass(106, "More Life", "Drake"));
		cd.add(new CDClass(107, "Heartbreak Weather", "Niall Horan"));
		cd.add(new CDClass(108, "24K Magic", "Bruno Mars"));
		

		
		System.out.println("Size of mySet : "+cd.size());
		
		Iterator<CDClass> iterator=cd.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	
	}
}