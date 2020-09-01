package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		System.out.println("문자를 입력하시오");
		
		while(true) {
		inputDate = scanner.nextLine();
		System.out.println("입력된 문자열:\""+inputDate+"\"");
		if(inputDate.equals("q")){
			
			System.out.println("종료되었습니다");
			
		}
		else 
			
			System.out.println("계속 입력하시오");
		
		
		
		
		 }
		}
		
		
		
		
		
		
	}


