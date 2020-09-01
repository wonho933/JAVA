package ch04;
import java.util.Scanner;

public class if_switchTEST4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("데이터를 넣으세요");
        int data  =sc.nextInt();
        
        int digit1 = data%10; //1자리수를 구하는거
        int digit10 = data/10; //10자리수를 구하는거
        
        int cnt =0;
        if(digit1%3==0 && digit1!=0)   cnt++;
       if(digit10%3 ==0 && digit10 !=0) cnt++;

       if(cnt ==2) System.out.println("박수짝짝");
       else if(cnt==1) System.out.println("박수 짝");
       else System.out.println("3,6,9 숫자 포함하지 않느다");
       
        
	

}

}