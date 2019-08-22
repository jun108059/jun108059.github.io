package lv2;

import java.util.Scanner;

/* 19.08.14
 * SW Expert Academy
 * [1976] �ð� ����
 * �� ������ �̷���� �ð��� 2�� �Է� �޾�, ���� ���� �� ������ ����ϴ� ���α׷��� �ۼ��϶�.
 * (�ð��� 12�ð����� ǥ���Ѵ�. ��, �ð� ���� �� �ִ� ���� 1�ú��� 12���̴�.)
 */

public class N1976 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();				// test case �� �Է�

		for (int test_case = 1; test_case < test+1; test_case++) { // test case ��ŭ Loop
			int first_H = scan.nextInt();
			int first_M = scan.nextInt();
			int second_H = scan.nextInt();
			int second_M = scan.nextInt();
			
			int sum_H = first_H + second_H;
			int sum_M = first_M + second_M;
			
			
			if (sum_M >= 60) {
				sum_H++;
				sum_M -= 60; 
			}
			if (sum_H >= 13) {
				sum_H -= 12;
			}
			System.out.println("#" + test_case + " " + sum_H + " " + sum_M);
		}
	}
}
