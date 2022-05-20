package ConditionStatement;

public class Task10 {
	static void table() {
		int k=2;
		for (int i=1; i<=4; i++) {
			for (int j=1;j<=4;j++) {
				System.out.print(k+ "\t");
				k=k+2;}
				System.out.println();
		}
}
	public static void main(String[] args) {
		table();
	}
}