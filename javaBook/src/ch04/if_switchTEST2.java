package ch04;
import java.time.LocalDate;
import java.util.Scanner;

public class if_switchTEST2 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);	
	System.out.println("데이터를 넣으시오");	
	int x= sc.nextInt();
	int y= sc.nextInt();
	
	if(x<50 &&x<=100 && y>=50&& y<=100 ) {
    System.out.println("사각형안에 점이 잇습니다");

	}
	else
	{
   System.out.println("사각형 밖에 점이 있습니다");
   
	}
}

}