package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [1859] �鸸 ���� ������Ʈ
 * ���ӵ� N�� ������ �ŸŰ��� ����
 * ���� �� �Ǹ��ؼ� ��� �ִ� ���� ���
 */


public class N1859 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt(); // test case �� �Է�
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			long sol = 0; // ���� ��
			long max = 0; // �� price�� �ִ� ����
			int predict_day = scan.nextInt(); // ������ �� �ִ� day
			int[] price = new int[predict_day];
			for (int day = 0; day < predict_day; day++) { // Input data �迭�� ����
				price[day] = scan.nextInt();
			}
			// ���� for���� �ٿ��� �� ��
			// time out �ߴ� �� ����
			for (int day = 0; day < predict_day; day++) {
				max = 0;
				for (int index = day+1; index < predict_day; index++) {
					if (max < (long)(price[index] - price[day])) max = (long)(price[index] - price[day]);
				}
				sol += max;
			}
			System.out.println("#" + test_case + " " + sol);
		}
		scan.close();
	}
}
