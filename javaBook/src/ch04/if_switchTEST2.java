package ch04;
import java.time.LocalDate;
import java.util.Scanner;

public class if_switchTEST2 {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);	
	System.out.println("�����͸� �����ÿ�");	
	int x= sc.nextInt();
	int y= sc.nextInt();
	
	if(x<50 &&x<=100 && y>=50&& y<=100 ) {
    System.out.println("�簢���ȿ� ���� �ս��ϴ�");

	}
	else
	{
   System.out.println("�簢�� �ۿ� ���� �ֽ��ϴ�");
   
	}
}

}