package ch04;
import java.util.Scanner;

public class if_switchTEST4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����͸� ��������");
        int data  =sc.nextInt();
        
        int digit1 = data%10; //1�ڸ����� ���ϴ°�
        int digit10 = data/10; //10�ڸ����� ���ϴ°�
        
        int cnt =0;
        if(digit1%3==0 && digit1!=0)   cnt++;
       if(digit10%3 ==0 && digit10 !=0) cnt++;

       if(cnt ==2) System.out.println("�ڼ�¦¦");
       else if(cnt==1) System.out.println("�ڼ� ¦");
       else System.out.println("3,6,9 ���� �������� �ʴ���");
       
        
	

}

}