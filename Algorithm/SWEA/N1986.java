package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1986] ������� ����
 * 1���� N������ ���ڿ��� Ȧ���� ���ϰ� ¦���� ���� �� ���� ������ ��
 */
public class N1986 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			int number = scan.nextInt();
			int sol = 0;
			for(int i = 1; i <= number; i++) {
				if(i%2 == 0) { // ¦�� �� ��� ����
					sol -= i;
				}
				else {
					sol += i;
				}
			}
			System.out.println("#" + test_case + " " + sol);
		}
		
		scan.close();
	}
}
