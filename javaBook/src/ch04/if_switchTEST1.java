package ch04;
import java.util.Scanner;

public class if_switchTEST1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = sc.nextInt();

		if (grade >= 90 && grade <= 99) {
			System.out.println("A등급 참 잘하였습니다");

		}
		else if (grade >= 80 && grade <= 89) {
			System.out.println("B등급 참 잘하였습니다");

		}
		else if (grade >= 70 && grade <= 79) {
			System.out.println("C등급 좀 더 노력하세요");

		}

		else if (grade >= 60 && grade <= 69) {
			System.out.println("D등급 좀 더 노력하세요");

		}

		else if (grade < 60) {
			System.out.println("F학점 다음학기에 다시 수강하세요");

		}

	}

}
