package ch04;

import java.util.Scanner;

public class test161p7_ {

	public static void main(String[] args) {
		boolean run= true;
		int balance=0;
		Scanner scanner= new Scanner(System.in);
		
		
		while(run) {
		 
		 System.out.println("-----------------------------");
		 System.out.println("1.����|2.���|3.�ܰ�|4.����");
		 System.out.println("-----------------------------");
		 System.out.print("����>");
		
		 int money=0;
		 String menu = scanner.next();

		 switch(menu) {
		 case "1" : System.out.print("���ݾ�>>");
		 money = scanner.nextInt();
		 balance+=money;
		 break;
		 case "2" : System.out.print("��ݾ׾�>>");
		 money = scanner.nextInt();
		 balance-=money;
		 break;
		 case "3" : System.out.print(balance);
		 break;
		 case "4" : System.out.print("�ý�������");
		 run=false;
		 break;
		 
		 
	 }
	  
	 }
	 
	}
	
}
  

