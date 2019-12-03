package main;

public class Iteration {

	public static void valueOfA() {

		int a = 100;
		while (a <= 200) {
			System.out.println("A");
			a++;
		}
	}

	public static void valueOfB() {

		int b = 100;
		while (b <= 200) {
			if (b % 2 == 0) {
				System.out.println("-");
				b++;
			} else {
				System.out.println("*");
				b++;
			}
		}
	}

	public static void printNumbers() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.println(i);
			}
		}
	}
	
	public static void valueOfC() {
		
		for (int c = 100; c<= 200; c++) {
			System.out.println("C");
		}
	}
	
	public static void valueOfD() {
		
		for (int d = 100; d <= 200; d++) {
			if (d % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}
	
	public static void printMixedNumbers() {
		for (int i = 0; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
	}
}

/*
 * 1. Refer to Appendix B, recreate this flowchart as a project.
 * 
 * 2. Refer to Appendix C, recreate this flowchart as a project.
 * 
 * 3. Create a method that can print out the numbers 1-10 10 times each.
 * 
 * 4. If you have used a while loop at any point in this exercise, replace them
 * with a for loop– remember that you should use a for loop when you know when
 * the iteration should end.
 * 
 * 5. Create a method to print the numbers 1 to 10 as many times as the value of
 * that number. For example, you will print ‘1’ one time, and ‘10’ ten times.
 */