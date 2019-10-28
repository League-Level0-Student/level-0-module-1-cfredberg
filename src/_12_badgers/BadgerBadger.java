package _12_badgers;

public class BadgerBadger {
	public static void main(String[] args) {
		String b = "badger";
		String s = "snake";
		String m = "mushroom";
		for (int i = 0; i < 4; i++) {
			System.out.println(b + ", " + b + ", " + b + ", " + b + ", " + b);
			System.out.println(b + ", " + b + ", " + b + ", " + b + ", " + b);
			if (i < 3) {
				System.out.println(m + ", " + m + ", a-");
			} else {
				System.out.println("argh! " + s + ", a " + s + "!");
			}
		}
	}
}
