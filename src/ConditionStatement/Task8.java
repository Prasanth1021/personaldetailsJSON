package ConditionStatement;

public class Task8 {
	static void maxToMini() {
		for(int i=1; i<=5; i++) {
			for (int j=1; j<=5-i; j++)
			System.out.println(j);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		maxToMini();
	}
}
