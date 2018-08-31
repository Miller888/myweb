package Student.Harry.Date;

import java.time.LocalDate;
import java.time.chrono.MinguoDate;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import java.util.Date;

public class test {
	// New function from Java 8
	public static void main(String[] args) {
		MinguoDate mingo = MinguoDate.now();
		System.out.println(mingo);
		JapaneseDate jp = JapaneseDate.now();
		System.out.println(jp);
		ThaiBuddhistDate thai = ThaiBuddhistDate.now();
		System.out.println(thai);

	}

}
