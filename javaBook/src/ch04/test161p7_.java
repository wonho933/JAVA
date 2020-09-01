package ch04;

import java.util.Scanner;

public class test161p7_ {

	public static void main(String[] args) {
		boolean run= true;
		int balance=0;
		Scanner scanner= new Scanner(System.in);
		
		
		while(run) {
		 
		 System.out.println("-----------------------------");
		 System.out.println("1.예금|2.출금|3.잔고|4.종료");
		 System.out.println("-----------------------------");
		 System.out.print("선택>");
		
		 int money=0;
		 String menu = scanner.next();

		 switch(menu) {
		 case "1" : System.out.print("예금액>>");
		 money = scanner.nextInt();
		 balance+=money;
		 break;
		 case "2" : System.out.print("출금액액>>");
		 money = scanner.nextInt();
		 balance-=money;
		 break;
		 case "3" : System.out.print(balance);
		 break;
		 case "4" : System.out.print("시스템종료");
		 run=false;
		 break;
		 
		 
	 }
	  
	 }
	 
	}
	
}
  

