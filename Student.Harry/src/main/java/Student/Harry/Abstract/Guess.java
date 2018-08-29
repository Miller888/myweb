package Student.Harry.Abstract;

import java.util.Scanner;

public class Guess extends GuessGame {
	//最後決定使用文字輸出則實作以下Method
	@Override
	public void print(String text) {
		System.out.println(text);

	}

	@Override
	public int nextInt() {
		Scanner scanner = new Scanner(System.in);

		return scanner.nextInt();
	}

}
