package ch04;
import java.util.Scanner;

public class if_switchTEST3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터입력");
		int year =sc.nextInt();
		
		if(year %4 ==0 && year%100!=0 |year%400==0) {
	    System.out.println("윤년");
	    
		
		}
	}

}
