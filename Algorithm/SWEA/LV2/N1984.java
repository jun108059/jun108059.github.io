package lv2;

import java.util.Scanner;

/* 19.08.20
 * SW Expert Academy
 * [1984] �߰� ��հ� ���ϱ�
 * 10���� ���� �Է� �޾�, �ִ� ���� �ּ� ���� ������ 
 * �������� ��հ��� ����ϴ� ���α׷�
 */

// sort -> ù��° ������ �迭 ������ ������ ���
public class N1984 {
	static final int input_num = 10;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			int [] num_arr = new int[input_num];
			for (int i = 0; i < input_num; i++) {
				num_arr[i] = scan.nextInt(); // �迭�� ���� �ֱ�
			}
			// sorting
			for (int i = 0; i < num_arr.length; i++) {
				int temp = 0;
				for (int k = i; k < num_arr.length; k++) {
					if (num_arr[i] > num_arr[k]) {
						temp = num_arr[k];
						num_arr[k] = num_arr[i];
						num_arr[i] = temp;
					}
				}
			}
			// �ִ� �ּ� ������ ��� ���ϱ�
			double sol = 0;
			for (int i = 1; i < num_arr.length-1; i++) {
				sol += (double)num_arr[i];
			}
			sol = sol/8;
			System.out.println("#" + test_case + " " + Math.round(sol));
		}
		scan.close();
	}
}
