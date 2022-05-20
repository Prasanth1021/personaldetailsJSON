package ConditionStatement;

public class Task12 {
	static void hourGlass() {
		for(int i=5; i<=1; i--) {
			for (int y=5-i; y<=1; y--) {
				System.out.print(" ");
			}
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		hourGlass();
	}
	}
