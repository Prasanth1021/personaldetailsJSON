package ConditionStatement;

public class task7 {
static void higherToLower() {
	for (int i=1; i<=3; i++) {
		for (int j=1;j<=i; j++)
			System.out.println(j+"");
		System.out.println();
	}
}
public static void main(String[] args) {
	higherToLower();
}
}
