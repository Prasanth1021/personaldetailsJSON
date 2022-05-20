package ConditionStatement;

public class Task11 {
static void pyramidTask() {
	for (int i=1; i<=3; i++) {
		for (int j=3; j>=i; j--) {
			System.out.print("\t");
		}
		for (int  k=1; k<=i; k++) {
			System.out.print("1" +"\t\t");
		}
		System.out.println();
	}

}
public static void main(String[] args) {
	pyramidTask();
}
}
