package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String inputDate;
		System.out.println("���ڸ� �Է��Ͻÿ�");
		
		while(true) {
		inputDate = scanner.nextLine();
		System.out.println("�Էµ� ���ڿ�:\""+inputDate+"\"");
		if(inputDate.equals("q")){
			
			System.out.println("����Ǿ����ϴ�");
			
		}
		else 
			
			System.out.println("��� �Է��Ͻÿ�");
		
		
		
		
		 }
		}
		
		
		
		
		
		
	}


