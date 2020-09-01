package ch02;

public class QStopExample {

	public static void main(String[] args) throws Exception {

		int keyCode;
		System.out.println("코드값을 입력하시오");

		while (true) {

			keyCode = System.in.read();
			System.out.println("keyCode:" + keyCode);
			if (keyCode == 113) {
            break;
			}
			

		}
		System.out.println("종료");
	}

}
