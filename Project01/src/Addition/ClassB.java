package Addition;
import java.util.Scanner;

public class ClassB {
	
	public void print() {
		int a, b, sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		sum = a + b;
		System.out.println("The sum of the two number is: " + sum);
	}

}
