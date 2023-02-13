package Day01;

import java.util.Scanner;

public class Ex05_InputDouble {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x:");
		int x = sc.nextInt();
		
		System.out.print("y:");
		int y = sc.nextInt();
		
		System.out.print("z:");
		int z = sc.nextInt();

		int sum = x + y + z;
		double avg = (double) sum / 3;
/*
 * 자동형변환, 강제형변환 int + int = int int(4byte) + double(8byte) = double
 */
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		sc.close();

	}
}
