package ConditionStatement;

public class Task5 {
	static void newB() {
		for (int i=5;i>=1;i--) {
			for (int j=1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		newB();
	}
}
