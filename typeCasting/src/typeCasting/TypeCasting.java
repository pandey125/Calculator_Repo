package typeCasting;
import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		
		//byte x = 4;
		//int y = x;
		//System.out.println(y);
		
		//double myDouble = 3.412;
		
		//int myInt = (int)myDouble;
		
		//System.out.println(myDouble);
		
		//System.out.println(myInt);
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two number: ");
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		float data = (float)a;
		float ex = (float)b;
		
		System.out.println("The integer value: " + data);
		System.out.println("The integer value: " + ex);

	}

}
