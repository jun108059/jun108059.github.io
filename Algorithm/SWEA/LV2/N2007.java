package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [2007] ���� ������ ����
 * �ݺ��Ǵ� �κ��� ���� -> ������ ���̸� ���
 */

public class N2007 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			String str = scan.next();
			for (int i = 1; i <= 10; i++) { // Input data �迭�� ����
				String pre = str.substring(0, i); // �տ��� �ΰ� ����
				String next = str.substring(i, i + i);
				if (pre.equals(next)) {
					System.out.println("#" + test_case + " " + pre.length());
					break;
				}
				if (i == 1) { // ���� �� ���� ��� ����ó��
					pre = str.substring(0, 1);
					next = str.substring(1, 2);
					if (pre.equals(next)) {
						System.out.println("#" + test_case + " " + "1");
						break;
					}
				}
			}
		}
		scan.close();
	}
}

