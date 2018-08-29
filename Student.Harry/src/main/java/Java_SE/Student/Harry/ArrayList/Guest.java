package Java_SE.Student.Harry.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Guest {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();
		collectNameTo(names);

		System.out.println("訪客名單: ");
		printUpperCase(names);
	}

	static void collectNameTo(ArrayList names) {
		Scanner console = new Scanner(System.in);
		while (true) {
			System.out.println("訪客名稱:");
			String name = console.nextLine();
			if (name.equals("quit")) {
				break;
			}
			names.add(name);
		}
	}

	static void printUpperCase(ArrayList names) {
		for (int i = 0; i < names.size(); i++) {
			int id=i+1;
			String name = (String) names.get(i);
			System.out.println("您輸入的第" + id  + "名訪客為: " + name.toUpperCase());
		}
	}
}
