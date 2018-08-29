package Java_SE.Student.Harry.Super;

public class Role {
	String name = "Player";
	int level = 1;
	int hp = 50;

	public String toString() {
		return String.format("%s,%d,%d", this.name, this.level, this.hp);
	}
}
