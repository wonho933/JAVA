package ch04;
import java.util.Scanner;

public class if_switchTEST1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int grade = sc.nextInt();

		if (grade >= 90 && grade <= 99) {
			System.out.println("A��� �� ���Ͽ����ϴ�");

		}
		else if (grade >= 80 && grade <= 89) {
			System.out.println("B��� �� ���Ͽ����ϴ�");

		}
		else if (grade >= 70 && grade <= 79) {
			System.out.println("C��� �� �� ����ϼ���");

		}

		else if (grade >= 60 && grade <= 69) {
			System.out.println("D��� �� �� ����ϼ���");

		}

		else if (grade < 60) {
			System.out.println("F���� �����б⿡ �ٽ� �����ϼ���");

		}

	}

}
