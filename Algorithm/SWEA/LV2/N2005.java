package lv2;

import java.util.Scanner;

/* 19.08.19
 * SW Expert Academy
 * [2005] �Ľ�Į�� �ﰢ��
 * �������, ������� �� ��µǴ� �ﰢ��
 */

public class N2005 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		for (int test_case = 1; test_case <= test; test_case++) { // test case ��ŭ Loop
			int line = scan.nextInt();
			System.out.println("#" + test_case);
			int size = 0;
			// ������ �����ֱ�
			
			for (int i=1; i<=line; i++) {
				size += i;
			}
			int [] paskal = new int[size];
			int count = 0;
			// line ���� �ڸ� 1�� �ʱ�ȭ
			for (int num_one = 0; num_one<paskal.length;) {
				count++;
				paskal[num_one] = 1;
				num_one += count;
			}
			// line �� �ڸ� 1�� �ʱ�ȭ
			count = 2;
			for (int num_one = 2; num_one<paskal.length;) {
				count++;
				paskal[num_one] = 1;
				num_one += count;
			}
			count = 3;
			int new_count = 3;
			// ��� ä���
			for (int num_one = 4; num_one<paskal.length;) {
				int k = count;
				do{
					paskal[num_one] = paskal[num_one-new_count] + paskal[num_one-new_count+1];
					num_one++;
					k--;
				}while(!(k == 2));
				num_one = num_one+2;
				if (num_one >= paskal.length) {
					break;
				}
				paskal[num_one] = paskal[num_one-new_count] + paskal[num_one-new_count+1];
				new_count++;
				count++;
			}
			int line_count = 1;
			int num_count = 1;
			// �Ľ�Į �ﰢ�� ����Ʈ ���
			for (int i = 0; i<paskal.length; i++) {
				System.out.print(paskal[i] + " ");
				if (line_count == num_count) {
					System.out.println();
					line_count++;
					num_count = 0;
				}
				num_count++;
			}
		}
		scan.close();
	}
}
