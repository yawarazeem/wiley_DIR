package com.yawar.main;
import com.yawar.worker.*;

	public class Main {

		public static void main(String []args) {
			Worker w = new Worker("Ishan",500);
			w.pay(3);
			DailyWorker dw = new DailyWorker("Yawar",300);
			dw.pay(4);
			SalariedWorker sw = new SalariedWorker("Zubair",3000);
			sw.pay(36);
		}
	}


